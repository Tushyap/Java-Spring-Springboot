package javaExceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		 try {
		      // code that generates exception
		      int divideByZero = 5 / 0;
		      System.out.println(divideByZero);
		    }

		    catch (ArithmeticException e) {
		      System.out.println("ArithmeticException => can not divide a number by zero ");
		    }
		    
		    finally {
		      System.out.println("This is the finally block");
		    }

	}

}
