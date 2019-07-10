package org.amdocs.lab2.Calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class DivideTest {
@Test
	public void testDivide() {
		Divide obj=new Divide();
		double result=obj.getResult(10,2);
		assertEquals(5,result,0.0001);
	}
}
