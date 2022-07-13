package constructord4;
//Write a constructor in the Car class and take at least  3 methods and includes few states and behaviors and get the details executed


public class Carmethods {
	String carName;
	String carColor;
	int maxSpeed;
	// Create constructor to initialize variables
	public Carmethods(String carName, String carColor, int maxSpeed) {
		this.carName = carName;
		this.carColor = carColor;
		this.maxSpeed = maxSpeed;
	}
	// Create a car() method
	  public void car() {
	    System.out.println("Car name is: " + carName +"  & Car color is : " + carColor);
	  }
	 // Create a fullSpeed() method
	  public void fullSpeed() {
	    System.out.println("The car is going as fast as it can!");
	  }

	  // Create a speed() method 
	  public void speed() {
	    System.out.println("Max speed is: " + maxSpeed);
	  }
	  
	  
	  public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating objects and passing values 
		  Carmethods carObj = new Carmethods("Mercedes", "Black", 220);
		  carObj.fullSpeed();
		  carObj.car();
		  carObj.speed();
	}

}
