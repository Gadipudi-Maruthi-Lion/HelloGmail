package com.gmail.qa.testcases;

import org.testng.annotations.Test;

import com.gmail.qa.base.testbase;
import com.gmail.qa.pages.Loginpage;
import com.gmail.qa.pages.MaruthiFolder;

public class MaruthiFolderTest extends testbase{
	
	@Test(priority=1)
	public void LoginToApplication() throws InterruptedException  {

		Loginpage lp = new Loginpage();
		lp.login(driver);
	}
	
  @Test
  public void openFolder() {
	  MaruthiFolder folder = new MaruthiFolder();
	  folder.myFolder(driver);
	  
	  
  }
}
