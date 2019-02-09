package com.netflights.pages.details;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.netflights.base.TestBase;

public class HotelsDetails extends TestBase{

	@FindBy(xpath="//p[@class='select']//input[@type='image']")
	WebElement btn_bookNow;

	//Initializing PageObjects
	public HotelsDetails() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnBookNow() {
		btn_bookNow.click();
	}
}
