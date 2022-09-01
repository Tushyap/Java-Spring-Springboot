package org.orderservice.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;
import org.orderservice.model.Order;
import org.orderservice.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{

	
	List<Order> list=List.of(
			new Order (1L, "Lenovo", "8GB Ram",112L ),
			new Order (2L, "MacBook Air", "Be in your limits",112L ),
			new Order (3L, "Iphone", "Aford but not needed",114L )
		);

	public List<Order> getOrder(Long pId){
		return list.stream()
				.filter( order -> order.getpId().equals(pId))
				.collect(Collectors.toList());
	}

}
