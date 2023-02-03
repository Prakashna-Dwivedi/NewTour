package com.newTour.testCases;

 import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.newTour.pageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass{
	@Test
	public void loginTest() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		logger.info("url is opened");
		
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("Enter username");
		lp.setPassword(password);
		logger.info("Enter password");
		
		lp.clickLogin();
		
		if(driver.getTitle().equals("Login: Mercury Tours"))
		{
			Assert.assertTrue(true);
			logger.info("Login Test Passed");
		}
		else
		{
			captusreScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login Test failed");
		}
	}

}
