package day7MethodOverloading;

// create an interface
interface DrawDesigns{
	
   public void draw();
   public void add(int one, int two);
}  

// create a class which implements interface
class Rectangle implements DrawDesigns{  
	// over ride the abstract methods of interface
@Override
public void draw(){
	System.out.println("drawing rectangle");
	}

@Override
public void add(int one, int two) {
	
	System.out.println(one + two);
  }  
}  

//create a class which implements interface

class Circle implements DrawDesigns{  
	// over ride the abstract methods of interface
@Override
public void draw(){
	System.out.println("drawing circle");
	}

@Override
public void add(int one, int two) {
	System.out.println(one+two);
	
}  
}  
public class Interface {

	public static void main(String[] args) {
		// create object
	  DrawDesigns object = new Circle();
	  // call methods
	  object.draw();
	  object.add(10,20);
	  
	  DrawDesigns obj = new Rectangle();
	  obj.draw();
	  obj.add(30, 40);
    
	}

}
