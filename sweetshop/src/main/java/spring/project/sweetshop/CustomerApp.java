package spring.project.sweetshop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.project.sweetshop.dao.CustomerDao;
import spring.project.sweetshop.dao.OrderDao;
import spring.project.sweetshop.dao.SweetDao;
import spring.project.sweetshop.entities.Customer;
import spring.project.sweetshop.entities.Order;
import spring.project.sweetshop.entities.Sweet;

// Main class to execute the application program
public class CustomerApp {

	public static void main(String[] args) {
		// create and configure beans ---- injection
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		// hibernateTemplate template = context.getBean("hibernateTemplate",
		// hiberanteTemplate.class);
		CustomerDao customerDao = context.getBean("customerDao", CustomerDao.class);
		SweetDao sweetDao = context.getBean("sweetDao", SweetDao.class);
		OrderDao orderDao = context.getBean("orderDao", OrderDao.class);

		// Use Buffer Reader to take dynamic input from user
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean go = true;
		// while loop
		// Every Key will perform specific task - press keys accordingly
		while (go) {
			System.out.println("PRESS 1 FOR Registration If a new customer");
			System.out.println("PRESS 2 FOR Login");
			System.out.println("PRESS 3 FOR To see all available sweets");
			System.out.println("PRESS 4 FOR To see specific sweet ");
			System.out.println("PRESS 5 FOR order the sweet ");
			System.out.println("PRESS 6 FOR see your order ");
			System.out.println("PRESS 7 FOR for exit");
			// Exception Handling Try Catch Block
			try {
				// Take input and match with the cases
				int input = Integer.parseInt(br.readLine());

				switch (input) {

				case 1:
					System.out.println("Please Register ");
					// Register customer
					System.out.println("Enter Customer Id: ");
					int cId = Integer.parseInt(br.readLine());

					System.out.println("Enter Customer name: ");
					String cName = br.readLine();

					System.out.println("Enter Customer Password: ");
					String cPassword = br.readLine();

					Customer customer = new Customer();
					customer.setCustomerId(cId);
					customer.setCustomerName(cName);
					customer.setPassword(cPassword);

					int res = customerDao.insert(customer);
					System.out.println("You are registered successfully! Now Login" + res);
					break;

				case 2:
					// login
					System.out.println("Please Login ");
					System.out.println("Enter Customer Id: ");
					int custId = Integer.parseInt(br.readLine());
					// get customer Id and password to verify password
					Customer custOb = customerDao.getCustomer(custId);
					String passWord = custOb.getPassword();

					System.out.println("Enter Customer Password: ");
					String custPass = br.readLine();
					// compare password
					if (passWord.equals(custPass)) {
						System.out.println("You are logged In Successfully...");
						System.out.println("You can proceed...");
					} else {
						System.out.println("Incorrect Credentials...");
					}

					break;
				case 3:
					// display all sweet record

					// call getALLSweets method to get details of sweets
					List<Sweet> allSweets = sweetDao.getAllSweets();
					// Use for loop to iterate
					for (Sweet obj : allSweets) {
						System.out.println(" Sweet Id: " + obj.getSweetId());
						System.out.println(" Sweet Name: " + obj.getSweetName());
						System.out.println(" Sweet Category : " + obj.getSweetCategory());
						System.out.println(" Sweet Rate: " + obj.getSweetRate());
						System.out.println(" Sweet Discount Offer % : " + obj.getSweetDiscountOffer());
						System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
					}
					break;
				case 4:

					// get single sweet data
					System.out.println("Enter sweet Id : ");
					int swId = Integer.parseInt(br.readLine());
					Sweet sweetOb = sweetDao.getSweet(swId);
					System.out.println("Sweet's Id : " + sweetOb.getSweetId());
					System.out.println("Sweet's Name : " + sweetOb.getSweetName());
					System.out.println("Sweet's Category : " + sweetOb.getSweetCategory());
					System.out.println("Sweet's Rate : " + sweetOb.getSweetRate());
					System.out.println("Sweet's Discount % : " + sweetOb.getSweetDiscountOffer());
					System.out.println("________________________________________");
					break;
				case 5:
					// order the sweet
					// get single sweet data
					System.out.println("Enter sweet Id  of the selected sweet: ");
					int sweId = Integer.parseInt(br.readLine());
					Sweet sweetObje = sweetDao.getSweet(sweId);
					System.out.println("Sweet's Id : " + sweetObje.getSweetId());
					System.out.println("Sweet's Name : " + sweetObje.getSweetName());
					System.out.println("Sweet's Category : " + sweetObje.getSweetCategory());
					System.out.println("Sweet's Rate : " + sweetObje.getSweetRate());
					System.out.println("Sweet's Discount % : " + sweetObje.getSweetDiscountOffer());
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("Now Place The Order");

					// Enter the required details to place order
					System.out.println("Enter Order Id: ");
					int oId = Integer.parseInt(br.readLine());

					System.out.println("Enter Order name: ");
					String oName = br.readLine();

					System.out.println("Enter Order Quantity: ");
					int oQuan = Integer.parseInt(br.readLine());

					System.out.println("Enter Customer Name: ");
					String custName = br.readLine();

					System.out.println("Enter Customer Phone: ");
					int custPhone = Integer.parseInt(br.readLine());

					System.out.println("Enter Address - Street Name: ");
					String streetName = br.readLine();

					System.out.println("Enter City Name: ");
					String cityName = br.readLine();

					System.out.println("Enter State Name: ");
					String stateName = br.readLine();

					System.out.println("Enter Pin code : ");
					int pinCode = Integer.parseInt(br.readLine());

					// calculate discount amount
					int discount = 100 - sweetObje.getSweetDiscountOffer();
					int disPrice = (discount * sweetObje.getSweetRate()) / 100;
					// payable amount
					int orPrice = oQuan * disPrice;

					// Create object of order class
					Order order = new Order();
					// set values to the setters of POJO order class
					order.setOrderId(oId);
					order.setOrderName(oName);
					order.setOrderQuantity(oQuan);
					order.setOrderPrice(orPrice);
					order.setCustomerName(custName);
					order.setCustomerPhone(custPhone);
					order.setStreetName(streetName);
					order.setCity(cityName);
					order.setState(stateName);
					order.setPinCode(pinCode);

					// call insert method of OrderDao class to insert the details into database
					int orderPlace = orderDao.insert(order);
					System.out.println("Your order is placed successfully..." + orderPlace);

					break;

				case 6:
					// See your Order

					System.out.println("Enter Order Id : ");
					int orId = Integer.parseInt(br.readLine());
					// call getOrder method from OrderDao
					Order orderOb = orderDao.getOrder(orId);
					System.out.println("Order Id : " + orderOb.getOrderId());
					System.out.println("Order Name : " + orderOb.getOrderName());
					System.out.println("Order Quantity : " + orderOb.getOrderQuantity());
					System.out.println("Order Rate After Discount : " + orderOb.getOrderPrice());
					System.out.println("Customer Name : " + orderOb.getCustomerName());
					System.out.println("Customer Phone: " + orderOb.getCustomerPhone());
					System.out.println("Address-Street Name: " + orderOb.getStreetName());
					System.out.println("City : " + orderOb.getCity());
					System.out.println("State : " + orderOb.getState());
					System.out.println("Pincode : " + orderOb.getPinCode());
					System.out.println("________________________________________");
				case 7:
					// exit the program
					go = false;
					break;
				}
			} catch (Exception e) {
				// this block will handle the exceptions if there any
				System.out.println("Invalid Input Try with another one !!!");
				System.out.println(e.getMessage());
			}
		}

		System.out.println("Thank you for using my application");
		System.out.println("See you again!");
		// Close the context to avoid leakage
		((ClassPathXmlApplicationContext) context).close();

	}

}
