package com.netflights.pages.basket;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.netflights.base.TestBase;

public class FlightsBasket extends TestBase {

	@FindBy(xpath="//ul[@class='insurance-single-trip-options']//li[@class='insurance-option no-insurance-selected']//span[@class='radio']")
	WebElement chk_insurance; 

	@FindBy(xpath="//input[@id='confirm-basket-checkbox']")
	WebElement chk_tearmsandcondition; 

	String booknow = "Book Now";
	@FindBy(xpath="//a[@title= booknow]")
	WebElement btn_booknow; 

	//Initializing PageObjects
	public FlightsBasket() {

		PageFactory.initElements(driver, this);
	}


	public void clickOnInsurancebutton() {
		chk_insurance.click();
	}

	public void clickOnTC() {
		chk_tearmsandcondition.click();
	}

	public void clickOnBookNowbutton() {
		btn_booknow.click();
	}
	
	public void flightBasket() {
		clickOnInsurancebutton();
		clickOnTC();
		clickOnBookNowbutton();
	}
}
