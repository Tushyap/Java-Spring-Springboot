package employee.details;
//2. Employee details (empid,empfname,emplaname,empcity,empstate)

class Employee{
	// variables for employee constructor
		 int    empId;
	     String empName;
	     String empEmail;
	     String empDepartment;
	     String empCity;
	     String empState;
	    // create constructor to initialize the variables
		public Employee(int empId, String empName, String empEmail, String empDepartment, String empCity, String empState) {
			this.empId = empId;
			this.empName = empName;
			this.empEmail = empEmail;
			this.empDepartment = empDepartment;
			this.empCity = empCity;
			this.empState = empState;
		}
		// create display method to show the employee details on screen
		void display() {
			   System.out.println("Printing  Employee's Details using constructor assigned values");
			   System.out.println("Employee ID         : "+ empId);
			   System.out.println("Employee Name       : "+ empName);
			   System.out.println("Employee Email      : "+ empEmail);
			   System.out.println("Employee Department : "+ empDepartment);
			   System.out.println("Employee City       : "+ empCity);
			   System.out.println("Employee State       : "+ empState);
		}
		
}
public class EmployeeDetails {

	public static void main(String[] args) {
		// create object of the class
				Employee empObj = new Employee(512008, "Tushyap Bari", "tushyap.nari@globallogic.com",
						                                             "Engineering", "Lucknow","uttar pradesh");
				// call display method
				empObj.display();

	}

}
