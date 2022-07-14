package studentManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.student.manage.StudentDao;
import org.student.manage.StudentModel;

public class Student {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		  while(true) {
			  System.out.println("Press 1 to add student data");
			  System.out.println("Press 2 to delete student data");
			  System.out.println("Press 3 to display student data");
			  System.out.println("Press 4 to exit app");
			  
			  int c = Integer.parseInt(br.readLine());
			  
			  if(c==1) {
				  // add student data
				  System.out.println("Enter Student Name: ");
				  String name = br.readLine();
				  
				  System.out.println("Enter Student Phone Number: ");
				  String phone = br.readLine();
				  
				  System.out.println("Enter Student City: ");
				  String city = br.readLine();
				  
				  // create student object to store student data
				  StudentModel stdData = new StudentModel(name, phone, city);
				boolean answer = StudentDao.insertStudentToDB(stdData);
				if(answer) {
					System.out.println("Details added ...");
				}else {
					System.out.println("Details didnot added ...");
				}
				  System.out.println(stdData);
				  
			  }else if(c==2) {
				  // delete student data 
				  
			  }else if(c==3) {
				  // display student data
				  
			  }else if(c==4) {
				  // exit application
				  break;
			  }else {
				  
			  }
		  }

		  System.out.println("Thank you for using my application");
		  System.out.println("See you soon bye bye...");
		  
	}

}