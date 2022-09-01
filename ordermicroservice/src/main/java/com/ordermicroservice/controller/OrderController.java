package com.ordermicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ordermicroservice.common.TransactionResponse;
import com.ordermicroservice.common.Transactiononrequest;
import com.ordermicroservice.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;

	@PostMapping("/bookorder")
    public TransactionResponse bookOrder(@RequestBody Transactiononrequest request) {		
		return orderService.saveOrder(request);
	}

}
