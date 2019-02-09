package com.netflights.pages.basket;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.netflights.base.TestBase;

public class HotelsBasket extends TestBase {

	@FindBy(xpath="//input[@id='confirm-basket-checkbox']")
	WebElement chk_insurance;

	@FindBy(xpath="//a[@title='Book Now']")
	WebElement btn_bookNow;

	//Initializing PageObjects
	public HotelsBasket() {
		PageFactory.initElements(driver, this);
	}


	public void clickOnInsuranceButton() {
		chk_insurance.click();
	}
	public void clickOnBookNowButton() {
		btn_bookNow.click();
	}
}
