package com.paymentmicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paymentmicroservice.entity.Payment;
import com.paymentmicroservice.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	
	@PostMapping("/dotranx")
	public ResponseEntity<Payment> savePaymentData(@RequestBody Payment payment){
		return new ResponseEntity<Payment>(paymentService.doPayment(payment), HttpStatus.CREATED);
	}

	@GetMapping("/{orderId}")
	public Payment findPaymentByOrderId(@PathVariable("orderId") int orderId) {
		return paymentService.findPaymentHistoryByOrderId(orderId);
	}
	
}
