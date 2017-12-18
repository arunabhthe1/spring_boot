package com.dash.dashserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello/server")
public class ServcerResource {

	
	 @GetMapping
	    public Integer hello() {
	        return 1;
	    }
}
