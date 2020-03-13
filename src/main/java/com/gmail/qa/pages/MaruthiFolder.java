package com.gmail.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.gmail.qa.base.testbase;

public class MaruthiFolder extends testbase {


	By Maruthibutton = By.xpath("//a[@title='Maruthi']");
	By selectmail = By.xpath("(//span[text()='10/13/18'])[1]");
	By clickonimg = By.xpath("//img[@id=':1h9']");


	public void myFolder(WebDriver driver) {
		driver.findElement(Maruthibutton).click();	
		driver.findElement(selectmail).click();
		driver.findElement(clickonimg).click();

	}



}
