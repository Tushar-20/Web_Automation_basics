package com.it.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrowserCommandExamples extends BaseDriver{
	
	String url ="https://www.daraz.com.bd/";
	
	@Test
	public void browserCommandTest() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement loginButton = driver.findElement(By.xpath("//a[normalize-space()='Login']"));
		loginButton.click();
		Thread.sleep(3000);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

}
