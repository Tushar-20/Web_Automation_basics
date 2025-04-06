package com.it.bd;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitsExamples extends BaseDriver{ 
	String url = "https://demo.nopcommerce.com/";
	
	@Test
	public void is_visible() {
		driver.manage().window().maximize();
		driver.get(url);
		
		//Implicit
		//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement search = (WebElement) wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("mall-searchterms"))  );
				
		//driver.findElement(By.id("small-searchterms"));
		
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