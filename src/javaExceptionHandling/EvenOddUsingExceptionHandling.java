package javaExceptionHandling;

import java.util.Scanner;

public class EvenOddUsingExceptionHandling {

	public static void main(String[] args) {
		
	try {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

	        String evenOdd = (num % 2 == 0) ? "even" : "odd";

	        System.out.println(num + " is " + evenOdd);
	        sc.close();
	}
	catch(Exception e){
		System.out.println();
		System.out.println(e+" >>>> You have entered string instead integer");
	}
        
	}

}
