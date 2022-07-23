package javaDataStrucutures;

import java.util.Stack;

/*
  * empty()	-> The method checks the stack is empty or not.
push() ->The method pushes (insert) an element onto the top of the stack.
pop() ->The method removes an element from the top of the stack and returns the same element as the value of that function.
peek()	->	The method looks at the top element of the stack without removing it.
search(Object o) -> The method searches the specified object and returns the position of the object.*/



public class StackDataStructures {
	public static void main(String[] args) {
		//creating an instance of Stack class  
		Stack<Integer> stk= new Stack<>();  
		// checking stack is empty or not  
		boolean result = stk.empty();  
		System.out.println("Is the stack empty? " + result);  
		// pushing elements into stack  
		stk.push(78);  
		stk.push(113);  
		stk.push(90);  
		stk.push(120);  
		//prints elements of the stack  
		System.out.println("Elements in Stack: " + stk);  
		
		//prints size of the stack  
		System.out.println("Size of Stack: " + stk.size()); 
		
		for (int i =0; i<= stk.size(); i++) {
			System.out.println("Elements in Stack: " + stk); 
			
		}
		System.out.println("Elements in Stack: " + stk.pop());
	}
}
