package com.softserve.edu;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppTest {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("\t\tclass AppTest: @BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("\t\tclass AppTest: @AfterClass");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\t\t\tclass AppTest: @BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\t\t\tclass AppTest: @AfterMethod");
	}

	@Test
	public void testApp() {
		System.out.println("\t\t\t\tclass AppTest: @Test");
		System.out.println("\t\t\t\tclass AppTest: Hello Lv465.Java");
		Assert.assertTrue(true);
	}
	
}
