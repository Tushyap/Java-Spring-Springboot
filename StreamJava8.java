package java8Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// product class
class Product{
	int id;
	String name;
	float price;
	
	// constructor
	public Product(int id, String name, float price) {
		
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}

public class StreamJava8 {

	public static void main(String[] args) {
		// create a list
		List<Product> productList = new ArrayList<Product>();
		
		// add elements to the list
		productList.add(new Product(104, "Jeans", 2000));
		productList.add(new Product(103, "shirt", 1000));
		productList.add(new Product(105, "Jacket", 3000));
		productList.add(new Product(106, "tshirt", 1200));
		
		// filter the price using for loop
		for(Product product : productList) {
			if(product.price<3000) {
				System.out.println("Price below 3000: "+ product.price );
			}
		}
		
		// implementing  stream
		List<Float> proList = productList.stream().filter(p -> p.price<3000).map(p->p.price).collect(Collectors.toList());
		System.out.println("List using stream: " + proList);
		
		List<Integer> proId = productList.stream().filter(p -> p.id <106).map(p->p.id).collect(Collectors.toList());
		System.out.println("List using stream: " + proId);
		
	}	

}
