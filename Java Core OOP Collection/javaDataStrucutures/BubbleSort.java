package javaDataStrucutures;

public class BubbleSort {
	   void print (int arr[]) //function to print array elements  
	    {  
	        int length = arr.length;  
	        int i;  
	        for (i = 0; i < length; i++)  
	        {  
	            System.out.print(arr[i] + " ");  
	        }         
	    }  
	     void bubbleSort (int arr[])    // function to implement bubble sort  
	    {  
	        int arrLength = arr.length;  
	        int i, j, temp;  
	        for (i = 0; i < arrLength; i++)  
	        {  
	            for (j = i + 1; j < arrLength; j++)  
	            {  
	                if (arr[j] < arr[i])  
	                {  
	                    temp = arr[i];  
	                    arr[i] = arr[j];  
	                    arr[j] = temp;  
	                }  
	            }  
	        }  
	    }  
	public static void main(String[] args) {
		
		 int array[] = {35, 10, 31, 11, 26};    
		    BubbleSort valueObj = new BubbleSort();  
		    System.out.println("Before sorting array elements are - ");    
		    valueObj.print(array);  
		    valueObj.bubbleSort(array);  
		    System.out.println();  
		    System.out.println("After sorting array elements are - ");    
		    valueObj.print(array);  
	}

}
