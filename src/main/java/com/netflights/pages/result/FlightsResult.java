package com.netflights.pages.result;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.netflights.base.TestBase;

public class FlightsResult extends TestBase {

//	@FindBy(xpath="//div[@class='nf-email-signup']//div[@class='col s12 m4 l1 closeicondiv hide-on-med-and-down']//a[@class='closeemailsubcription']")
//	WebElement btn_dismiss;

	@FindBy(xpath="//select[@name='airline-select']")
	WebElement Airlinebox;

	@FindBy(xpath="//li[@class='search-button']")
	WebElement SearchFlightsByAirlines;

	@FindBy(xpath="//*[@id=\"flight-list\"]/ul/li[1]/div//div[3]//div[1]/a")
	WebElement selectFlight; 

	//Initializing PageObjects
	public FlightsResult() {
		PageFactory.initElements(driver, this);
	}

	public void selectAirline() {
		Airlinebox.sendKeys("Bri");
	}

	public void clickOnSelectflightByAirlines() {
		SearchFlightsByAirlines.click();
	}
	
	public void clickOnflight() throws InterruptedException {
		Thread.sleep(7000);
		selectFlight.click();
	}
	
	public void selectAirlinesBA() throws InterruptedException {
		selectAirline();
		clickOnSelectflightByAirlines();
		clickOnflight();
		
	}
}