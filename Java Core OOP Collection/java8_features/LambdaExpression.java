package java8_features;

import java.util.ArrayList;
import java.util.List;

//Lambda expression provides implementation of functional interface. An interface which has only one abstract method is called functional interface.
//The Lambda expression is used to provide the implementation of an interface which has functional interface. It saves a lot of code. In case of lambda expression,
//we don't need to define the method again for providing the implementation. Here, we just write the implementation code.

@FunctionalInterface
interface Drawable{  
    public void draw();  
}  


@FunctionalInterface
interface LambdaSingleParameter{
	public int incrementByFive(int num);
}

@FunctionalInterface
interface LambdaDoubleParameter{
	public String concatinateString(String first , String second);
}

@FunctionalInterface  
interface Sayable{  
    String say(String message);  
}  

public class LambdaExpression {
	
	  public static void main(String[] args) {  
	        int width=10;  
	  
	        //without lambda, Draw able implementation using anonymous class  
//	        Drawable d=new Drawable(){  
//	            public void draw(){System.out.println("Drawing "+width);}  
//	        };  
//	        d.draw();  
	        
	        //with lambda  
	        Drawable obj=()->{  
	            System.out.println("Drawing "+width);  
	        };  
	        obj.draw(); 
	        
	        // Lambda expression with single parameter. 
	        LambdaSingleParameter object = (number)-> number+5;
	        System.out.println("number will be incremented by 5 -> "+ object.incrementByFive(22));
	        
	        // Lambda expression with double parameter. 
	        LambdaDoubleParameter lambda = (firstName , lastName) -> firstName + " " + lastName;
	        System.out.println("String concatination : " + lambda.concatinateString("Tushyap", "Bari"));
	          
	        
	        List<String>  objects = new ArrayList<String>();
	        objects.add("Tushyap");
	        objects.add("Sachin");
	        objects.add("Shivam");
	        objects.add("Kartik");
	        objects.add("Vishu");
	        
	        // iterate lambda for each method 
	        objects.forEach(  
	                (elements)->System.out.println("elements of list : "+elements)  
	            );  
	        
	        // You can pass multiple statements in lambda expression  
	        Sayable person = (message)-> {  
	            String strOne = "I would like to say, ";  
	            String strTwo = strOne + message;   
	            return strTwo;  
	        };  
	            System.out.println(person.say("time is precious."));  
	        
	        
	  }  
}
