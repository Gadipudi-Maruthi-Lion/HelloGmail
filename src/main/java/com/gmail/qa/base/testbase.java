package com.gmail.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class testbase {

	public static WebDriver driver;

	public String username = "maruthigadipudi.work@gmail.com";
	public String password = "anjaiahgaru";
	public static String url = "https://www.gmail.com";

	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\Maruthi Work\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);

		
	}
	
	
	
	@AfterClass
	public void exitBrowser() {
		driver.quit();
			
	}
	

	
	

}
