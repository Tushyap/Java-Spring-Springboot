package javaDataStrucutures;


import java.util.HashSet;

public class JavaHashSet {

	public static void main(String[] args) {
		HashSet< String> hSet = new HashSet<String>();
		hSet.add("BMW");
		hSet.add("Rolls Royce");
		hSet.add("Mercedes");
		hSet.add("Audi");
		hSet.add("Ford");
		
		// print element of HashSet
		System.out.println("Element of hashSet: "+ hSet);
		
		//Removing specific element from HashSet  
        hSet.remove("BMW");  
        System.out.println("remove(object) method: "+hSet);  
        
        
        HashSet<String> hashSet=new HashSet<String>();  
        hashSet.add("Hyundai");  
        hashSet.add("Honda");  
        hSet.addAll(hashSet);  
        System.out.println("Updated List: "+hSet);  
        //Removing all the new elements from HashSet  
        hSet.removeAll(hashSet);  
        System.out.println("removeAll() method: "+hSet); 
        
        // size of hash set
        System.out.println("size() method: "+hSet.size()); 
        
        System.out.println("contains() method: "+hSet.contains("BMW")); 
        
        System.out.println("isEmpty() method: "+hSet.isEmpty()); 
        
        //Removing all the elements available in the set  
        hSet.clear();  
        System.out.println("clear() method: "+hSet); 
		

	}

}
