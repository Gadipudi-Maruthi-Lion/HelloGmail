package com.gmail.qa.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
	
	//for message chating purpose
	/*By selectmessageBTN = By.xpath("//button[@title='New conversation']");
	By namesearch = By.xpath("//input[@placeholder=\"Enter name, email, or phone\"]");
	By selectname = By.xpath("//div[text()='Sampurna Gadipudi']");
	By messageTb = By.xpath("//div[@role='textbox']");
	By closemessagebox = By.xpath("//button[@title='Close']");*/
	
	//for new mail compose
	By composeBTN = By.xpath("//div[text()='Compose']");
	By tomailTB = By.name("to");
	By selectmailid = By.xpath("//div[text()='Gadipudi Lion']");
	By subjectTB = By.name("subjectbox");
	By messageTB = By.xpath("//div[@aria-label='Message Body']");
	By sendBTN = By.xpath("//div[@data-tooltip='Send ‪(Ctrl-Enter)‬']");
	
	By googleAppBTN = By.xpath("//*[@aria-label='Google apps']");
	By PhotosIcon = By.xpath("//ul//li//span[text()='Photos']");
	
	
	
	//for logout
	By logoutIcon = By.xpath("(//a[@role='button'])[3]");
	By signoutBtn = By.linkText("Sign out");
	
	
	public void sendmail(WebDriver driver) throws InterruptedException {
		driver.findElement(composeBTN).click();
		Thread.sleep(1000);
		driver.findElement(tomailTB).sendKeys("chandana.maru125@gmail.com");
		Thread.sleep(1000);
		driver.findElement(selectmailid).click();
		driver.findElement(subjectTB).sendKeys("Automation Testing Message");
		driver.findElement(messageTB).sendKeys("Hi Lion,"
				+ "This message was sent by automation by selenium +");
		driver.findElement(sendBTN).click();
		
	}
	
	public void openpPhotos(WebDriver driver) throws InterruptedException {
		driver.findElement(googleAppBTN).click();
		Thread.sleep(1500);
		driver.findElement(PhotosIcon).click();
		String parentwin = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();
		for (String childwin : allwin) {
			System.out.println(childwin);
			driver.switchTo().window(childwin);
			
		}
		
	}
	
	
	/*public void sendMessage(WebDriver driver) throws InterruptedException {
		
		Wait wait = new WebDriverWait(driver,20);
		
		
		driver.findElement(selectmessageBTN).click();
		driver.findElement(namesearch).sendKeys("Sampurna");
		driver.findElement(selectname).click();
		Thread.sleep(1000);
		driver.findElement(messageTb).click();
		driver.findElement(messageTb).sendKeys("Hai this is automation test message+"
				+ "thank you for your patience"+Keys.ENTER);
		driver.findElement(closemessagebox).click();

	}*/

	
	public void logout(WebDriver driver) throws InterruptedException {
		
		driver.findElement(logoutIcon).click();
		Thread.sleep(500);
		driver.findElement(signoutBtn).click();
		
	}
	
}