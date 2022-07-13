package constructord4;

//Write a parameterized constructor for employee class and take member id,first name,last name,city,state try to implement with static method.

public class Employeeconstructor {
	
	// variables for employee constructor
	 int    empId;
     String empName;
     String empEmail;
     String empDepartment;
     String empCity;
    // create constructor to initialize the variables
	public Employeeconstructor(int empId, String empName, String empEmail, String empDepartment, String empCity) {
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empDepartment = empDepartment;
		this.empCity = empCity;
	}
	// create display method to show the employee details on screen
	void display() {
		   System.out.println("Printing  Employee's Details using constructor assigned values");
		   System.out.println("Employee ID         : "+ empId);
		   System.out.println("Employee Name       : "+ empName);
		   System.out.println("Employee Email      : "+ empEmail);
		   System.out.println("Employee Department : "+ empDepartment);
		   System.out.println("Employee City       : "+ empCity);
	}
	
	 // create static function as per the questions requirement
	// To access the non static method in the main class we need to create the object of the class
   // static members/variables can be accessed in the main method without creating the object 
	
   static void basicDetails(int empId, String empName, String empEmail) {
	   System.out.println("Printing Basic Employee's Details from static method ");
	   System.out.println("Employee    ID : "+ empId);
	   System.out.println("Employee  Name : "+ empName);
	   System.out.println("Employee Email : "+ empEmail);
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create object of the class
		Employeeconstructor empObj = new Employeeconstructor(512008, "Tushyap Bari", "tushyap.nari@globallogic.com",
				                                             "Engineering", "Lucknow");
		// call display method
		empObj.display();
		
		System.out.println("*****************************************");
		
		//call static method without creating the object
		
        basicDetails(221122,"Sachin", "sachin@gmail.com");	
	}

}
