package InheritanceD4;
//create respective parent and child class and try to derive at least 5 members from parent class with the help of constructor
//get it printed with absolute object created to avail 100% inheritance.

// inheritance example using vehicle example

// create parent class
class Hotwheels{
	
    public int speed;
    public String vehicleName;
    public String vehicleBrand;
    
   // create constructor to initialize the variables 
	public Hotwheels(int speed, String vehicleName, String vehicleBrand) {
		this.speed = speed;
		this.vehicleName = vehicleName;
		this.vehicleBrand = vehicleBrand;
	}
 
	// create a method to display the output on screen
	public void displayHotWheels() {
		System.out.println("This is parent Hotwheels class display method:");
		System.out.println("Vehicle Name:"+ vehicleName);
		System.out.println("Vehicle Brand:"+ vehicleBrand);
		System.out.println("Vehicle Speed:"+ speed);
	}
}

// create child class which also have properties of parent class because of inheritance 

class Motorbike extends Hotwheels{
	
	public int numberOfWheels;

	// create a constructor 
	public Motorbike(int speed, String vehicleName, String vehicleBrand, int numberOfWheels) {
		// super enables the child class to inherit parent class properties 
		super(speed, vehicleName, vehicleBrand);
		this.numberOfWheels = numberOfWheels;
	}
	
	// create a method to display the output on screen
	public void displayMotorbike() {
		displayHotWheels(); // this method will print the output of parent class 
		System.out.println("This is child Motorbike class display method:");
		System.out.println("Number of wheels:"+ numberOfWheels);
}
}

// driver class
public class Vehicle {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create the object of the child class
        Motorbike mBike = new Motorbike(150, "YAMAHA XYZ", "YAMAHA", 2);
        mBike.displayMotorbike(); // this will first print the output of parent class after that child class output printed
	}

}
