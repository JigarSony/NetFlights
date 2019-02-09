package com.netflights.pages.basket;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.netflights.base.TestBase;

public class FlightandHotelBasket extends TestBase {

	@FindBy(xpath="//*[@id=\"basket-control\"]/ul/li[5]/div/div[3]/div/div[1]/ul[2]/li[5]/p[2]/span")
	WebElement chk_insurance;

	@FindBy(id="confirm-basket-checkbox")
	WebElement chk_tearmsandcondition;

	String booknow = "Book Now";
	@FindBy(xpath="//a[@title= booknow]")
	WebElement btn_booknow; 

	//Initializing PageObjects
	public FlightandHotelBasket() {
		PageFactory.initElements(driver, this);
	}


	public void clickOnBookNowButton() {
		chk_insurance.click();
	}

	public void clickOnTC() {
		chk_tearmsandcondition.click();
	}

	public void clickOnBookNowbutton() {
		btn_booknow.click();
	}



}
