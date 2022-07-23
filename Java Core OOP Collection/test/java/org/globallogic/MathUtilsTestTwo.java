package org.globallogic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class MathUtilsTestTwo {
	MathUtils mathUtils;
	@BeforeEach
	public void init() {
		mathUtils = new MathUtils();
		
	}
	
@Test
	public void test() {
		MathUtils mathUtils = new MathUtils();
		assertEquals(314.1343345,mathUtils.computeCircleArea(10),314.13);
		System.out.println("Should return right circle area ");
	}
@Test
public void testDivide() {
//	final MathUtils mathUtils = new MathUtils();
	assertThrows(ArithmeticException.class, () -> mathUtils.divide(10, 0));
}


}
