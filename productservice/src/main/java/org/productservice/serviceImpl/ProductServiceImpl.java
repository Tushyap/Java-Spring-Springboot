package org.productservice.serviceImpl;

import java.util.List;

import org.productservice.model.Product;
import org.productservice.service.ProductService;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService{

	List<Product> list = List.of(
			new Product(112L,"Lenovo","anything",788.9,null),
			new Product(113L,"iPhone","anything",12888.0,null),
			new Product(114L,"Acer","anything",78766.0,null)
			);
	
	@Override
	public Product getProduct(Long id) {
		return list.stream().filter(product->product.getpId().equals(id)).findAny().orElse(null);
	}

}
