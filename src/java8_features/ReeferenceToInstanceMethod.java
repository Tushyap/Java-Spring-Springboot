package java8_features;

@FunctionalInterface
interface Printable{  
    void print();  
}  
public class ReeferenceToInstanceMethod {

    public void printSomething(){  
        System.out.println("Hello, this is non-static method.");  
    }  
	public static void main(String[] args) {
		// create object
		
		ReeferenceToInstanceMethod methodReference = new ReeferenceToInstanceMethod();
		// Referring non-static method using reference 
		
	     Printable	printable  = methodReference::printSomething;
	     // Calling interface method  
         printable.print();  
         // Referring non-static method using anonymous object
         Printable printabletwo = new ReeferenceToInstanceMethod()::printSomething; // You can use anonymous object also  
         // Calling interface method  
         printabletwo.print();  
	}

}
