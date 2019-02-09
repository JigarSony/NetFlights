package com.netflights.pages;

import org.openqa.selenium.support.PageFactory;

import com.netflights.base.TestBase;

public class Homepage extends TestBase{

	//Initializing PageObjects
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
}
