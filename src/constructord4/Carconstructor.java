package constructord4;
//Write a constructor in the Car class and initialize the variables --- color --- brand --- model --- manufacturing year..
public class Carconstructor {
	String carName; 
	String carBrand;  
	String carColor;  
	String carModel;  
	int carMfgYear;  
	
	 //creating a parameterized constructor  
	public Carconstructor(String carName, String carBrand, String carColor, String carModel, int carMfgYear) {
		this.carName = carName;
		this.carBrand = carBrand;
		this.carColor = carColor;
		this.carModel = carModel;
		this.carMfgYear = carMfgYear;
	}
	
	//method to display the values  
	void display() {
		System.out.println("Car name: "+ carName);
		System.out.println("Car brand: " + carBrand);
		System.out.println("Car color: "+ carColor);
		System.out.println("Car Model: "+ carModel);
		System.out.println("Car manufacturing year: "+ carMfgYear);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating objects and passing values  
		Carconstructor c1 = new Carconstructor("BMW M8 Coupe","BMW", "Black", "Msports Series", 2022);
		//calling method to display the values of object  
		c1.display();

	}

}
