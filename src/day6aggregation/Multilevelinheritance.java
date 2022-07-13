package day6aggregation;
// Multilevel inheritance

// create a Animal class as a main/base/parent class 
class Animal{  
	// create a method which is common for all the animals 
void eat(){
	System.out.println("eating...");
	}  
}  
// create a Dog class which will have properties of animal class
class Dog extends Animal{ 
	// create a method which represents the property of dog
void bark(){
	System.out.println("barking...");
	}  
}  

// create a Puppy class which will further inherit the properties of dog 
class Puppy extends Dog{  
	// create a method 
void weep(){
	System.out.println("weeping...");
	}  
}  

// driver class
public class Multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// create the object of sub subclass means puppy class 
   // puppy ----> dog -----> animal
		Puppy object=new Puppy();  
		object.weep();  
		object.bark();  
		object.eat(); 
	}

}
