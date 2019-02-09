package com.netflights.pages.result;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.netflights.base.TestBase;

public class FlightsOptions extends TestBase {

	@FindBy(xpath="//*[@id=\"flight-upsell\"]/div/div[1]/div[2]/div[4]/a")
	WebElement countinueFlight; 

	//Initializing PageObjects
	public FlightsOptions() {
		PageFactory.initElements(driver, this);
	}

	public void clickOncountinueFlight() {
		countinueFlight.click();
	}

}