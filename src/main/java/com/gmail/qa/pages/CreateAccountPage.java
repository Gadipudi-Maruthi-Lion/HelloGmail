package com.gmail.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.gmail.qa.base.testbase;

public class CreateAccountPage extends testbase{
	By firstname = By.name("firstName");
	By lastname = By.name("lastName");
	By username = By.name("Username");
	By password = By.name("Passwd");
	By Confirmpassword = By.name("ConfirmPasswd");
	By nextBTN = By.xpath("//span[text()='Next']");
	By errormsg = By.xpath("//*[contains(text(),'That username is taken. Try another.')]");
	
	
	public void signupNewAccount(WebDriver driver) {
		driver.findElement(firstname).sendKeys("Maruthi");
		driver.findElement(lastname).sendKeys("lion");
		driver.findElement(username).sendKeys("chandana.maru125");
		driver.findElement(password).sendKeys("Maruthi@123");
		driver.findElement(Confirmpassword).sendKeys("Maruthi@123");
		driver.findElement(nextBTN).click();

		if(driver.findElement(errormsg).isDisplayed()) {
			System.out.println("Test Case Passed");
			
		}else
			System.out.println("Test Case Failed");		
	}
			

}
