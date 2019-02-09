package com.netflights.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.netflights.base.TestBase;

public class Hotels extends TestBase{

	@FindBy(linkText="Hotels")
	WebElement hotel;

	@FindBy(id="mat-input-0")
	WebElement txt_destination;

	@FindBy(xpath="By.xpath(\"//span[@class='mat-option-text']\"))")
	WebElement suggetion;

	@FindBy(xpath="//div[@class='selectiongroup']//input[@type='text']")
	WebElement datepicker;

	@FindBy(id="//input[@id='mat-input-1']")
	WebElement passenger;

	@FindBy(xpath="//button[@class='btn btn-primary btn-block']")
	WebElement btn_findhotels;

	//Initializing PageObjects
	public Hotels() {
		PageFactory.initElements(driver, this);
	}

	public void selectHotel(String destinationHotel) {

		txt_destination.sendKeys(destinationHotel);
		suggetion.click();
		//select date and #of passanger pending
		btn_findhotels.click();
	}
}
