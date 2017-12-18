package com.dash.dashserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//@EnableDiscoveryClient marks this as a discovery client 
@EnableDiscoveryClient
@SpringBootApplication
public class DashServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DashServerApplication.class, args);
	}
}
