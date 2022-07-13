package javaDataStrucutures;

import java.util.Enumeration;
import java.util.Hashtable;

public class JavaHashTable {

	public static void main(String[] args) {
		 Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"Rahul");  
 
		  System.out.println("Element of hash table: "+ hm);// print element of Hash table
		  
		  Enumeration<Integer> names = hm.keys();
		  while(names.hasMoreElements()) {
			  Integer key = names.nextElement();
			  System.out.println("Keys: "+ key + "  & values " + hm.get(key));
		  }
		  

	}

}
