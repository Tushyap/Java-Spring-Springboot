package javaDataStrucutures;

import java.util.Scanner;

public class InsertionSort {
	 /*Function to sort array using insertion sort*/
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int temp = arr[i];
            int j = i - 1;
 
            /* Move elements of array [0..i-1], that are
               greater than temporary, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }
    // function to print the array 
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
            System.out.println();
    }
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the size of the array :: ");
	      int size = sc.nextInt();
	      int myArray[] = new int[size];
	      System.out.println("Enter elements of the array (Strings) :: ");
	      for(int i=0; i<size; i++) {
	         myArray[i] = sc.nextInt();
	      }
	      // print array before sorting 
	      printArray(myArray);
	      InsertionSort ob = new InsertionSort();
	      // print array after sorting 
	      ob.sort(myArray);
	 
	      printArray(myArray);
	      sc.close();
		

	}

}
