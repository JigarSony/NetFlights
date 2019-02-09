package com.netflights.pages.basket;

import org.openqa.selenium.support.PageFactory;

import com.netflights.base.TestBase;

public class CarHireBasket extends TestBase{

	//Initializing PageObjects
	public CarHireBasket () {
		PageFactory.initElements(driver, this);
	}
}
