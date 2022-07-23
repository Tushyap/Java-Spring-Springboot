package ArrayD5;


public class Arraymaxmin {
	// created a method to print the max and min number of an given array
	
	public static void arraymaxmin(int arr[]) {
		// initialize the variables
	int maximum = 0;
	int minimum = 1000000;
	// use for loop to check the condition multiple times
	for (int i=0; i<arr.length; i++) {
		maximum = (maximum<arr[i])?arr[i]:maximum;
		minimum = (minimum>arr[i])?arr[i]:minimum;
	}
	// print the output on console
	System.out.println("Maximum number is :"+ maximum);
	System.out.println("Minimum number is :"+ minimum);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// give the array
       int arr[] = {1,2,23,24,5,6,73,81,9,10};
       // call the method
       arraymaxmin(arr);

	}

}
