package com.netflights.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.netflights.base.TestBase;

public class FlightandHotel extends TestBase{

	@FindBy(linkText="Flight + Hotel")
	WebElement flightandhotel;

	@FindBy(id="mat-input-0")
	WebElement txt_flyingfrom;

	@FindBy(id="mat-input-1")
	WebElement txt_flyingto;

	@FindBy(xpath="By.xpath(\"//span[@class='mat-option-text']\"))")
	WebElement suggetion;

	@FindBy(xpath="//div[@class='selectiongroup']//input[@type='text']")
	WebElement datepicker;

	@FindBy(id="//input[@id='mat-input-2']")
	WebElement passenger;

	@FindBy(xpath="//button[@class='btn btn-primary btn-block']")
	WebElement btn_findholidays;

	//Initializing PageObjects
	public FlightandHotel() {
		PageFactory.initElements(driver, this);
	}

	public void selectFlightAndHotel(String from,String to) {

		txt_flyingfrom.sendKeys(from);
		suggetion.click();
		txt_flyingto.sendKeys(to);
		suggetion.click();
		//select date and #of passanger pending
		btn_findholidays.click();
	}
}
