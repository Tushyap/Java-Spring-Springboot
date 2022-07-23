package day7MethodOverloading;

// example of method overloading 
// number of parameters
class DisplayMethodOverloading{
	
	// create add method with two arguments
	public void add(int one , int two) {
		System.out.println(one+two);
	}
	// create add method with three arguments
	public void add(int one , int two, int three) {
		System.out.println(one+two+three);
	}
}
public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	create object 
		DisplayMethodOverloading object = new DisplayMethodOverloading();
		// call the method 
		object.add(20, 10);
		object.add(10,20,30);
		

	}

}
