package com.it.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NavigateCommandExamples extends BaseDriver{
	String url ="https://www.daraz.com.bd/";
	
	@Test
	public void navigateTest() throws InterruptedException {
		
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement loginButton = driver.findElement(By.xpath("//a[normalize-space()='Login']"));
		loginButton.click();
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.google.com/");
	}

}
