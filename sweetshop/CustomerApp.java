package spring.project.sweetshop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.project.sweetshop.dao.CustomerDao;
import spring.project.sweetshop.dao.SweetDao;
import spring.project.sweetshop.entities.Customer;
import spring.project.sweetshop.entities.Sweet;




public class CustomerApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		 CustomerDao customerDao = context.getBean("customerDao", CustomerDao.class);
		 SweetDao sweetDao = context.getBean("sweetDao", SweetDao.class);
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        boolean go=true;
	        while(go) {
	            System.out.println("PRESS 1 FOR Registration If a new customer");
	            System.out.println("PRESS 2 FOR Login");
	            System.out.println("PRESS 3 FOR To see all available sweets");
	            System.out.println("PRESS 4 FOR To see specific sweet ");
	            System.out.println("PRESS 5 FOR for exit");
	            try {
	            	int input=Integer.parseInt(br.readLine());

	            	switch(input) { 
	            	case 1:
	            		System.out.println("Please Register ");
	            		//Register customer
	            		System.out.println("Enter Customer Id: ");
	            		int cId=Integer.parseInt(br.readLine());
	            		
	            		System.out.println("Enter Customer name: ");
	            		String cName=br.readLine();
	            		
	            		System.out.println("Enter Customer Password: ");
	            		String cPassword=br.readLine();
	
	                    Customer customer = new Customer();
	                    customer.setCustomerId(cId);
	                    customer.setCustomerName(cName);
	                    customer.setPassword(cPassword);
  
	                    int res = customerDao.insert(customer);
	            		System.out.println("You are registered successfully! Now Login"+ res);	            		
	            		break;
	            	case 2:
	            		System.out.println("You are logged In Successfully...");
	            		System.out.println("You can proceed...");
	            		break;
                    case 3:
                    	//display all sweet record
                		List<Sweet> allSweets=sweetDao.getAllSweets();
                		for(Sweet obj:allSweets) {
                			System.out.println(" Sweet Id: " +obj.getSweetId());
                			System.out.println(" Sweet Name: " +obj.getSweetName());
                			System.out.println(" Sweet Category : " +obj.getSweetCategory());
                			System.out.println(" Sweet Rate: " +obj.getSweetRate());
                			System.out.println(" Sweet Discount Offer % : " +obj.getSweetDiscountOffer());
                			System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
                		} 
	            		break;
                    case 4:
                		
                		//get single sweet data
                		System.out.println("Enter sweet Id : ");
                		int swId=Integer.parseInt(br.readLine());
                		Sweet sweetOb= sweetDao.getSweet(swId);
            			System.out.println("Sweet's Id : " + sweetOb.getSweetId() );
            			System.out.println("Sweet's Name : " + sweetOb.getSweetName());
            			System.out.println("Sweet's Category : " + sweetOb.getSweetCategory());
            			System.out.println("Sweet's Rate : " + sweetOb.getSweetRate() );
            			System.out.println("Sweet's Discount % : " + sweetOb.getSweetDiscountOffer() );
            			System.out.println("________________________________________");
	                    break;
	            	case 5:
	            		//exit the program
	            		go=false;
	            		break;
	            	}
	            }catch(Exception e) {

	                System.out.println("Invalid Input Try with another one !!!");
	            	System.out.println(e.getMessage());
	            }
	        }

	        System.out.println("Thank you for using my application");
	        System.out.println("See you again!");
		((ClassPathXmlApplicationContext) context).close();

	}

}
