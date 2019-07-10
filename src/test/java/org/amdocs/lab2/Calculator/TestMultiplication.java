package org.amdocs.lab2.Calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMultiplication {
	
	@Test
	public void checkMultiplication()
	{
		Multiplication multiplication = new Multiplication();
		double actualResult = multiplication.multiply(10.0, 8.0);
		double expectedResult = 80.0;
		assertEquals(actualResult , expectedResult, 0.0001);
	}
}