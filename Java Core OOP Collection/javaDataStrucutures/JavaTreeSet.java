package javaDataStrucutures;

import java.util.TreeSet;

public class JavaTreeSet {

	public static void main(String[] args) {
		
		//Creating and adding elements  
		  TreeSet<String> treeList=new TreeSet<String>();  
		  treeList.add("Java");  
		  treeList.add("JavaScript");  
		  treeList.add("React");  
		  treeList.add("Angular"); 
		  treeList.add("Python"); 
		  //TreeSet class maintains ascending order
		  System.out.println("Elements of tree set :"+ treeList);
		  
		  // get first element of list
		  System.out.println("first() method : "+treeList.first());
		  
		  // poll first and last method 
		  System.out.println("first Value: "+treeList.pollFirst());    
	      System.out.println("last  Value: "+treeList.pollLast());  
	      
	      // reverse the list
	      System.out.println("Reverse list: "+treeList.descendingSet()); 


	}

}
