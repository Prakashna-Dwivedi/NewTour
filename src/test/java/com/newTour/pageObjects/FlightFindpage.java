package com.newTour.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class FlightFindpage {

	  public WebDriver ldriver;
	  
	 public FlightFindpage(WebDriver rdriver)
	  {
		  ldriver=rdriver;
		  PageFactory.initElements(rdriver,this);
	  }
	  
	  By flightpage=By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a");
	
		
		@FindBy(how = How.XPATH,using ="//tbody/tr[2]/td[2]/b[1]/font[1]/input[1]")
		@CacheLookup
		WebElement roundTrip;
		
		@FindBy(how = How.XPATH,using ="//tbody/tr[2]/td[2]/b[1]/font[1]/input[2]")
		@CacheLookup
		WebElement oneWay;
		
		@FindBy(how = How.NAME,using ="passCount")
		@CacheLookup
		WebElement passangers;
		

		@FindBy(how = How.NAME,using ="fromPort")
		@CacheLookup
		WebElement fromPort;
		
		@FindBy(how = How.NAME,using ="fromMonth")
		@CacheLookup
		WebElement fromMonth;
		
		@FindBy(how = How.NAME,using ="fromDay")
		@CacheLookup
		WebElement fromDay;
		

		@FindBy(how = How.NAME,using ="toPort")
		@CacheLookup
		WebElement toPort;
		

		@FindBy(how = How.NAME,using ="toMonth")
		@CacheLookup
		WebElement toMonth;
		
		@FindBy(how = How.NAME,using ="toDay")
		@CacheLookup
		WebElement toDay;
		
		@FindBy(how = How.NAME,using ="servClass")
		@CacheLookup
		WebElement servClass;
		

		@FindBy(how = How.NAME,using ="airline")
		@CacheLookup
		WebElement airline;
		

		@FindBy(how = How.NAME,using ="findFlights")
		@CacheLookup
		WebElement findFlights;
		
			
		public void flightPage() throws InterruptedException{
			Thread.sleep(1000);
			ldriver.findElement(flightpage).click();
		}

		public void r_trip()
		{
			
				roundTrip.click();
		}
		public void o_trip()
		{
			oneWay.click();
		}
		
		public void pcount(String pCount)
		{
			passangers.sendKeys(pCount);
		}
			

		public void fport(String fromport)
		{
			fromPort.sendKeys(fromport);
		}
		
		public void month(String fmonth)
		{
			fromMonth.sendKeys(fmonth);
		}
		
		public void day(String fday)
		{
			fromDay.sendKeys(fday);
		}
		
		public void tport(String tport)
		{
			toPort.sendKeys(tport);
		}
		
		public void tmonth(String tmonth)
		{
			toMonth.sendKeys(tmonth);
		}
		
		public void tday(String tday)
		{
			toDay.sendKeys(tday);
		}
		
		public void service(String sclass)
		{
			servClass.sendKeys(sclass);
		}
		
		public void airlines(String airlines)
		{
			airline.sendKeys(airlines);
		}
		
		public void findFlight()
		{
			findFlights.click();
		}

        
}
