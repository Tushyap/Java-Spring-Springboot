package Assignmentdaytwo;
import java.util.Scanner;
public class Reversenumber {
	   static int reve = 0;
	    static void reverse(int n){       
	      if(n<=0)
	        return ;
	        int remainder = n%10;        
	      reve = (reve*10) + remainder;	        
	      reverse(n/10);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter  numbers to be reversed: ");
        int number = sc.nextInt();
        reverse(number);     
        System.out.print("Reversed Number is "+ reve);
        sc.close();
	}

}