package org.productservice.controller;

import java.util.List;

import org.productservice.model.Product;
import org.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService  productService;

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{pId}")
	public Product getUser(@PathVariable("pId") long  pId) {
		
		Product product =this.productService.getProduct(pId);
		
		List orders = this.restTemplate.getForObject("http://order-service/order/product/"+product.getpId(),List.class);
		product.setOrders(orders);
		return product;
		
	}
}
