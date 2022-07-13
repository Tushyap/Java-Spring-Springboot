package day7MethodOverloading;


// create a abstract class of animal
abstract class Animal{
	abstract void sound();  // this abstract method will further implemented by subclass
}

// create a abstract class of Bank
abstract class Bank{    
	
abstract void  getCurrentBalance(); ///abstract method to be implemented further by subclass
abstract void  typeOfAccount();
int currentBalance = 50000;
}

// create  a subclass dog which will inherit Animal class
class Dog extends Animal{
	// implemented the abstract method 
	void sound(){     
		System.out.println("dog is woofing...");  
		} 
}

//create  a subclass Lion which will inherit Animal class
class Lion extends Animal{
	//implemented the abstract method 
	void sound(){
		System.out.println("Lion is roaring");
		} 
}

// create a subclass Savings which inherits Bank class
class Savings extends Bank{
	//implemented the abstract method 
	void  getCurrentBalance(){
		System.out.println("your current balance is :"+ currentBalance);
		}  
	void  typeOfAccount() {
		System.out.println("You have saving account");
	}
}

public class AbstractionClass{

	public static void main(String[] args) {
		// create object using reference of base class class for subclass  
		
		Animal object = new Dog(); 
		object.sound();
		
		Animal obj = new Lion();
		obj.sound();
		
		Bank acc = new Savings();
		acc.getCurrentBalance();
		acc.typeOfAccount();
	}

}
