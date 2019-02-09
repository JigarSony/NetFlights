package searchpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchFlight_27_9_18 {


	WebDriver driver;
	static WebDriverWait wait;

	public static void main(String[] args) throws InterruptedException {

		//project path
		String projectpath = System.getProperty("user.dir");
		System.out.println("Projectpath is " + projectpath);

		//chrome driver initialization
		System.setProperty("webdriver.chrome.driver", projectpath +"//drivers//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//wait and size
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,30);

		//get url
		String url = "https://nfdv2_feature.netflights.com";
		driver.get(url);

		//select flight
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Flights"))).click();

		//dismiss
		WebElement dismiss = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='nf-email-signup']//div[@class='col s12 m4 l1 closeicondiv hide-on-med-and-down']//a[@class='closeemailsubcription']")));
		dismiss.click();

		//accept cookies
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cookie_policy_agree"))).click();

		//flying from
		String flyingfrom = "London Gatwick";
		driver.findElement(By.id("mat-input-0")).sendKeys(flyingfrom);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-option-text']"))).click();

		//fliying to
		String fliyingto = "New York (JFK)";
		driver.findElement(By.id("mat-input-1")).sendKeys(fliyingto);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-option-text']"))).click();

		//datepicker-Remains
		JavascriptExecutor executor = (JavascriptExecutor)driver;

		//Select # of passenger
		driver.findElement(By.xpath("//input[@id='mat-input-2']")).click();

		//Select 2 adult
		//click on +
		WebElement adultplus = driver.findElement(By.xpath("//div[@class='nf-search-popup--adults']//div[@class='nf-search-popup--ageinc']"));
		executor.executeScript("arguments[0].click();", adultplus);

		//child
		//Select 2 child

		WebElement childpls = driver.findElement(By.xpath("//div[@class='nf-search-popup--children']//div[@class='nf-search-popup--ageinc']"));
		executor.executeScript("arguments[0].click();", childpls);
		//Thread.sleep(3000);
		WebElement childplspls = driver.findElement(By.xpath("//div[@class='nf-search-popup--children']//div[@class='nf-search-popup--ageinc']"));
		executor.executeScript("arguments[0].click();", childplspls);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='nf-search-popup--children']//div[@class='nf-search-popup--ageinc']"))).click();

		//div[@class='nf-search-popup--children']//div[@class='nf-search-popup--ageinc']

		//WebElement element1 = driver.findElement(By.xpath("//input[@id='mat-input-2']"));
		//executor.executeScript("arguments[0].click();", element1);
		WebElement done = driver.findElement(By.xpath("//button[contains(text(),'Done')]"));
		executor.executeScript("arguments[0].click();", done);

		//click on find flights
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();

		//		String ParentWindowHandle=driver.getWindowHandle();
		//
		//		System.out.println("ParentWindowHandle "+ ParentWindowHandle);
		//
		//		Thread.sleep(3000);
		//
		//		for(String ChildTab:driver.getWindowHandles())
		//
		//		{
		//
		//			driver.switchTo().window(ChildTab);
		//
		//		}
		//
		//		System.out.println(driver.getTitle());
		//
		//		Thread.sleep(3000);


		//select BA from Drop down

		//WebElement Airlinebox = driver.findElement(By.id("airline-select"));
		WebElement Airlinebox = driver.findElement(By.xpath("//select[@name='airline-select']"));
		//Select dropDown = new Select(Airlinebox);
		//String Airline = "British Airways";
		//dropDown.selectByValue("BA");
		//driver.findElement(By.xpath("//select[@name='airline-select']"));
		//Airlinebox.sendKeys(Airline);
		Airlinebox.sendKeys("Bri");



		//		List<WebElement> AirlineOptions = Airlinebox.findElements(By.tagName(Airline));
		//
		//		for(WebElement selectLi:  AirlineOptions)
		//
		//		{
		//
		//			if(selectLi.getText().equals(Airline)) {																												
		//
		//				selectLi.click();
		//
		//			}
		//
		//		}

		//click on SearchFlights
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='search-button']"))).click();

		//WebElement boxarea = driver.findElement(By.xpath("//li[@class='flight-result flight-option'][1]"));

		//List<WebElement> l1 = boxarea.findElements(By.tagName("a"));

		//System.out.println("The number of links in the boxarea are "+l1.size());

		//Thread.sleep(2000);

		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='flightSelect button'][1]"))).click();
		//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"flight-list\"]/ul/li[1]/div//div[3]//div[1]/a")));
		WebElement searchflight = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='flight-list']/ul/li[1]/div/div[3]/div[1]/a")));
		//		JavascriptExecutor executor = (JavascriptExecutor)driver;
		//searchflight.click();
		executor.executeScript("arguments[0].click();", searchflight);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"flight-list\"]/ul/li[1]/div//div[3]//div[1]/a"))).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"flight-list\"]/ul/li[1]/div/div[3]/div[1]/a/strong/text()"))).click();
		//*[@id="flight-list"]/ul/li[1]/div/div[3]/div[1]/a/strong/text()

		System.out.println("Pass");
		//WebElement moredetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='flight-list']/ul/li[1]/div/div[3]/div[1]/a")));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"flight-upsell\"]/div/div[1]/div[2]/div[4]/a"))).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='flight-upsell']/div/div[1]/div[2]/div[4]/a"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"flight-upsell\"]/div/div[1]/div[2]/div[4]/a"))).click();
		//*[@id="flight-upsell"]/div/div[1]/div[2]/div[4]/a

		//no insurance
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='insurance-single-trip-options']//li[@class='insurance-option no-insurance-selected']//span[@class='radio']"))).click();
		//*[@id="basket-control"]/ul/li[6]/div/div[3]/div/div[1]/ul[2]/li[5]/p[2]/span
		//ul[@class='insurance-single-trip-options']//li[@class='insurance-option no-insurance-selected']//span[@class='radio']
		//click on checkbox
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='confirm-basket-checkbox']"))).click();

		String booknow = "Book Now";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title= '" +booknow+ "']"))).click();

		//pax-info-and-payment.
		//Main adult pass details
		Select titledrpdwn = new Select(driver.findElement(By.xpath("//*[contains(@id,'leadPassengerDetails_ddlTitle')]")));
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

		driver.findElement(By.xpath("//*[contains(@id,'leadPassengerDetails_txtFirstName')]")).sendKeys(leadername);
		//*[contains(@id,'leadPassengerDetails_txtFirstName')]
		driver.findElement(By.xpath("//*[contains(@id,'leadPassengerDetails_txtMiddleName')]")).sendKeys(leadermname);

		driver.findElement(By.xpath("//*[contains(@id,'leadPassengerDetails_txtSurname')]")).sendKeys(leaderlname);
		//*[contains(@id,'leadPassengerDetails_txtSurname')]
		driver.findElement(By.xpath("//*[contains(@id,'leadPassengerDetails_txtEmail')]")).sendKeys(leadermail);

		driver.findElement(By.xpath("//*[contains(@id,'leadPassengerDetails_txtConfirmEmail')]")).sendKeys(leadermail);

		driver.findElement(By.xpath("//*[contains(@id,'leadPassengerDetails_cbxMarketEmailOptin')]")).click();

		Select datedrpdwn = new Select(driver.findElement(By.xpath("//*[contains(@id,'leadPassengerDetails_ddlDate')]")));
		datedrpdwn.selectByValue(leaderbday);

		Select monthdrpdwn = new Select(driver.findElement(By.xpath("//*[contains(@id,'leadPassengerDetails_ddlMonth')]")));
		monthdrpdwn.selectByValue(leaderbmnth);

		Select yeardrpdwn = new Select(driver.findElement(By.xpath("//*[contains(@id,'leadPassengerDetails_ddlYear')]")));
		yeardrpdwn.selectByValue(leaderbyear);
		//leadPassengerDetails_cbxConfirmBasket
		//driver.findElement(By.xpath("//*[contains(@id,'leadPassengerDetails_cbxConfirmBasket')]")).click();
		//*[@id="ContentPlaceHolderDefault_BodyContent_MainColumn_PaxDetailsAndPayment_22__leadPassengerDetails_imgBtnNextStep"]

		driver.findElement(By.xpath("//*[contains(@id,'leadPassengerDetails_imgBtnNextStep')]")).click();

		//Lead Passenger Address Details
		driver.findElement(By.xpath("//*[contains(@id,'leadPassengerAddress_txtAddressLine1')]")).sendKeys(leaderaddress);

		driver.findElement(By.xpath("//*[contains(@id,'leadPassengerAddress_txtAddressLine2')]")).sendKeys(leaderaddress2);

		driver.findElement(By.xpath("//*[contains(@id,'leadPassengerAddress_txtCity')]")).sendKeys(leadercity);

		driver.findElement(By.xpath("//*[contains(@id,'leadPassengerAddress_txtCounty')]")).sendKeys(leadercountry);

		WebElement country = driver.findElement(By.xpath("//span[contains(text(),'Select an Option')]"));
		country.click();

		driver.findElement(By.xpath("//div[@class='chosen-search']//input[@type='text']")).sendKeys(leadercountry);

		WebElement ul= driver.findElement(By.xpath("//*[@class='chosen-results']"));
		Thread.sleep(3000);
		List<WebElement> allOptions= ul.findElements(By.tagName("li"));
		for(WebElement selectLi: allOptions)
		{
			if(selectLi.getText().equals(leadercountry)) {
				selectLi.click();
			}
		}

		driver.findElement(By.xpath("//*[contains(@id,'leadPassengerAddress_txtPostcode')]")).sendKeys(leaderpincode);

		driver.findElement(By.xpath("//*[contains(@id,'leadPassengerAddress_txtDaytimePhone')]")).sendKeys(leaderdayphone);

		driver.findElement(By.xpath("//*[contains(@id,'leadPassengerAddress_txtEveningPhone')]")).sendKeys(leaderevephone);

		driver.findElement(By.xpath("//*[contains(@id,'leadPassengerAddress_imgBtnNextStep')]")).click();

		//additional adult details
		String addpassname = "Neela";
		String addpassmname = "K";
		String addpassrlname = "Shah";
		String addpassbday = "10";
		String addpassbmnth = "5";
		String addpassbyear = "1991";

		Select addiadultdrpdwn = new Select(driver.findElement(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvAdults_ddlTitle_0')]")));

		addiadultdrpdwn.selectByValue("Mrs");

		driver.findElement(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvAdults_txtFirstName_0')]")).sendKeys(addpassname);

		driver.findElement(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvAdults_txtMiddleName_0')]")).sendKeys(addpassmname);

		driver.findElement(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvAdults_txtSurname_0')]")).sendKeys(addpassrlname);

		Select addiadultdatedrpdwn = new Select(driver.findElement(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvAdults_ddlDate_0')]")));
		addiadultdatedrpdwn.selectByValue(addpassbday);

		Select addiadultmonthdrpdwn = new Select(driver.findElement(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvAdults_ddlMonth_0')]")));
		addiadultmonthdrpdwn.selectByValue(addpassbmnth);

		Select addiadultyeardrpdwn = new Select(driver.findElement(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvAdults_ddlYear_0')]")));
		addiadultyeardrpdwn.selectByValue(addpassbyear);

		driver.findElement(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvAdults_imgBtnNextStep_0')]")).click();

		driver.findElement(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvAdults_cbxConfirmBasket_0')]")).click();

		driver.findElement(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvAdults_imgBtnNextStep_0')]")).click();

		//AdditionalChild
		String childname = "Shrey";
		String childmname = "K";
		String childlname = "Shah";
		String childbday = "21";
		String childbmnth = "9";
		String childbyear = "2013";

		Select childdrpdwn = new Select(driver.findElement(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_ddlTitle_0')]")));
		childdrpdwn.selectByValue("Ms");

		driver.findElement(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_txtFirstName_0')]")).sendKeys(childname);

		driver.findElement(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_txtMiddleName_0')]")).sendKeys(childmname);

		driver.findElement(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_txtSurname_0')]")).sendKeys(childlname);

		Select childdatedrpdwn = new Select(driver.findElement(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_ddlDate_0')]")));
		childdatedrpdwn.selectByValue(childbday);

		Select childmonthdrpdwn = new Select(driver.findElement(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_ddlMonth_0')]")));
		childmonthdrpdwn.selectByValue(childbmnth);

		Select childyeardrpdwn = new Select(driver.findElement(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_ddlYear_0')]")));
		childyeardrpdwn.selectByValue(childbyear);

		driver.findElement(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_imgBtnNextStep_0')]")).click();

		//additional Child2 Details
		String child2name = "Misha";
		String child2mname = "K";
		String child2lname = "Shah";
		String chil2dbday = "31";
		String child2bmnth = "1";
		String child2byear = "2015";

		Select child1drpdwn = new Select(driver.findElement(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_ddlTitle_1')]")));
		child1drpdwn.selectByValue("Miss");

		driver.findElement(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_txtFirstName_1')]")).sendKeys(child2name);

		driver.findElement(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_txtMiddleName_1')]")).sendKeys(child2mname);

		driver.findElement(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_txtSurname_1')]")).sendKeys(child2lname);

		Select child1datedrpdwn = new Select(driver.findElement(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_ddlDate_1')]")));
		child1datedrpdwn.selectByValue(chil2dbday);

		Select child1monthdrpdwn = new Select(driver.findElement(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_ddlMonth_1')]")));
		child1monthdrpdwn.selectByValue(child2bmnth);

		Select child1yeardrpdwn = new Select(driver.findElement(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_ddlYear_1')]")));
		child1yeardrpdwn.selectByValue(child2byear);

		driver.findElement(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_cbxConfirmBasket_1')]")).click();

		driver.findElement(By.xpath("//*[contains(@id,'additionalPassengerDetails_lvChildren_imgBtnNextStep_1')]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sameAddressYes']"))).click();

		driver.findElement(By.xpath("//*[contains(@id,'cardHolderAddress_imgBtnNextStep')]")).click();

		System.out.println("@Payment Screen");

		driver.close();
		System.out.println("e2e Pass Successfully");
	}

}