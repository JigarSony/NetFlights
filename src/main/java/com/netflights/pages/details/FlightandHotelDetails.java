package com.netflights.pages.details;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.netflights.base.TestBase;

public class FlightandHotelDetails extends TestBase {

	@FindBy(id="add-package-to-basket")
	WebElement btn_booknow;

	//Initializing PageObjects
	public FlightandHotelDetails() {
		PageFactory.initElements(driver, this);
	}
	public void clickOnBookNowButton() {
		btn_booknow.click();
	}

}
