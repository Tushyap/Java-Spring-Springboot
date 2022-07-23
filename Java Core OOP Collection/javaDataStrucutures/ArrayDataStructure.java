package javaDataStrucutures;

public class ArrayDataStructure {

	//creating method which returns an array  
	static int[] get(){  
	return new int[]{10,30,50,90,60};  
	}  
	public static void main(String[] args) {
		// Arrays representation
		/* Syntax to Declare an Array in Java

           dataType[] array; (or)  
           dataType []array; (or)  
           dataType array[]; 
           
           Instantiation of an Array in Java
a          rrayRefVar=new data type[size];  
           
        */
		
		int arrayElement[]=new int[5];//declaration and instantiation  
		arrayElement[0]=10;//initialization  
		arrayElement[1]=20;  
		arrayElement[2]=70;  
		arrayElement[3]=40;  
		arrayElement[4]=50;  
		
		//traversing array  
		//length is the property of array 
		for(int i=0;i<arrayElement.length;i++) { 
			
		   System.out.println("Elements : "+ arrayElement[i]); 
		   
		}
		
		//declaration, instantiation and initialization
		int arrayEle[]={33,34,44,54};  
		//printing array  
		for(int i=0;i<arrayEle.length;i++) { 
		System.out.println("Array elements: "+arrayEle[i]);  
		
		}
		
		String arrayElem[]=new String[5];//declaration and instantiation  
		arrayElem[0]="Tushyap";//initialization  
		arrayElem[1]="MERN";  
		arrayElem[2]="JAVA";  
		arrayElem[3]="JavaScript";  
		arrayElem[4]="Ruby";  
		
		//traversing array  
		for(int i=0;i<arrayElem.length;i++) { 
			
		   System.out.println("Elements of String array: "+ arrayElem[i]); 
		   
		}
		
		//calling method which returns an array  
		int arr[]=get();  
		//printing the values of an array  
		for(int i=0;i<arr.length;i++) { 
		System.out.println(arr[i]);
		}
		 
	}

}
