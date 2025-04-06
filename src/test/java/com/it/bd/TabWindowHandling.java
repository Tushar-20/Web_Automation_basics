package com.it.bd;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class TabWindowHandling extends BaseDriver{
	
	String url = "https://www.upwork.com/";
	String secondUrl = "https://www.cricbuzz.com/";
	
	@Test
	public void TabTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		
		String orginalTab = driver.getWindowHandle();
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		String secondTab = driver.getWindowHandle();
		driver.get(secondUrl);
		Thread.sleep(3000);
		
		driver.switchTo().window(orginalTab);
		Thread.sleep(3000);
		driver.switchTo().window(secondTab);
		Thread.sleep(3000);
		
	}

}
