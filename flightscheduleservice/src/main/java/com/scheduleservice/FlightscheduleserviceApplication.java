package com.scheduleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

// Main application
@SpringBootApplication
public class FlightscheduleserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightscheduleserviceApplication.class, args);
	}

	// Indicates that a method produces a bean to be managed by the Spring container.
	@Bean
	@LoadBalanced
    RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
