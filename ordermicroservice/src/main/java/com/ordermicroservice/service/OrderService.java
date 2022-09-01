package com.ordermicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ordermicroservice.common.Payment;
import com.ordermicroservice.common.TransactionResponse;
import com.ordermicroservice.common.Transactiononrequest;
import com.ordermicroservice.entity.Order;
import com.ordermicroservice.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepo;
	
	@Autowired
	private RestTemplate template;
	
	public TransactionResponse saveOrder(Transactiononrequest request) {
		String response="";
		Order order= request.getOrder();
		Payment payment = request.getPayment();
		payment.setOrderId(order.getOrderId());
		payment.setAmount(order.getPrice());
		
		Payment paymentResponse = template.postForObject("http://payment-service/payment/dotranx", payment, Payment.class);
		orderRepo.save(order);
		response= paymentResponse.getPaymentStatus().equals("success")?"payment processing successfully and order placed":"there is failure in payment";
	   
	    return new TransactionResponse(order, paymentResponse.getAmount(),paymentResponse.getTransactionId(),response);
	}
}
