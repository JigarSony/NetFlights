package e2eflow;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchFlight_25 {

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

		//accept cookies
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cookie_policy_agree"))).click();

		//select flight
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Flights"))).click();

		//flying from
		String flyingfrom = "London Gatwick";
		driver.findElement(By.id("mat-input-0")).sendKeys(flyingfrom);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-option-text']"))).click();

		//fliying to
		String fliyingto = "New York (JFK)";
		driver.findElement(By.id("mat-input-1")).sendKeys(fliyingto);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-option-text']"))).click();
		
		//Date Picker - Pending
		//# of passengers - Pending
		
		//click on find flights
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();

		//select BA from Drop down
		String Airline = "British Airways";
		//Select dropdown = new Select(driver.findElement(By.name("airline-select")));
		//dropdown.selectByVisibleText(Airline);
		WebElement Airlinebox = driver.findElement(By.name("airline-select"));
		Airlinebox.sendKeys(Airline);
		

		List<WebElement> AirlineOptions = Airlinebox.findElements(By.tagName(Airline));

		for(WebElement selectLi:  AirlineOptions)

		{

			if(selectLi.getText().equals(Airline)) {																												

				selectLi.click();

			}

		}
		System.out.println("Airlines Selected");
		//click on SearchFlights
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='search-button']"))).click();

		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='flightSelect button'][1]"))).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"flight-list\"]/ul/li[1]/div//div[3]//div[1]/a"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='flight-list']/ul/li[1]/div/div[3]/div[1]/a"))).click();
		//*[@id='flight-list']/ul/li[1]/div/div[3]/div[1]/a
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"flight-list\"]/ul/li[1]/div/div[3]/div[1]/a/strong/text()"))).click();
		//*[@id="flight-list"]/ul/li[1]/div/div[3]/div[1]/a/strong/text()
		
		System.out.println("Pass");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"flight-upsell\"]/div/div[1]/div[2]/div[4]/a"))).click();

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
		driver.findElement(By.xpath("//*[contains(@id,'leadPassengerDetails_cbxConfirmBasket')]")).click();
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

		System.out.println("@Payment Screen");
		driver.close();
		System.out.println("e2e Pass Successfully");
	}
}