package com.dash.dashclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/hello/client")
public class ClientResource {

    @Autowired
    private RestTemplate restTemplate;


   
    @GetMapping
    public Integer hello() {
        String url = "http://dash-discovery-server/rest/hello/server";
        System.out.println("This is the client method");
        Integer returnObj=restTemplate.getForObject(url, Integer.class);
        return returnObj;
    }
}
