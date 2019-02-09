package com.netflights.pages.result;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.netflights.base.TestBase;

public class HomepageResult extends TestBase{

	@FindBy(xpath="//ul[@id='hotel-list']//li[1]//div[2]//p[2]//a[1]")
	WebElement btn_moreDetails;

	//Initializing PageObjects
	public HomepageResult() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnMorreDetails() {
		btn_moreDetails.click();
	}
}
