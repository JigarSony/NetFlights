package com.netflights.pages.details;

import org.openqa.selenium.support.PageFactory;

import com.netflights.base.TestBase;

public class FlightsDetails extends TestBase {
	
	//Initializing PageObjects
	public FlightsDetails() {
		PageFactory.initElements(driver, this);
	}

}
