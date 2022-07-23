package day7MethodOverloading;

// runtime polymorphism example by method overriding

class Banks{  
    float getRateOfInterest(){
	return 0;
	}  
}  

class SBI extends Banks{  
    float getRateOfInterest(){
	return 8.4f;
	}  
}  
class ICICI extends Banks{  
    float getRateOfInterest(){
	return 7.3f;
	}  
}  
class AXIS extends Banks{  
    float getRateOfInterest(){
	return 9.7f;
	}  
}  
public class PolymorphismExample {

	public static void main(String[] args) {
		
		Banks obj;  
		obj=new SBI();  
		System.out.println("SBI Rate of Interest: "+obj.getRateOfInterest());  
		obj=new ICICI();  
		System.out.println("ICICI Rate of Interest: "+obj.getRateOfInterest());  
		obj=new AXIS();  
		System.out.println("AXIS Rate of Interest: "+obj.getRateOfInterest());  
	}

}
