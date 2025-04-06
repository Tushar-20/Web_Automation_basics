package com.it.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class VisibilityExamples extends BaseDriver{ 
	String url = "https://demo.nopcommerce.com/";
	
	@Test
	public void is_visible() {
		driver.get(url);
		driver.manage().window().maximize();
		WebElement search =driver.findElement(By.id("small-searchterms"));
		
		try {
			if(search.isDisplayed() ) {
				search .click();
				search.sendKeys("Macbook");
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			System.out.println("Search is not locatable. ");
		}
	}

}
