package javaDataStrucutures;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class JavaVector {

	public static void main(String[] args) {
		Vector<String> fruits = new Vector<String>(2);
		fruits.addElement("apple");
		fruits.addElement("mango");
		fruits.addElement("banana");
		fruits.addElement("kiwi");
		fruits.addElement("orange");
		System.out.println("elements of vector:"+ fruits);// print the fruits list
		
		System.out.println("size of vector:"+ fruits.size());// size of the vector 
		
		System.out.println("capacity of vector:"+ fruits.capacity());// capacity of the vector
		
		//void setSize(size): It changes the existing size with the specified size.
		fruits.setSize(10);
		System.out.println("size of vector setSize():"+ fruits.size() );
		
		//boolean contains(Object element): This method checks whether the specified element is present 
		//in the Vector. If the element is been found it returns true else false.
		System.out.println("contains() method :"+ fruits.contains("banana"));
		
		List<String> list = new ArrayList<String>();  
        //Add values in the List  
        list.add("apple");  
        list.add("mango");  
          
        //boolean containsAll(Collection c): It returns true if all the elements of collection c are present in the Vector.
        System.out.println("Does vector contains all list elements?: "+fruits.containsAll(list));  
          
        //Object elementAt(integer index): It returns the element present at the specified location in Vector.
        System.out.println("elementAt() method :"+ fruits.elementAt(3));
        
        
        //Object firstElement(): It is used for getting the first element of the vector.
        System.out.println("firstElement() method :"+ fruits.firstElement());
        
        //Object lastElement(): Returns the last element of the array.
        System.out.println("lastElement() method :"+ fruits.lastElement());
        
        //Object get(integer index): Returns the element at the specified index.
        System.out.println("get() method :"+ fruits.get(3));
        
        //boolean isEmpty(): This method returns true if Vector doesn’t have any element.
        System.out.println("isEmpty() method :"+ fruits.isEmpty());
        
        //boolean removeElement(Object element): Removes the specified element from vector.
        System.out.println("removeElement() method :"+ fruits.removeElement("kiwi"));
        
          
		
		
		
		
		
		

	}

}
