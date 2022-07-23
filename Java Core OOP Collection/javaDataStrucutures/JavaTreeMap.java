package javaDataStrucutures;

import java.util.TreeMap;

public class JavaTreeMap {

	public static void main(String[] args) {
		   TreeMap<Integer,String> tMap=new TreeMap<Integer,String>();    
		      tMap.put(100,"B.tech");    
		      tMap.put(102,"M.tech");    
		      tMap.put(101,"BCA");    
		      tMap.put(103,"MCA"); 
		      tMap.put(104,"BBA");    
		      tMap.put(105,"MBA");   
		      
		      // print the tree map
		      System.out.println("Elements of Tree Map :"+ tMap);
		      
		      // remove the specific element from the list
		      tMap.remove(102);      
		      System.out.println("After remove() method"+ tMap); 
		      
		      // get specific element by key
		      System.out.println("get() method : "+ tMap.get(100));
		      
		      // size of treeMap
		      System.out.println("size() method : "+ tMap.size());
		      
		      //descending order  
		      System.out.println("descendingMap() method : "+tMap.descendingMap());  
		      

	}

}
