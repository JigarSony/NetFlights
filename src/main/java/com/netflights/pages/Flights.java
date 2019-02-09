package com.netflights.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.netflights.base.TestBase;

public class Flights extends TestBase{

	//Page Factory - OR		
	@FindBy(xpath="//div[@class='nf-email-signup']//div[@class='col s12 m4 l1 closeicondiv hide-on-med-and-down']//a[@class='closeemailsubcription']")
	WebElement btn_dismiss;

	@FindBy(xpath="//img[contains(@class,'nf-home-logo--large')]")
	WebElement logo_netflight;

	@FindBy(linkText="Flights")
	WebElement flight;

	@FindBy(linkText="Flight + Hotel")
	WebElement flightandhotel;

	@FindBy(linkText="Hotels")
	WebElement hotel;

	@FindBy(linkText="Car hire")
	WebElement carhire;

	@FindBy(xpath="//div[@class='nf-ng-search--radio']//span[1]//label[1]//span[1]")
	WebElement btn_return;

	@FindBy(xpath="//div[@class='nf-ng-search--radio']//span[2]//label[1]//span[1]")
	WebElement btn_oneway;

	@FindBy(xpath="//div[@class='nf-ng-search--radio']//span[3]//label[1]//span[1]")
	WebElement btn_multicity;

	@FindBy(id="mat-input-0")
	WebElement txt_flyingfrom;

	@FindBy(id="mat-input-1")
	WebElement txt_flyingto;

	@FindBy(xpath="//span[@class='mat-option-text']")
	WebElement suggetion;

	//datepicker
	@FindBy(xpath="//div[@class='selectiongroup']//input[@type='text']")
	WebElement datepicker;

	//#ofpassenger
	@FindBy(id="//input[@id='mat-input-2']")
	WebElement passenger;

	//@FindBy(xpath="//li[@class='search-button']")
	@FindBy(xpath="//button[@class='btn btn-primary btn-block']")
	WebElement btn_findflight;

	@FindBy(id="cookie_policy_agree")
	WebElement btn_cookies;

	//Initializing PageObjects
	public Flights() {
		PageFactory.initElements(driver, this);
	}

	//Actions
	public String validateHomePageTitle() {
		return driver.getTitle();
	}

	public boolean validateNetflightImage() {
		return logo_netflight.isDisplayed();
	}

	public void selectFlightFromAndTo(String from,String to) {
		txt_flyingfrom.sendKeys(from);
		//wait.until(ExpectedConditions.visibilityOf(suggetion)).click();
		suggetion.click();
		txt_flyingto.sendKeys(to);
		//wait.until(ExpectedConditions.visibilityOf(suggetion)).click();
		suggetion.click();
		//select date and #of passenger pending
		btn_findflight.click();
	}

}
