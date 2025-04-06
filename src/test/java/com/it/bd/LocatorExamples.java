package com.it.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorExamples extends BaseDriver{
	
	String url = "https://demo.nopcommerce.com/";
	
	@Test 
	public void locatorTest() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement search =driver.findElement(By.id("small-searchterms"));
		search .click();
		search.sendKeys("Macbook");
		Thread.sleep(5000);
		
		WebElement Login = driver.findElement(By.xpath("//a[normalize-space()='Log in']"));
		Login .click();
		Thread.sleep(5000);
		
		//Name
		WebElement Email = driver.findElement(By.name("Email"));
		Email.sendKeys("tushar@gmail.com");
		Thread.sleep(5000);
	}

}
