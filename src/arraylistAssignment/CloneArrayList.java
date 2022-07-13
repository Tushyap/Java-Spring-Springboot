package arraylistAssignment;

import java.util.ArrayList;


public class CloneArrayList {

	public static void main(String[] args) {
		 ArrayList<String> StudentList = new ArrayList<String>(4);
		   Object cloneList;
	      //Added 4 elements
	       StudentList.add("David");
	       StudentList.add("Tom");
	       StudentList.add("Rohit");
	       StudentList.add("Paul");
	      
	       System.out.println("Elements in StudentList are: ");
	       System.out.println(StudentList);
	  
	       cloneList = StudentList.clone();
	       System.out.println("Elements in cloneList are:");
	       System.out.println(cloneList);
	       

	        

	}

}
