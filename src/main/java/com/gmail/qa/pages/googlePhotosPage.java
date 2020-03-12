package com.gmail.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class googlePhotosPage {
	
	By menuBTN = By.xpath("//button[@title='Main menu']");
	
	
	
	public void checkMenuIcon(WebDriver driver) {
		boolean menu = driver.findElement(menuBTN).isDisplayed();
		Assert.assertTrue(menu);
		
	}
	
	
	

}
