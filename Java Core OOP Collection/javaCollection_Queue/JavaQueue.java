package javaCollection_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {

	public static void main(String[] args) {
		// creating object to the queue
		Queue<String> names = new LinkedList<String>();
		// adding elements to the queue
		names.add("Tushyap");
		names.add("Shivam");
		names.add("Prince");
		names.add("Sachin");
		names.add("Tushar");
        System.out.println("Elements of the queue: "+ names);
        
        // remove elements from the queue
        System.out.println("remove elements of the queue remove() method envoked : "+ names.remove());
        
        // element() method tells the head element of the queue
        System.out.println("head element of the queue after removal, element()method envoked : "+ names.element());
        
        // Poll()  method removes and returns head element of the queue, if queue is empty returns null
        System.out.println("poll() method envoked : "+ names.poll());
        
        // it works as element() method , however returns null if queue is empty
        System.out.println("peek() method envoked : "+ names.peek());
        
        // check list again
        System.out.println("Elements of the queue : "+ names);
        
	}

}
