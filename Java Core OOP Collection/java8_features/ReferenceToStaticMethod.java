package java8_features;
@FunctionalInterface
interface Display{  
    void print();  
}  

 class MethodReferenceTwo {  
    public static void ThreadStatus(){  
        System.out.println("Thread is running...");  
    }  
 }

public class ReferenceToStaticMethod {
	
	

    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
	public static void main(String[] args) {
        // Referring static method  
        Display obj = ReferenceToStaticMethod::saySomething;  
        // Calling interface method  
        obj.print();  

        // method reference using thread 
        Thread th=new Thread(MethodReferenceTwo::ThreadStatus);  
        th.start();  
	}

}
