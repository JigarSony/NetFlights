package com.netflights.pages.basket;

import org.openqa.selenium.support.PageFactory;

import com.netflights.base.TestBase;

public class HomepageBasket extends TestBase {
	//Initializing PageObjects
	public HomepageBasket() {
		PageFactory.initElements(driver, this);
	}

}
