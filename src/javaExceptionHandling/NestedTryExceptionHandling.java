package javaExceptionHandling;

public class NestedTryExceptionHandling {

	public static void main(String[] args) {
		 //outer try block   
		  try{    
		  //inner try block 1  
		      try{       
		        @SuppressWarnings("unused")
			    int val =39/0;    
		         }  
		      //catch block of inner try block 1  
		      catch(ArithmeticException e)  
		      {  
		        System.out.println(e);  
		      }    
		       
		    
		      //inner try block 2  
		      try{    
		        int arr[]=new int[5];    
		  
		         //assigning the value out of array bounds  
		         arr[5]=4;    
		       }  
		  
		      //catch block of inner try block 2  
		      catch(ArrayIndexOutOfBoundsException e)  
		      {  
		        System.out.println(e);  
		      }    
		  
		      
		      System.out.println("other statement");    
		    }  
		   //catch block of outer try block  
        catch(Exception e)  
		  {  
		    System.out.println("handled the exception (outer catch)");  
		  }    
		    
	   System.out.println("normal flow..");    

	}

}
