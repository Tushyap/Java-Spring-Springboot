package org.globallogic;

public class MathUtils {
	//create a method
	public int add(int numOne , int numTwo) {
		return numOne+ numTwo;
	}
	
	// method to be tested
	public double computeCircleArea( double radius ) {
		return Math.PI*radius*radius;
		}

	public int sub(int numOne, int numTwo) {
		int result = numOne - numTwo;
		return result;
	}
	 
	public int divide( int numOne, int numTwo) {
		return numOne/ numTwo;
		}
	public int square( int numOne) {
		return numOne *numOne;
		}
	
	
	
}