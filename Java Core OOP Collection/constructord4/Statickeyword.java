package constructord4;

public class Statickeyword {
      static int number ;
      static String fullName;
      static String city;
      
      static void display() {
    	  System.out.println("This is from the static display method");
      }
      
      void func() {
    	  System.out.println("This is from the void  func");
    	  display();
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Static method can directly be accessed by the static and non static method 
		// To access the non static method in the main class we need to create the object of the class
		// static members/variables can be accessed in the main method without creating the object 
		// We don't need to create the object to execute the static method 
		Statickeyword obj = new Statickeyword();
		obj.func();

	}

}
