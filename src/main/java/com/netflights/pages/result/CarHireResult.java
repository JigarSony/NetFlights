package com.netflights.pages.result;

import org.openqa.selenium.support.PageFactory;

import com.netflights.base.TestBase;

public class CarHireResult extends TestBase {
	
	//Initializing PageObjects
	public CarHireResult() {
		PageFactory.initElements(driver, this);
	}
}
