package javaDataStrucutures;

import java.util.HashMap;

public class JavaHashMap {

	public static void main(String[] args) {
	HashMap<Integer, String> hMap = new HashMap<Integer, String>();
	hMap.put(2, "Lion");
	hMap.put(12, "Fox");
	hMap.put(22, "Wolf");
	hMap.put(32, "Dog");
	hMap.put(42, "Rabbit");
	hMap.put(null, null);
    System.out.println("Element of hashMap: "+ hMap);// print element of HashMap
    // access particular element
    System.out.println("Element at particular key , get() method : "+ hMap.get(12));
    System.out.println("Element at particular key , get() method : "+ hMap.get(22));
    System.out.println("Element at particular key , get() method : "+ hMap.get(32));
    
	}

}
