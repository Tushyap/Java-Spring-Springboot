package spring.project.sweetshop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.project.sweetshop.dao.AdminDao;
import spring.project.sweetshop.dao.SweetDao;
import spring.project.sweetshop.entities.Admin;
import spring.project.sweetshop.entities.Sweet;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        AdminDao adminDao = context.getBean("adminDao", AdminDao.class);
        SweetDao sweetDao = context.getBean("sweetDao", SweetDao.class);
       // Admin admin = new Admin(100,"Tushyap");
        //int result = adminDao.insert(admin);
        //System.out.println("Record Inserted : " +result);
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean go=true;
        while(go) {
            System.out.println("PRESS 1 FOR Login As Admin");
            System.out.println("PRESS 2 FOR Adding new subAdmin");
            System.out.println("PRESS 3 FOR Adding Sweet ");
            System.out.println("PRESS 4 FOR Display All Sweet");
            System.out.println("PRESS 5 FOR Delete Sweet Details");
            System.out.println("PRESS 6 FOR  Update Sweet Details");
            System.out.println("PRESS 7 FOR Display Specific Sweet Details");
            System.out.println("PRESS 8 FOR for exit");
            try {
            	int input=Integer.parseInt(br.readLine());

            	switch(input) { 
            	case 1:
            		System.out.println("Admin Logged In Successfully ...");
            		System.out.println("Now you can proceed");
            		
            		
            		break;
            	case 2:
            		//add a new sub ADMIN // dynamic inputs
            		System.out.println("Enter adminId: ");
            		int uId=Integer.parseInt(br.readLine());
            		System.out.println("Enter admin name: ");
            		String uName=br.readLine();
            		
            		//Creating ADMIN object and setting values
            		Admin adminObj=new Admin();
            		adminObj.setAdminId(uId);
            		adminObj.setAdminName(uName);
            		
            		//Saving ADMIN to database by calling insert of ADMIN DAO
            		int result=adminDao.insert(adminObj);
            		System.out.println("ID : "+ result + " Admin added");
            		
            		break;
            	case 3:
            		
            		//add a new sweet details // dynamic inputs
            		System.out.println("Enter Sweet Id: ");
            		int sId=Integer.parseInt(br.readLine());
            		
            		System.out.println("Enter Sweet name: ");
            		String sName=br.readLine();
            		
            		System.out.println("Enter Sweet Category: ");
            		String sCategory=br.readLine();
            		
            		System.out.println("Enter Sweet Rate: ");
            		int sRate=Integer.parseInt(br.readLine());
            		
            		System.out.println("Enter Sweet Discount Offer % : ");
            		int sDiscount=Integer.parseInt(br.readLine());
            		
                    Sweet sweet = new Sweet ();
                    sweet.setSweetId(sId);
                    sweet.setSweetName(sName);
                    sweet.setSweetCategory(sCategory);
                    sweet.setSweetRate(sRate);
                    sweet.setSweetDiscountOffer(sDiscount);
                    
                    int res = sweetDao.insert(sweet);
                    System.out.println(" Sweet Record Inserted : " +res);
                   
            		
            		break;
            	case 4:
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
            	case 5:
            		// delete sweet details
            		System.out.println("Enter Sweet Id to Remove particular Sweet from the list:");
            		int id=Integer.parseInt(br.readLine());
            		sweetDao.deleteSweet(id);
            		System.out.println("Sweet record deleted.");
            		
            		break;
            	case 6:
            		// update sweet details
            		System.out.println("Enter Sweet Id: ");
            		int sweetId=Integer.parseInt(br.readLine());
            		
            		System.out.println("Enter Sweet name: ");
            		String sweetName=br.readLine();
            		
            		System.out.println("Enter Sweet Category: ");
            		String sweetCategory=br.readLine();
            		
            		System.out.println("Enter Sweet Rate: ");
            		int sweetRate=Integer.parseInt(br.readLine());
            		
            		System.out.println("Enter Sweet Discount Offer % : ");
            		int sweetDiscount=Integer.parseInt(br.readLine());
            		
                    Sweet sweetsObj = new Sweet ();
                    sweetsObj.setSweetId(sweetId);
                    sweetsObj.setSweetName(sweetName);
                    sweetsObj.setSweetCategory(sweetCategory);
                    sweetsObj.setSweetRate(sweetRate);
                    sweetsObj.setSweetDiscountOffer(sweetDiscount);
                    
                    // pass values to the method
                    sweetDao.updateSweet(sweetsObj);
                    System.out.println(" Sweet Details Updated ");
            		
            		break;
            	case 7:
            		
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
            	case 8:
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
