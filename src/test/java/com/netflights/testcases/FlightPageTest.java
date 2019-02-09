package com.netflights.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.netflights.base.TestBase;
import com.netflights.pages.Flights;
import com.netflights.pages.basket.FlightsBasket;
import com.netflights.pages.common.PaxInfoAndPayment;
import com.netflights.pages.result.FlightsOptions;
import com.netflights.pages.result.FlightsResult;

public class FlightPageTest extends TestBase {

	Flights flightpage;
	FlightsResult flightresultpage;
	FlightsOptions flightsoptionspage;
	FlightsBasket flightsbasketpage;
	PaxInfoAndPayment paxinfoandpayment;
	
	public FlightPageTest() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initialization();

		flightpage = new Flights();
		flightresultpage = new FlightsResult();
		flightsoptionspage = new FlightsOptions();
		flightsbasketpage = new FlightsBasket();
		paxinfoandpayment = new PaxInfoAndPayment();
	}

	@Test(priority=1)
	public void homePageTitleTest() {
		String Title = flightpage.validateHomePageTitle();
		Assert.assertEquals(Title, "Cheap flights & tickets - Compare flight deals | Netflights");
	}
	
	@Test(priority=2)
	public void netflightLogoTest() {
		Boolean flag = flightpage.validateNetflightImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void flightTeste2e() throws InterruptedException {
		flightpage.selectFlightFromAndTo(prop.getProperty("from"),prop.getProperty("to"));
		
		flightresultpage.selectAirlinesBA();
		
		flightsoptionspage.clickOncountinueFlight();
		
		flightsbasketpage.flightBasket();
		
		paxinfoandpayment.onePerson();
				
	}

	@AfterClass 
	public void tearDown() {
		driver.quit();
	}

}
