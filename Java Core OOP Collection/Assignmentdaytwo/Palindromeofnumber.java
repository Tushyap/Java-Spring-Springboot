package Assignmentdaytwo;
import java.util.Scanner;
public class Palindromeofnumber {
	static int reverseNum(int n, int temp)
	{
	    if (n == 0)
	        return temp;
	    temp = (temp * 10) + (n % 10);	 
	    return reverseNum(n / 10, temp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter  number: ");
        int n = sc.nextInt();
	    int temp = reverseNum(n, 0);
	    if (temp == n)
	        System.out.println(n +" number is palindrome");
	    else
	        System.out.println( n + " number is not a palindrome " );
	    sc.close();
	}

}
