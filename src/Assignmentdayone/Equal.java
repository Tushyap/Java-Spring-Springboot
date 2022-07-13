package Assignmentdayone;

import java.util.Scanner;
public class Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println(" Please enter numbers");
		int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        if ((firstNumber - secondNumber) == 0)
            System.out.println("Numbers are equal");
        else
            System.out.println("Numbers are not equal");
        sc.close();
	}

}
