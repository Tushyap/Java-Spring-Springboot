package javaDataStrucutures;

public class QuickSort {
	  /* function that consider last element as pivot,  
	place the pivot at its exact position, and place  
	smaller elements to left of pivot and greater  
	elements to right of pivot.  */  
	
	int partition (int array[], int start, int end)  
	{  
	    int pivot = array[end]; // pivot element  
	    int i = (start - 1);  
	  
	    for (int j = start; j <= end - 1; j++)  
	    {  
	        // If current element is smaller than the pivot  
	        if (array[j] < pivot)  
	        {  
	            i++; // increment index of smaller element  
	            int temp = array[i];  
	            array[i] = array[j];  
	            array[j] = temp;  
	        }  
	    }  
	    int temp = array[i+1];  
	    array[i+1] = array[end];  
	    array[end] = temp;  
	    return (i + 1);  
	}  
	  
	/* function to implement quick sort */  
	void quick(int arr[], int start, int end) /* a[] = array to be sorted, start = Starting index, end = Ending index */  
	{  
	    if (start < end)  
	    {  
	        int p = partition(arr, start, end);  //p is partitioning index  
	        quick(arr, start, p - 1);  
	        quick(arr, p + 1, end);  
	    }  
	}  
	/* function to print an array */  
	void printArr(int arr[], int n)  
	{  
	    int i;  
	    for (i = 0; i < n; i++)  
	        System.out.print(arr[i] + " ");  
	}  
	public static void main(String[] args) {
		 int arr[] = { 13, 18, 27, 2, 19, 25 };  
		    int n = arr.length;  
		    System.out.println("\nBefore sorting array elements are - ");  
		    QuickSort obj = new QuickSort();  
		    obj.printArr(arr, n);  
		    obj.quick(arr, 0, n - 1);  
		    System.out.println("\nAfter sorting array elements are - ");  
		    obj.printArr(arr, n);  
		    System.out.println();  

	}

}
