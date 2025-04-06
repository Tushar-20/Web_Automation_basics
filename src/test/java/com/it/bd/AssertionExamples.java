package com.it.bd;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class AssertionExamples extends BaseDriver{
	
	String url = "https://www.amazon.com/";
	
	@Test (priority =0)
	public void assertion_Example() {
		driver.manage().window().maximize();
		driver.get(url);
		
		String expectedTitle = "Amazon.com. Spend less. Smile more.";
		String actualTitle = driver.getTitle();
		
/*	
		//Hard Assertion
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Hello SQA");
	}
	
	@Test(priority =1)
	public void assertion_Example_second () {
		System.out.println("Hello SQA Engineer");
	}
	*/
	//Soft Assertion
	
	SoftAssert softAssert = new SoftAssert();
	softAssert.assertEquals(expectedTitle, actualTitle);
	System.out.println("Hello SQA Engineer"); 
	
	softAssert.assertAll();
	}	
	@Test(priority =1)
	public void assertion_Example_second () {
		System.out.println("2nd Test");
	}
}

