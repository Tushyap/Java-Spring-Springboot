package javaUnitTestingImplementation;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class JavaUnitTesting {
	@Test
	public void addTwoNumber () {
		
		final int expected = 10;
		final int actual = Math.addExact(8, 2);
		// test method to perform unit testing
		assertEquals(actual, expected);
		
	}

	public static void main(String[] args) {
		System.out.println("Test went good ");
		
	}

}
