package assignmentday8;
/*Write a Java program that reads a floating-point number and prints "zero" 
if the number is zero. Otherwise, print "positive" or "negative". 
Add "small" if the absolute value of the number is less than 1, or 
"large" if it exceeds 1,000,000. 
 * */
import java.util.Scanner;
class AnalyseNumber{
	// method,  reads a floating-point number
	void analyseGivenNumber(double value) {
		if(value==0){                                    // check number is zero ?
			System.out.println("Entered number is Zero ");
		}else if(value < 0){                            //  number is negative
			System.out.println("Entered number is Negative");
		}
		else if(value > 0){                             // number is positive
			System.out.println("Entered number is positive");
		}
		else if(value > 1){                            // number is small
			System.out.println("Entered number is small");
		}
		else if(value > 1000000){                      // number is large
			System.out.println("Entered number is large");
		}
	}
}
public class ReadNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number"); // get a number
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
		AnalyseNumber object = new AnalyseNumber();  // create a object 
		object.analyseGivenNumber(val); // call method
		sc.close();
	}

}
