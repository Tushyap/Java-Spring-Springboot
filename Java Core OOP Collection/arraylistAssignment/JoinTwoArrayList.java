package arraylistAssignment;
import java.util.*;
public class JoinTwoArrayList {

	public static void main(String[] args) {
		 //  ArrayList1
        ArrayList<String>listOne = new ArrayList<String>();
  
        // add object in  the ArrayList
        listOne.add("Hindi");
        listOne.add("English");
        listOne.add("Spanish");
  
        // Print the ArrayList 1
        System.out.println("ArrayList 1 : " + listOne);
  
        //  ArrayList2
        ArrayList<String> listTwo = new ArrayList<String>();
  
        listTwo.add("Tamil");
        listTwo.add("Kannad");
  
        // Print the ArrayList 2
        System.out.println("ArrayList 2: " + listTwo);
  
        // Join the ArrayLists
        // using Collection.addAll() method
        listOne.addAll(listTwo);
  
        // Print the joined ArrayList
        System.out.println("ArrayList after joining: " + listOne);

        
	}

}
