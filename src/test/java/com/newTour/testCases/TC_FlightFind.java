package com.newTour.testCases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.newTour.pageObjects.FlightFindpage;
import com.newTour.pageObjects.LoginPage;


public class TC_FlightFind extends BaseClass{
	@Test
	public void addNewCustomer() throws IOException, InterruptedException
	{
		driver.get(baseURL);
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		
		lp.setPassword(password);
		logger.info("password is provided");
		
		lp.clickLogin();
		Thread.sleep(3000);
		
		logger.info("providing customer details....");
		
		FlightFindpage findflight=new FlightFindpage(driver);
		
		findflight.flightPage();
		findflight.o_trip();
		findflight.pcount("2");
		findflight.fport("Sydney");
		findflight.month("February");
		findflight.day("11");
		findflight.tport("Paris");
		findflight.tmonth("February");
		findflight.tday("12");
		findflight.service("Business class");
		findflight.airlines("Unified Airlines");
		findflight.findFlight();
		Thread.sleep(3000);
		
		logger.info("findFlight-------");
		boolean res=driver.getPageSource().contains("Find a Flight: Mercury Tours:");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("testcases passes....");
		}
		else
		{
			captusreScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
			logger.info("testcases failed......");
		}
	}
}