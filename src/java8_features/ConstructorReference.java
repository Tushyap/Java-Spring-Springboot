package java8_features;

@FunctionalInterface
interface Messageable{  
    Message getMessage(String msg);  
}  
class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }  
}  

public class ConstructorReference {

	public static void main(String[] args) {
	//You can refer a constructor by using the new keyword. Here, we are referring constructor with the help of functional interface.
		Messageable hello = Message::new;  
        hello.getMessage("Hello");  

	}

}
