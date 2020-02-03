package com.softserve.edu.condition;

import org.junit.Assert;
import org.junit.Test;

public class CalcTest {

	@Test
	public void testAdd1() {
		Calc calc = new Calc();
		double expected;
		double actual;
		//
		expected = 4;
		actual = calc.add(2, 2);
		Assert.assertEquals(expected, actual, 0.001);
	}

	@Test
	public void testAdd2() {
		Calc calc = new Calc();
		double expected;
		double actual;
		//
		expected = 5;
		actual = calc.add(2, 3);
		Assert.assertEquals(expected, actual, 0.001);
	}

	@Test
	public void testDiv1() {
		Calc calc = new Calc();
		double expected;
		double actual;
		//
		expected = 5;
		actual = calc.div(25, 5);
		Assert.assertEquals(expected, actual, 0.001);
	}

	@Test
	public void testDiv2() {
		Calc calc = new Calc();
		double expected;
		double actual;
		//
		expected = 2.5;
		actual = calc.div(20, 8);
		Assert.assertEquals(expected, actual, 0.001);
	}

}
