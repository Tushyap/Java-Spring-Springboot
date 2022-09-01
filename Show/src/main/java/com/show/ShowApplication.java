package com.show;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ShowApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShowApplication.class, args);
	}

	@Bean //Indicates that a method produces a bean to be managed by the Spring container.
    RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
