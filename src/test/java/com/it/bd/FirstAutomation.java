package com.it.bd;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FirstAutomation extends BaseDriver{
	
	String url ="https://maven.apache.org/download.cgi";
	
	@Test
	public void openUrl() throws InterruptedException {
		
		driver.get(url);	
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Maven Plugins']")).click();
		Thread.sleep(2000);
	}

}
