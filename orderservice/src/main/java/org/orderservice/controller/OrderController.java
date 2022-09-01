package org.orderservice.controller;

import java.util.List;

import org.orderservice.model.Order;
import org.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	
	@RequestMapping("/product/{pId}")	
	public List<Order> getOrder(@PathVariable("pId") Long pId){
		return this.orderService.getOrder(pId);
	}
	

}
