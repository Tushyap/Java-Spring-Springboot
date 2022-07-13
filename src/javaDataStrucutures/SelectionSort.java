package javaDataStrucutures;

public class SelectionSort {
	void print (int arr[]) //function to print array elements  
    {  
        int length = arr.length;  
        int i;  
        for (i = 0; i < length; i++)  
        {  
            System.out.print(arr[i] + " ");  
        }         
    }  
	  public  void selectionSort(int[] arr){  
	        for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j;//searching for lowest index  
	                }  
	            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber;  
	        }  
	    }  
	public static void main(String[] args) {
		     SelectionSort object = new SelectionSort();
		     int[] arrayEle = {9,14,3,2,43,11,58,22};  
	         System.out.println("Before Selection Sort"); 
	         object.print(arrayEle);
	         System.out.println();   
	         object.selectionSort(arrayEle);//sorting array using selection sort 
	         System.out.println("After sorting array elements are - ");    
			 object.print(arrayEle); 
	}

}
