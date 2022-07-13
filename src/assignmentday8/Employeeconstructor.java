package assignmentday8;
/*2) Employees
2.1>>Create a class called Employee whose objects are records for an employee. 
\This class will be a derived class of the class Person which you will have to 
copy into a file of your own and compile. An employee record has an employee’s name 
(inherited from the class Person), an annual salary represented as a single value of type double, a year the employee started work as a single value of type int and a national insurance number,
 which is a value of type String.
2.2>>Your class should have a reasonable number of constructors and accessor methods, 
as well as an equals method. Write another class containing a main method to 
fully test your class definition.*/

// person class
class  Person{
	String fullName;
	int age;
	String areaName;
	int pin;
	String city;
	String state;
	// person constructor to initialize the members
	public Person(String fullName, int age, String areaName, int pin, String city, String state) {
		this.fullName = fullName;
		this.age = age;
		this.areaName = areaName;
		this.pin = pin;
		this.city = city;
		this.state = state;
	}	
	// method to display the details
	void displayDetails() {
		System.out.println("The person's details are as per the following -");
		System.out.println(" Name of the person:- "+ fullName);
		System.out.println(" Age of the  person:- "+ age);
		System.out.println(" Address  local area name:- "+ areaName);
		System.out.println(" Pin code of the area:- "+ pin);
		System.out.println(" city:- "+ city);
		System.out.println(" state:- "+ state);
	}
	
}
// Employee inherits properties of Person
class Employee extends Person{
	double annualSalary;
	int    joiningYear;
	String nationalInsuranceNumber;
	// employee class constructor
	public Employee(String fullName, int age, String areaName, int pin, String city, String state, double annualSalary,
			int joiningYear, String nationalInsuranceNumber) {
		super(fullName, age, areaName, pin, city, state);
		this.annualSalary = annualSalary;
		this.joiningYear = joiningYear;
		this.nationalInsuranceNumber = nationalInsuranceNumber;
	}
	// method to display the output
	void displayDetailsOfEmployee() {
		displayDetails() ;
		System.out.println(" Annual salary  : "+annualSalary);
		System.out.println(" Joining year of  "+fullName+ " is  :" +joiningYear);
		System.out.println(" National Insurance Number is : "+ nationalInsuranceNumber );
	}
}

public class Employeeconstructor {

	public static void main(String[] args) {
		// create the object
		Employee newEmp = new Employee("Tushyap Bari",21,"Viveknagar",228001,"Sultanpur","Uttar Pradesh",5.5,2022,"2525140");
		// call the method to get the output
        newEmp.displayDetailsOfEmployee();
	}

}
