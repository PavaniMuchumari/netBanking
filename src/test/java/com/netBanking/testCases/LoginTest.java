package com.netBanking.testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.netBanking.pageObjects.LoginPage;

public class LoginTest extends BaseClass {
	
	@Test
	public void loginTest() throws Exception {
	
		logger.info("URL is Opened");
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(3000);
		lp.setUserName(username);
		logger.info("Username entered");
		lp.setPassword(password);
		logger.info("Password entered");
		lp.clickSubmit();
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Login test Passed");
		}
		else {
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test Failed");
		}
		lp.clickLogout();
		logger.info("Logout completed");
		
		
	}

}
