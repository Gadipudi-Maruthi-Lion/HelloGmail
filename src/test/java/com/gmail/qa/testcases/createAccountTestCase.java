package com.gmail.qa.testcases;

import org.testng.annotations.Test;

import com.gmail.qa.base.testbase;
import com.gmail.qa.pages.CreateAccountPage;
import com.gmail.qa.pages.Loginpage;

public class createAccountTestCase extends testbase{
	
	
  @Test
  public void signupTestCase() {
	  
	  Loginpage lp = new Loginpage();
	  lp.clickOnCreateAccountButton(driver);
	  
	  CreateAccountPage cp = new CreateAccountPage();
	  cp.signupNewAccount(driver);
  }
}
