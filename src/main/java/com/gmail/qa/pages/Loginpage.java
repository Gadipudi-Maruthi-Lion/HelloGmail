package com.gmail.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gmail.qa.base.testbase;

public class Loginpage extends testbase{

	By username = By.name("identifier");
	By nextBTN = By.xpath("//span[text()='Next']");
	By password = By.xpath("//*[@name='password']");
	By nextBTN2 = By.xpath("//span[text()='Next']");
	
	By createAccountBTN = By.xpath("//span[text()='Create account']");
	By myself = By.xpath("//div[text()='For myself']");


	
	public void login(WebDriver driver) throws InterruptedException {
		
		driver.findElement(username).sendKeys("maruthigadipudi.work@gmail.com");
		driver.findElement(nextBTN).click();
		Thread.sleep(1000);
		driver.findElement(password).sendKeys("anjaiahgaru");
		driver.findElement(nextBTN2).click();
	}
	
	public void clickOnCreateAccountButton(WebDriver driver) {
		
		driver.findElement(createAccountBTN).click();
		driver.findElement(myself).click();
		
	}
	
}