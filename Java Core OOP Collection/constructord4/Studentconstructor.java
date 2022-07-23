package constructord4;
import java.util.*;
public class Studentconstructor {
	int stdId;
	String firstName;
	String lastName;
	String city;
	String state;

	public Studentconstructor(int stdId, String firstName, String lastName, String city, String state) {
		super();
		this.stdId = stdId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
	}
	void display() {
		System.out.print(stdId + " " + firstName + " "+ lastName + " "+ city + " "+ state);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Student Id:");
       int id = sc.nextInt();
       System.out.println("Enter Student first name:");
       String fName = sc.next();
       System.out.println("Enter Student last name:");
       String lName = sc.next();
       System.out.println("Enter Student city");
       String cityName = sc.next();
       System.out.println("Enter Student state:");
       String stateName= sc.next();      
       Studentconstructor obj = new Studentconstructor(id, fName, lName, cityName, stateName);
       obj.display();
       sc.close();
	}

}
