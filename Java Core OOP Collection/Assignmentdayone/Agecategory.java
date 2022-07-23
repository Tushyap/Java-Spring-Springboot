package Assignmentdayone;
import java.util.Scanner;
public class Agecategory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter your age:");

		Scanner in = new Scanner(System.in);
		int age = in.nextInt();

		if (age <= 0) {
			System.out.println("Invalid");

		} else if (age >= 1 && age <= 10) {
			System.out.println("Kid");

		} else if (age >= 11 && age <= 20) {
			System.out.println("Teenager");

		} 
		else if (age >= 21 && age <= 50) {
			System.out.println("Adult");

		}
		else if (age >= 51 && age <= 100) {
			System.out.println("old age");

		}else {
			System.out.println("Above 100, you have lived enough please feel free to die");

		}
		in.close();

	}

}