package com.it.bd;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExamples{
	
	
	@Test
	public void TestExample() {
		System.out.println("Test...........................!");
	}
	
	@BeforeSuite
	public void beforeSuiteExample() {
		System.out.println("Before Suite...........................!");
	}
	
	@AfterSuite
	public void afterSuiteExample() {
		System.out.println("After Suite...........................!");
	}
	
	@BeforeTest
	public void beforeTestExample() {
		System.out.println("Before Test...........................!");
	}
	
	@AfterTest
	public void AfterTestExample() {
		System.out.println("After Test...........................!");
	}

}
