package InheritanceD4;
import java.util.*;

// child class 
class Derived extends Main{
	String className = "child Class";
}

// Main class 
public class Main {
	
	
	// A simple method to display 
	void display() {
		System.out.println("This is Main/ Parent class");
	}
	
	// method to check entered number is odd or even
	void evenOddCheck(int number) {
		  if(number % 2 == 0)
	        {
	            System.out.println("The given number "+number+" is Even ");
	        }
	        else
	        {
	            System.out.println("The given number "+number+" is Odd ");
		}
	}
	
	// method to print the even and odd numbers till the entered number
	void evenNumber(int numberOne) {
		System.out.print("Even Numbers from 1 to "+numberOne+" are: ");
		for (int i = 1; i <= numberOne; i++) {
		   //if number%2 == 0 it means its an even number
		   if (i % 2 == 0) {
			System.out.println(i + " :is Even");
		   }else {
			   System.out.println(i + " :is odd");
		   }
		}
		
	}
	// method to print the largest number among three static number 
	// as of now it's static 
	void largestNumber() {
		//initializing numbers to compare  
		int one=40, two=78, three=19;  
		  
		//if both conditions are true, prints one  
		if(one>=two && one>=three)  
		System.out.println(one+" is the largest Number");  
		 
		//if both conditions are true, prints two  
		else if (two>=one && two>=three)  
		System.out.println(two+" is the largest Number");  
		else  
		//prints three if the above conditions are false  
		System.out.println(three+" is the largest number");  
	}
	
	// method to check a person's age is eligible to wait 
	void vote(int age){
		 if(age>=18)
		 {
		 System.out.println("Welcome to voting system Yo can Vote");
		 }
		 else
		 {
		 
		 System.out.println("Sorry,You can't vote");
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create object of the child class 
        Derived logic= new Derived();
        
        // call display method by the reference of derived or child class
        logic.display();
        
        // call largestNumber method to check largest number
        logic.largestNumber();
        
        // used scanner class to get input from user 
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter a number to Check even");
        int evenNum = sc.nextInt();
        // pass the input given by user to the method
        logic.evenOddCheck(evenNum);
        
        System.out.println("Enter a number to Check even or Odd");
        int evenOdd = sc.nextInt();
     // pass the input given by user to the method
        logic.evenNumber(evenOdd);
        
        System.out.println("Enter your age :");
        int writeAge = sc.nextInt();
     // pass the input given by user to the method
        logic.vote(writeAge);    
        
        sc.close();
        
	}

}

