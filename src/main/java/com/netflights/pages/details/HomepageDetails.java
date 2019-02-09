package com.netflights.pages.details;

import org.openqa.selenium.support.PageFactory;

import com.netflights.base.TestBase;

public class HomepageDetails extends TestBase{
	
	//Initializing PageObjects
	public HomepageDetails() {
		PageFactory.initElements(driver, this);
	}
}
