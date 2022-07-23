package day8.finalkeyword;

public class Wrapperclass {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOne = 10;
		 int numberTwo = 20;
		 Integer aObj = Integer.valueOf(numberOne);
		 Double bObj = Double.valueOf(numberTwo);
		 
		 if(aObj instanceof Integer) {
			 System.out.println("An object of Integer created");
		 }
		 if(bObj instanceof Double) {
			 System.out.println("An object of Double created");
		 }
	}

}
