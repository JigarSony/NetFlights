package com.netflights.pages.common;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.netflights.base.TestBase;

public class PaxInfoAndPayment extends TestBase {
	WebDriverWait wait;

	public void leaderDetails() {
		//Main adult pass details
		Select titledrpdwn = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'leadPassengerDetails_ddlTitle')]"))));
		titledrpdwn.selectByValue("Mr");
		
		String leadername = "Kevin";
		String leadermname = "V";
		String leaderlname = "Shah";
		String leadermail = "kevins@mail.com";
		String leaderbday = "1";
		String leaderbmnth = "2";
		String leaderbyear = "1990";
				
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'leadPassengerDetails_txtFirstName')]"))).sendKeys(leadername);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'leadPassengerDetails_txtMiddleName')]"))).sendKeys(leadermname);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'leadPassengerDetails_txtSurname')]"))).sendKeys(leaderlname);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'leadPassengerDetails_txtEmail')]"))).sendKeys(leadermail);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'leadPassengerDetails_txtConfirmEmail')]"))).sendKeys(leadermail);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'leadPassengerDetails_cbxMarketEmailOptin')]"))).click();
		
		Select datedrpdwn = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'leadPassengerDetails_ddlDate')]"))));
		datedrpdwn.selectByValue(leaderbday);
		
		Select monthdrpdwn = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'leadPassengerDetails_ddlMonth')]"))));
		monthdrpdwn.selectByValue(leaderbmnth);
		
		Select yeardrpdwn = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'leadPassengerDetails_ddlYear')]"))));
		yeardrpdwn.selectByValue(leaderbyear);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'leadPassengerDetails_imgBtnNextStep')]"))).click();
		}

	public void leaderAddressDetails() {
		
		String leaderaddress = "A-101,Nehrunagar Society";
		String leaderaddress2 = "Near Nehrunagar Circle";
		String leadercity = "Ahmedabad";
		String leadercountry = "India";
		String leaderpincode = "380015";
		String leaderdayphone = "9876543210";
		String leaderevephone = "9876543211";
		
		//Lead Passenger Address Details
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'leadPassengerAddress_txtAddressLine1')]"))).sendKeys(leaderaddress);
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'leadPassengerAddress_txtAddressLine2')]"))).sendKeys(leaderaddress2);
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'leadPassengerAddress_txtCity')]"))).sendKeys(leadercity);
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'leadPassengerAddress_txtCounty')]"))).sendKeys(leadercountry);
	
		WebElement country = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Select an Option')]")));
		country.click();
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='chosen-search']//input[@type='text']"))).sendKeys(leadercountry);
	
		WebElement ul= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='chosen-results']")));
		//		Thread.sleep(3000);
		List<WebElement> allOptions= ul.findElements(By.tagName("li"));
		for(WebElement selectLi: allOptions)
		{
			if(selectLi.getText().equals(leadercountry)) {
				selectLi.click();
			}
		}
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'leadPassengerAddress_txtPostcode')]"))).sendKeys(leaderpincode);
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'leadPassengerAddress_txtDaytimePhone')]"))).sendKeys(leaderdayphone);
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'leadPassengerAddress_txtEveningPhone')]"))).sendKeys(leaderevephone);
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'leadPassengerAddress_imgBtnNextStep')]"))).click();
	}
	
	public void adultDetails() {
		
		//additional adult details
		String addpassname = "Neela";
		String addpassmname = "K";
		String addpassrlname = "Shah";
		String addpassbday = "10";
		String addpassbmnth = "5";
		String addpassbyear = "1991";
	
		Select addiadultdrpdwn = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvAdults_ddlTitle_0')]"))));
	
		addiadultdrpdwn.selectByValue("Mrs");
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvAdults_txtFirstName_0')]"))).sendKeys(addpassname);
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvAdults_txtMiddleName_0')]"))).sendKeys(addpassmname);
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvAdults_txtSurname_0')]"))).sendKeys(addpassrlname);
	
		Select addiadultdatedrpdwn = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvAdults_ddlDate_0')]"))));
		addiadultdatedrpdwn.selectByValue(addpassbday);
	
		Select addiadultmonthdrpdwn = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvAdults_ddlMonth_0')]"))));
		addiadultmonthdrpdwn.selectByValue(addpassbmnth);
	
		Select addiadultyeardrpdwn = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvAdults_ddlYear_0')]"))));
		addiadultyeardrpdwn.selectByValue(addpassbyear);
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvAdults_imgBtnNextStep_0')]"))).click();
	}
	
	public void childDetails() {
		//AdditionalChild
		String childname = "Shrey";
		String childmname = "K";
		String childlname = "Shah";
		String childbday = "21";
		String childbmnth = "9";
		String childbyear = "2013";
	
		Select childdrpdwn = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_ddlTitle_0')]"))));
		childdrpdwn.selectByValue("Ms");
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_txtFirstName_0')]"))).sendKeys(childname);
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_txtMiddleName_0')]"))).sendKeys(childmname);
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_txtSurname_0')]"))).sendKeys(childlname);
	
		Select childdatedrpdwn = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_ddlDate_0')]"))));
		childdatedrpdwn.selectByValue(childbday);
	
		Select childmonthdrpdwn = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_ddlMonth_0')]"))));
		childmonthdrpdwn.selectByValue(childbmnth);
	
		Select childyeardrpdwn = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_ddlYear_0')]"))));
		childyeardrpdwn.selectByValue(childbyear);
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_imgBtnNextStep_0')]"))).click();
	}
	
	public void child2Details() {
		//additional Child2 Details
		String child2name = "Misha";
		String child2mname = "K";
		String child2lname = "Shah";
		String chil2dbday = "31";
		String child2bmnth = "1";
		String child2byear = "2015";
	
		Select child1drpdwn = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_ddlTitle_1')]"))));
		child1drpdwn.selectByValue("Miss");
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_txtFirstName_1')]"))).sendKeys(child2name);
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_txtMiddleName_1')]"))).sendKeys(child2mname);
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_txtSurname_1')]"))).sendKeys(child2lname);
	
		Select child1datedrpdwn = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_ddlDate_1')]"))));
		child1datedrpdwn.selectByValue(chil2dbday);
	
		Select child1monthdrpdwn = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_ddlMonth_1')]"))));
		child1monthdrpdwn.selectByValue(child2bmnth);
	
		Select child1yeardrpdwn = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_ddlYear_1')]"))));
		child1yeardrpdwn.selectByValue(child2byear);
		}
		
	public void confirmation() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_cbxConfirmBasket_1')]"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_imgBtnNextStep_1')]"))).click();
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sameAddressYes']"))).click();
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'cardHolderAddress_imgBtnNextStep')]"))).click();

		}
	
	public void onePerson() {
		leaderDetails();
		leaderAddressDetails();
		confirmation();
	}
	}
