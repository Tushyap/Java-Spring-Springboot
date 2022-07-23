package javaCollection_Queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class JavaDequeue {

	public static void main(String[] args) {
		Deque<String> queueEle = new LinkedList<String>();
		// add elements
		queueEle.add("Tushyap");
		queueEle.add("shivam");
		queueEle.add("Sachin");
		queueEle.add("Rahul");
		queueEle.add("Niraj");
		// print the list
		System.out.println("deque elements are: "+ queueEle);
		// add element at first position
		queueEle.addFirst("Vishu");
		System.out.println("addFirst() envoked: "+ queueEle);
		// add element at last position
		queueEle.addLast("Aryan");
		System.out.println("addLast() envoked: "+ queueEle);
		
		// remove element from first position
		queueEle.removeFirst();
		System.out.println("removeFirst() envoked: "+ queueEle);
		
		// List iterator
		ListIterator<String> listItr =  null;
		
		List<String> mobilePhones = new ArrayList<String>();
		mobilePhones.add("Iphone");
		mobilePhones.add("samsung");
		mobilePhones.add("onePlus");
		mobilePhones.add("oppo");
		
		// obtaining list iterator
		listItr = mobilePhones.listIterator();
		// traversing the list 
		System.out.println("traversing the list in forward direction ");
		while(listItr.hasNext()) {
			System.out.println(listItr.next());  
		}
		System.out.println("list iterator in reverse  ");
		// traversing the list reverse
				while(listItr.hasPrevious()) {
					System.out.println(listItr.previous());  
				}
		
		// iterator 
		  Iterator<String> itr=queueEle.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		
		

	}

}
