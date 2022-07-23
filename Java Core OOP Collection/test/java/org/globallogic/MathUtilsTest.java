package org.globallogic;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;


public class MathUtilsTest {

	//Wrapper object
	 MathUtils mathUtils = new MathUtils();
	@BeforeAll
	public  static void beforeclass(){
		System.out.println("BeforeAll executed");
	}

	@BeforeEach 
	 void setupThis(){ 
		System.out.println("@BeforeEach executed");
	}
	
	
	public void test() {
		MathUtils mathUtils=new MathUtils();
		//tests works in two ways in order to get the output
		//1.actual 2, expected
		int expected=20;
		int actual=mathUtils.add(10, 10);
		assertEquals(expected,actual);
		System.out.println("Test one executed");
	}
	@RepeatedTest(5)
	public void displayPower() {
		
		//tests works in two ways in order to get the output
		//1.actual 2, expected

		int expected=25;
		
		assertEquals(expected,mathUtils.square(5));
		System.out.println("Test two executed");
	}
	@Test
	public void testCircle() {
		MathUtils mathUtils = new MathUtils();
		assertEquals(314.1343345,mathUtils.computeCircleArea(10),314.13);
		System.out.println("Should return right circle area ");
	}
	
	
	
	@AfterEach																			//After Each annotation
	public void tearThis(){																	//Method for afterEach
		System.out.println("AfterEach executed");										//Print statement
	}

	@AfterAll																			//AfterAll Annotation
	public static void tear(){																		//Method for AfterAll
		System.out.println("AfterAll executed");										//Print statement
	}
	
	

}