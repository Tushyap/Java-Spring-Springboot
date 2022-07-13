package day6aggregation;

//Hierarchical Inheritance Example
//When two or more classes inherits a single class, it is known as hierarchical inheritance. 
//In the example given below, Dog and Cat classes inherits the Animal class, so there is hierarchical inheritance.

// create a parent animal class
class Animals{  
      void eat(){
    	  System.out.println("eating...");
    	  }  
}  
// create a subclass of animal class
class Doggg extends Animal{  
      void bark(){
    	  System.out.println("barking...");
    	  }  
}  

//create another subclass of animal
class Cat extends Animals{  
      void meow(){
    	  System.out.println("meowing...");
    	  }  
}  

// driver class
public class Hierarchicalinheritance {

	public static void main(String[] args) {
		// create object of sub subclass
		Cat c=new Cat();  
		c.meow();  // call the methods
		c.eat();  

	}

}
