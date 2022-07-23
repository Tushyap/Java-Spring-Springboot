package Assignmentdayone;

import java.util.Scanner;
public class Equalnestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter  numbers: ");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        if((firstNumber - secondNumber) == 0)
        { 
           System.out.println("The entered numbers are equal"); 
           if(firstNumber<50)
           {
	          System.out.println("The  number is less than 50");
	       }
	    }
	    else
	    {
	        System.out.println("The entered numbers are not equal");
	    }
        sc.close();

	}

}
