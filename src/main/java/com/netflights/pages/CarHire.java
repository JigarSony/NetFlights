package com.netflights.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.netflights.base.TestBase;

public class CarHire extends TestBase{

	@FindBy(linkText="Car hire")
	WebElement carhire;

	@FindBy(id="mat-input-1")
	WebElement txt_pickuplocation;

	@FindBy(id="mat-input-2")
	WebElement txt_dropofflocation;

	@FindBy(xpath="//div[@class='selectiongroup']//input[@type='text']")
	WebElement datepicker;

	@FindBy(id="mat-input-0")
	WebElement txt_driversage;

	@FindBy(xpath="//button[@class='btn btn-primary btn-block']")
	WebElement btn_cars;

	//Initializing PageObjects
	public CarHire() {
		PageFactory.initElements(driver, this);
	}
}
