package linkedListCollection;

import java.util.*;

public class BasicOperationOfLinkedlist {

	public static void main(String[] args) {

		LinkedList<String> firstList=new LinkedList<String>();  
		
		// add elements to the linked list
        System.out.println("add  elements in first list: "+firstList);  
        firstList.add("Tushyap");  
        firstList.add("Shivam"); 
        firstList.add("Vishu");  
       
        System.out.println("elements of first list: "+firstList); 
        
        // get first element 
        System.out.println("get first element of the list : " + firstList.getFirst());
        
        // get last element 
        System.out.println("get last element of the list : " + firstList.getLast());
        
        // get element  at specific index 
        System.out.println("get element at specific index: " + firstList.get(1));
        
        // append linked list
        // create a new list having few elements
        List<String> thirdList = new ArrayList<String>();
        thirdList.add("Naveen");
        thirdList.add("Tushar");
        thirdList.add("Rahul");
        // Append the list elements to LinkedList
        firstList.addAll(thirdList);
        // Displaying the LinkedList after addAll
        System.out.println("After add all: LinkedList: " + firstList);
        
        // iterator example 
        System.out.println("Iterated List");
        Iterator<String> iteratedList=firstList.iterator();  
        while(iteratedList.hasNext()){  
         System.out.println(iteratedList.next());  
        }  
        
        //iterating the list of elements in reverse order  
        // reverse iterator example 
        System.out.println("Reversed Iterated List");
        Iterator<String> reverseIterator=firstList.descendingIterator();  
        while(reverseIterator.hasNext())  
        {  
            System.out.println(reverseIterator.next());  
        }  
        
        //    check whether a particular element exist in a list or not
        
        System.out.println("check whether a particular element exist in a list or not : " + firstList.contains("Tushyap"));
        
        //    get sublist of the main list
        System.out.println("sublist of : LinkedList: " + firstList.subList(0, 4));
        
        
        //Adding an element at the specific position  
        firstList.add(1, "Yash");  
        System.out.println("After element at index 1 method: "+firstList); 
        
        //Adding an element at the first position  
        firstList.addFirst("Sachin");  
        System.out.println("Add element at first position: "+firstList);  
        
        //Adding an element at the last position  
        firstList.addLast("Shubham");  
        System.out.println("Add element at last of the list: "+firstList); 
        // replace element        
        System.out.println("Replace element : "+firstList.set(2, "Kartik")); 
        
        // create a second LinkedList
        Object secondList=new LinkedList<String>();
        // clone list1
        secondList=  firstList.clone();
        System.out.println("clone list1 to list 2: "+secondList); 
        
       
        
       // remove elements from the linked list
       //Removing specific element from list  
       firstList.remove("Shuhbham");  
       System.out.println("Removing specific element from list : "+firstList); 
       
       //Removing element on the basis of specific position  
       firstList.remove(0);  
       System.out.println("Removing element on the basis of specific position  : "+firstList);  
       
       //Removing first element from the list  
       firstList.removeFirst();  
       System.out.println("Removing first element from the list : "+firstList);  
       
       //Removing last  element from the list  
       firstList.removeLast();  
       System.out.println("Removing last  element from the list "+firstList);
       
       //Removing all the elements of the list       
       firstList.clear();  
       System.out.println("Removing all the elements of the list: "+firstList);  
       
       

	}

}
