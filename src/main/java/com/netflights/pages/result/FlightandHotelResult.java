package com.netflights.pages.result;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.netflights.base.TestBase;

public class FlightandHotelResult extends TestBase {

	@FindBy(xpath="//ul[@id='package-list']//li[1]//div[1]//div[5]//div[1]//div[2]//a[2]")
	WebElement btn_changeFlight; 

	@FindBy(xpath="//div[@id='dynamicPackagingFlightsModal']")
	WebElement popup;

	@FindBy(xpath="//*[@id=\"package-flight-matrix-container\"]/table/tbody/tr[2]/td[1]/div")
	WebElement Airlines;

	@FindBy(xpath="//*[@id=\"package-flight-details\"]/div/div[2]/div[2]/input[3]")
	WebElement btn_selectFlight;

	@FindBy(xpath="//*[@id=\"package-list\"]/li[1]/div/div[3]/p[2]/a")
	WebElement btn_moreDetails;

	//Initializing PageObjects
	public FlightandHotelResult() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnChangeFlightButton() {
		btn_changeFlight.click();
	}

	public void clickOnChangeFlightPopUp() {
		popup.click();
	}

	public void clickOnSelectedAirlines() {
		Airlines.click();
	}

	public void clickOnSelectFlight() {
		btn_selectFlight.click();
	}

	public void clickOnMoreDetails() {
		btn_moreDetails.click();
	}
}