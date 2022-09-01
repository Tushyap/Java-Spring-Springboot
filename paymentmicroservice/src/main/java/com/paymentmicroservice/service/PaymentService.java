package com.paymentmicroservice.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.paymentmicroservice.entity.Payment;
import com.paymentmicroservice.repository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository paymentRepo;
	
	public Payment doPayment(Payment payment) {
		//check payment is success
        payment.setPaymentStatus(paymentProcessing());
		payment.setTransactionId(UUID.randomUUID().toString());
		return paymentRepo.save(payment);
	}
		
	public String paymentProcessing() {
		
		return new Random().nextBoolean()?"success":"false";
	}
	
	public Payment findPaymentHistoryByOrderId(int orderId) {
		return paymentRepo.findByOrderId(orderId);
	}
}
