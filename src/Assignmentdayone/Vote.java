package Assignmentdayone;

import java.util.Scanner;
public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
        
		 Scanner sc = new Scanner(System.in);
		 System.out.println(" Please enter your age");
		 age = sc.nextInt();

		 if(age>=18)
		 {
		 System.out.println("Welcome to voting system Yo can Vote");
		 }
		 else
		 {
		 
		 System.out.println("Sorry,You can't vote");
		 }
		 sc.close();
	}

}
