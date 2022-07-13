package javaCollection_Queue;

import java.util.PriorityQueue;

public class JavaPriorityQueue {

	public static void main(String[] args) {
		
	 PriorityQueue<String> queueElements = new PriorityQueue<String>();
	 
	 queueElements.add("Tushyap");
	 queueElements.add("Java");
	 queueElements.add("Backend");
	 queueElements.add("Developer");
	 // it will give sorted output
	 System.out.println("Priority queue elements are: "+ queueElements);

	}

}
