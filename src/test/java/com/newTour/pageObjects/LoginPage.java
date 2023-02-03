package com.newTour.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
			
		public WebDriver ldriver;
		
		public LoginPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(name="userName")
		@CacheLookup
		WebElement username;
		
		@FindBy(name="password")
		@CacheLookup
		WebElement Password;
		
		@FindBy(name="submit")
		@CacheLookup
		WebElement submit;
		
	/* @FindBy(linkText="Log out")
		@CacheLookup
		WebElement lnkLogout;*/
		
			public void setUserName(String uname)
		{
			username.sendKeys(uname);
		}
			
		public void setPassword(String pwd)
		{
			Password.sendKeys(pwd);
		}
			
		public void clickLogin()
		{
			submit.click();
		}
		
	/*	public void clickLogout()
		{
			lnkLogout.click();
		}*/
	
		
		
	}

