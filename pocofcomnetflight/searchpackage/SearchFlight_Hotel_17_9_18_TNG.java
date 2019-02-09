package searchpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchFlight_Hotel_17_9_18_TNG {

	WebDriver driver;
	static WebDriverWait wait;
	
	@BeforeTest
	public void setUp() {
		//project path
		String projectpath = System.getProperty("user.dir");
		System.out.println("Projectpath is " + projectpath);

		//chrome driver initialization
		System.setProperty("webdriver.chrome.driver", projectpath +"//drivers//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//firefox driver initialization
		//System.setProperty("webdriver.gecko.driver", projectpath + "//drivers//geckodriver//geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();

		//ie driver initialization
		//System.setProperty("webdriver.ie.driver", projectpath +"//drivers//iedriver//IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();

		//wait and size
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		wait = new WebDriverWait(driver,30);

		//get url
		//String url = "https://www.netflights.com";
		String url = "https://nfdv2_feature.netflights.com";
		driver.get(url);

		//accept cookies
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cookie_policy_agree"))).click();
	}

	@Test
	public void searchflighthotel() {
		//select flight+hotel
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Flight + Hotel"))).click();

		//flying from
		String flyingfrom = "London";
		//driver.findElement(By.id("mat-input-0")).sendKeys(flyingfrom);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mat-input-0"))).sendKeys(flyingfrom);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-option-text']"))).click();

		//fliying to
		String fliyingto = "Miami Beach, Florida, USA";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mat-input-1"))).sendKeys(fliyingto);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-option-text']"))).click();

		//datepicker
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='selectiongroup']//input[@type='text']"))).click();
		
		//click on right button 2 times
		//driver.findElement(By.xpath("//div[@class='headerbtncell right']//button[@type='button']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='headerbtncell right']//button[@type='button']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='headerbtncell right']//button[@type='button']"))).click();

		//Select from 15 Jan'19
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body/main/div[1]/div/gm-holiday-search/div/form/div/div/div/div[2]/div/gm-date-range-picker/div/div[2]/div/div[3]/div[2]/table/tbody/tr[3]/td[2]/div"))).click();

		//Select to 23 Jan'19
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body/main/div[1]/div/gm-holiday-search/div/form/div/div/div/div[2]/div/gm-date-range-picker/div/div[2]/div/div[3]/div[2]/table/tbody/tr[4]/td[3]/div"))).click();

		WebElement element;
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='selectiongroup']//input[@type='text']")));
		element.click();
		//JavascriptExecutor executor = (JavascriptExecutor)driver;

		//executor.executeScript("arguments[0].click();", element);

		//Select # of passenger
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='mat-input-2']"))).click();

		//Select 2 adult
		//click on +
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='nf-search-popup--adults']//div[@class='nf-search-popup--ageinc']"))).click();

		//child
		//Select 2 child
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='nf-search-popup--children']//div[@class='nf-search-popup--ageinc']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='nf-search-popup--children']//div[@class='nf-search-popup--ageinc']"))).click();

		WebElement element1;
		element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='mat-input-2']")));
		element1.click();

		//executor.executeScript("arguments[0].click();", element1);

		//click on find holidays
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-primary btn-block']"))).click();

		//change the flights
		//click on change find button	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='package-list']//li[1]//div[1]//div[5]//div[1]//div[2]//a[2]"))).click();

		//click on popup
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='dynamicPackagingFlightsModal']"))).click();

		//driver.findElement(By.xpath("//td[@class='airline-price non-stop BA']//div[@class='non-stop-info']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"package-flight-matrix-container\"]/table/tbody/tr[2]/td[1]/div"))).click();

		//click on Select flights	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"package-flight-details\"]/div/div[2]/div[2]/input[3]"))).click();

		//click on more details
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"package-list\"]/li[1]/div/div[3]/p[2]/a"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-package-to-basket"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"basket-control\"]/ul/li[5]/div/div[3]/div/div[1]/ul[2]/li[5]/p[2]/span"))).click();

		//basketpage
		//click on checkbox
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirm-basket-checkbox"))).click();

		//click on booknow
		//driver.findElement(By.xpath("//*[@class='cta-button basket-checkout']")).click();
		String booknow = "Book Now";

		//driver.findElement(By.xpath("//a[@title='Book Now']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title= '" +booknow+ "']"))).click();
		
		fillDetails();


	}
	@AfterTest
	public void tearDown() {
		System.out.println("@Payment Screen");
		driver.close();
		System.out.println("e2e for Flight Pass Successfully");
	}

	public void fillDetails() {
		//pax-info-and-payment.
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
		String leaderaddress = "A-101,Nehrunagar Society";
		String leaderaddress2 = "Near Nehrunagar Circle";
		String leadercity = "Ahmedabad";
		String leadercountry = "India";
		String leaderpincode = "380015";
		String leaderdayphone = "9876543210";
		String leaderevephone = "9876543211";

		//driver.findElement(By.xpath("//input[@id='ContentPlaceHolderDefault_BodyContent_MainColumn_PaxDetailsAndPayment_22__leadPassengerDetails_txtFirstName']")).sendKeys(leadername);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'leadPassengerDetails_txtFirstName')]"))).sendKeys(leadername);
		//*[contains(@id,'leadPassengerDetails_txtFirstName')]
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'leadPassengerDetails_txtMiddleName')]"))).sendKeys(leadermname);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'leadPassengerDetails_txtSurname')]"))).sendKeys(leaderlname);
		//*[contains(@id,'leadPassengerDetails_txtSurname')]
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'leadPassengerDetails_txtEmail')]"))).sendKeys(leadermail);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'leadPassengerDetails_txtConfirmEmail')]"))).sendKeys(leadermail);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'leadPassengerDetails_cbxMarketEmailOptin')]"))).click();

		Select datedrpdwn = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'leadPassengerDetails_ddlDate')]"))));
		datedrpdwn.selectByValue(leaderbday);

		Select monthdrpdwn = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'leadPassengerDetails_ddlMonth')]"))));
		monthdrpdwn.selectByValue(leaderbmnth);

		Select yeardrpdwn = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'leadPassengerDetails_ddlYear')]"))));
		yeardrpdwn.selectByValue(leaderbyear);

		//driver.findElement(By.xpath("//input[@id='ContentPlaceHolderDefault_BodyContent_MainColumn_PaxDetailsAndPayment_22__leadPassengerDetails_cbxConfirmBasket']")).click();
		//*[@id="ContentPlaceHolderDefault_BodyContent_MainColumn_PaxDetailsAndPayment_22__leadPassengerDetails_imgBtnNextStep"]

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'leadPassengerDetails_imgBtnNextStep')]"))).click();

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

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_cbxConfirmBasket_1')]"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_imgBtnNextStep_1')]"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sameAddressYes']"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'cardHolderAddress_imgBtnNextStep')]"))).click();
	}
}



