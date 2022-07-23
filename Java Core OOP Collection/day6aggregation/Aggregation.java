package day6aggregation;

// create a class for address
class Address{
	// define data members for address
	int streetNum;
	int houseNum;
	String areaName;
	String landmark;
	String pin;
	String city;
	String state;
	
	// create a constructor for address class to initialize the data members
	public Address(int streetNum, int houseNum, String areaName, String landmark, String pin, String city,String state) {
		this.streetNum = streetNum;
		this.houseNum = houseNum;
		this.areaName = areaName;
		this.landmark = landmark;
		this.pin = pin;
		this.city = city;
		this.state = state;
	}
	
	
}

public class Aggregation {
	
	int rollNum;
	String  studentName;
// creating has a relationship with Address class
	Address studentAdd;
	// create constructor for aggregation class
	
	public Aggregation(int rollNum, String studentName, Address studentAdd) {
	this.rollNum = rollNum;
	this.studentName = studentName;
	this.studentAdd = studentAdd;
}

	public static void main(String[] args) {
		
		// create object of Address class 
        Address addr = new Address(121, 130, "Vivek Nagar", "Near Adarsh Marriage Garden", "228001", "Sultanpur", "Uttar Pradesh");
        // Create object of Aggregation Class
        Aggregation obj = new Aggregation (18027, "Tushyap Bari", addr);
        
        // print the required details
        System.out.println(obj.rollNum);
        System.out.println(obj.studentName);
        System.out.println(obj.studentAdd.streetNum);
        System.out.println(obj.studentAdd.houseNum);
        System.out.println(obj.studentAdd.pin);
        System.out.println(obj.studentAdd.landmark);
        System.out.println(obj.studentAdd.city);
        System.out.println(obj.studentAdd.state);
	}

}
