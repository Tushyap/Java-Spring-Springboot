package assignmentday8;
/*Question 2 
 * Write a Java method to compute the average of three numbers. 
Test Data:
Input the first number: 25
Input the second number: 45
Input the third number: 65
Expected Output:

The average value is 45.0
*/
import java.util.Scanner;
class Average{
	// method to find average of three numbers
	double printAverage(int numOne, int numTwo, int numThree){
		int numberOfInput = 3;
		double avg = 0;
	    double	sum = 0;
	    sum = numOne+numTwo+numThree;
	    avg= sum/numberOfInput;
	    return avg;
	
	}
}

public class CalculateAverage {

	public static void main(String[] args) {
	// create object 
	Average obj = new Average();
	System.out.println("Enter three numbers to find the average"); // get three numbers
    Scanner sc = new Scanner(System.in);
    int numOne = sc.nextInt();
    int numTwo = sc.nextInt();
    int numThree = sc.nextInt();
	System.out.println("Average of given numbers is: "+obj.printAverage(numOne, numTwo, numThree));// print the output
    sc.close();
	}

}
