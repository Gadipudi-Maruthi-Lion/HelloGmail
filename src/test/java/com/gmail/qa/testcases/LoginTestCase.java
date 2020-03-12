package com.gmail.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.gmail.qa.base.testbase;
import com.gmail.qa.pages.Homepage;
import com.gmail.qa.pages.Loginpage;
import com.gmail.qa.pages.googlePhotosPage;

public class LoginTestCase extends testbase{

	@Test(priority=1)
	public void LoginToApplication() throws InterruptedException  {

		Loginpage lp = new Loginpage();
		lp.login(driver);
	}

	@Test(priority=2)
	public void composeNewMail() throws InterruptedException {
		Homepage hm = new Homepage();
		hm.sendmail(driver);

	}

	@Test(priority=3)
	public void logoutApplication() throws InterruptedException {
		Homepage hm = new Homepage();
		hm.logout(driver);

	}


}
