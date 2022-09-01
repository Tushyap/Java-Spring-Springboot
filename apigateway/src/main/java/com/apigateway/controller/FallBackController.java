package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FallBackController {

	@GetMapping("/productServiceFallback")
	public Mono<String> productServiceFallback() {
		return Mono.just("Product service is down at this time");
	}
	
	@GetMapping("/orderServiceFallback")
	public Mono<String> orderServiceFallback() {
		return Mono.just("Order service is down at this time");
	}
	
	@GetMapping("/airportServiceFallback")
	public Mono<String> airportServiceFallback() {
		return Mono.just("Airport service is down at this time");
	}
	
	@GetMapping("/scheduleServiceFallback")
	public Mono<String> scheduleServiceFallback() {
		return Mono.just("Schedule service is down at this time");
	}
	
	@GetMapping("/seatServiceFallback")
	public Mono<String> seatServiceFallback() {
		return Mono.just("Seat service is down at this time");
	}
	
	@GetMapping("/movieServiceFallback")
	public Mono<String> movieServiceFallback() {
		return Mono.just("Movie service is down at this time");
	}
	@GetMapping("/showServiceFallback")
	public Mono<String> showServiceFallback() {
		return Mono.just("Show service is down at this time");
	}
	@GetMapping("/screenServiceFallback")
	public Mono<String> screenServiceFallback() {
		return Mono.just("Screen service is down at this time");
	}
	@GetMapping("/theaterServiceFallback")
	public Mono<String> theaterServiceFallback() {
		return Mono.just("Theater service is down at this time");
	}
	
	@GetMapping("/bookingServiceFallback")
	public Mono<String> bookingServiceFallback() {
		return Mono.just("Booking service is down at this time");
	}
	
	@GetMapping("/ticketServiceFallback")
	public Mono<String> ticketServiceFallback() {
		return Mono.just("Ticket service is down at this time");
	}
	
	@GetMapping("/customerServiceFallback")
	public Mono<String> customerServiceFallback() {
		return Mono.just("Customer service is down at this time");
	}
}
