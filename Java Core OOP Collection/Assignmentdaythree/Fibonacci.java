package Assignmentdaythree;

public class Fibonacci {
	static int num1 =0, num2=1, temp=0;
	static void fibonacciSeries(int count) {
		if(count>0) {
			temp = num1 + num2;
			num1 = num2;
			num2 = temp;
			System.out.print(" "+ temp);
			fibonacciSeries(count-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int count =50;
      System.out.print(num1 + " " + num2);
      fibonacciSeries(count-2);
	}

}
