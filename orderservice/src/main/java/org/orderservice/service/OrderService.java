package org.orderservice.service;

import java.util.List;

import org.orderservice.model.Order;

public interface OrderService {

	public List<Order> getOrder(Long orId);
}
