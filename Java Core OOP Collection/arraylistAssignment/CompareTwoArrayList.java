package arraylistAssignment;

import java.util.*;  
public class CompareTwoArrayList {

	public static void main(String[] args) {
		//first array list  
		ArrayList<String> firstList=new ArrayList<String>();  
		//adds elements to the array list  
		firstList.add("Tushyap");  
		firstList.add("Shivam");  
		firstList.add("Tushar");  
		firstList.add("Vishu");  
		System.out.println(firstList);  
		//second array list      
		List<String> secondList=new ArrayList<String>();  
		//adds elements to the array list  
		secondList.add("Tushyap");  
		secondList.add("Shivam");  
		secondList.add("Tushar");  
		secondList.add("Vishu");  
		System.out.println(secondList);  
		//comparing both lists  
		boolean value = firstList.equals(secondList); //returns true because lists are equal  
		System.out.println("Is both lists are equal: "+ value);  
		
		
		
		// to make Array list empty 
		// use clear() method 
        secondList.clear();
        // after clear method 
        System.out.println(secondList); 
        
        
        // check if the list is empty or not using function
        boolean val = secondList.isEmpty();
        if (val == true)
            System.out.println("The ArrayList is empty");
        else
            System.out.println("The ArrayList is not empty");
        
        // create an empty array list with an initial capacity
        ArrayList<Integer> arrlist = new ArrayList<Integer>(5);
        
        // use add() method to add elements in the list
        arrlist.add(35);
        arrlist.add(20);
        arrlist.add(25);
        
        // Trim the array list
        arrlist.trimToSize();

        // let us print all the elements available in list
        for (Integer number : arrlist) {
           System.out.println("Number = " + number);
        }
        
        System.out.println("Size of ArrayList: " + arrlist.size());
        
	}

}
