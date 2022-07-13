package org.globallogic;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LifeCycleTest {
	
	MathUtils obj = new MathUtils();
	@BeforeAll
	public static   void printOutput(){
		System.out.println("Before All working properly");
	}

	@BeforeEach
	public void print() {
		System.out.println(" Before Each working  properly");
	}
    @Test
	public void displaysquare() {
		//tests works in two ways in order to get the output
		//1.actual 2, expected
		int expected=25;
		int actual=obj.square(5);
		assertEquals(expected,actual);
		System.out.println("Test one executed");
	}

	

	@AfterAll
	 static void  afterclass(){
		System.out.println("@AfterAll executed");
	}

}
