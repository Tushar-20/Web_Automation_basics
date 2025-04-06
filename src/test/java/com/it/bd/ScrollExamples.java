package com.it.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollExamples extends BaseDriver{
	
	String url ="https://www.daraz.com.bd/";
	
	@Test
	public void testScroll() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Specific
		WebElement location = driver.findElement(By.xpath("//p[normalize-space()='Categories']"));
		js.executeScript("arguments[0].scrollIntoView(true);",location);
		Thread.sleep(2000); 
		
		//Top
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(2000); 
		
		//Down
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000); 
		
	}

}
