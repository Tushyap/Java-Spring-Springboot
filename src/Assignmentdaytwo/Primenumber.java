package Assignmentdaytwo;

import java.util.Scanner;  
public class Primenumber {
	static int CheckPrime(int val,int num)
	{
	    if(num==val)
	        return 0;
	    if(num%val==0)
	            return 1;
	    else{
	        return CheckPrime(val+1,num);
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner cs=new Scanner(System.in);
		    int num;
		    System.out.print("Enter your Number:");
		    num=cs.nextInt();
		    if(CheckPrime(2,num)==0)
		    	 System.out.print("It is a Prime Number.");
		    else
		    	 System.out.print("It is not a Prime Number.");
	        cs.close();
	}
}
