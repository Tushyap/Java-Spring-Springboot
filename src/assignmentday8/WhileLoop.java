package assignmentday8;

import java.util.Scanner;

// question  1 - Program for a calculate and perform basic operations
//dynamically using while loop to perform operations continuous


class WhileloopAssgn{
//	print whole numbers till given number
    void printNum(int val){
		int num =1;
		while(num<=val) {
			System.out.println(num);  
		    num++;  
		}
	}
} 
public class WhileLoop {

	public static void main(String[] args) {
		// create object 
		WhileloopAssgn object = new WhileloopAssgn();
		// use scanner class to take input from user 
		System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        //call method
        object.printNum(value);
		sc.close();
	}

}
