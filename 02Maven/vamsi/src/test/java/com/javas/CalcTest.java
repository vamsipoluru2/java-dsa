package com.javas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalcTest {

	@Test
	void testDivide() {
		Calc cal = new Calc();
		assertEquals(2, cal.divide(10, 5));
	}

	@Test
	void testDivideByZero() {
		Calc cal = new Calc();
		assertThrows(ArithmeticException.class, () -> cal.divide(10, 0));
	}
}
