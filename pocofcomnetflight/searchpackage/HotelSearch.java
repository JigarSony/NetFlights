package searchpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelSearch {

	public static void main(String[] args) throws InterruptedException {

		//project path
		String projectpath = System.getProperty("user.dir");
		System.out.println("Projectpath is " + projectpath);

		//chrome driver initialization
		System.setProperty("webdriver.chrome.driver", projectpath +"//drivers//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//wait and size
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//wait = new WebDriverWait(driver,30);

		//get url
		//String url = "https://www.netflights.com";
		String url = "https://nfdv2_feature.netflights.com";
		driver.get(url);

		//accept cookies
		driver.findElement(By.id("cookie_policy_agree")).click();

		//dismiss


		//click on hotels
		driver.findElement(By.linkText("Hotels")).click();

		String destinationHotel = "Dubai, United Arab Emirates";
		driver.findElement(By.id("mat-input-0")).sendKeys(destinationHotel);
		driver.findElement(By.xpath("//span[@class='mat-option-text']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
		driver.findElement(By.xpath("//ul[@id='hotel-list']//li[1]//div[2]//p[2]//a[1]")).click();
		driver.findElement(By.xpath("//p[@class='select']//input[@type='image']")).click();
		driver.findElement(By.xpath("//input[@id='confirm-basket-checkbox']")).click();
		driver.findElement(By.xpath("//a[@title='Book Now']")).click();
		
		//pax-info-and-payment.
		//Main adult pass details
		Select titledrpdwn = new Select(driver.findElement(By.xpath("//*[contains(@id,'leadPassengerDetails_ddlTitle')]")));
		titledrpdwn.selectByValue("Mr");

		String leadername = "Kevin";
//		String leadermname = "V";
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
		//driver.findElement(By.xpath("//*[contains(@id,'leadPassengerDetails_txtMiddleName')]")).sendKeys(leadermname);

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

		//driver.findElement(By.xpath("//input[@id='ContentPlaceHolderDefault_BodyContent_MainColumn_PaxDetailsAndPayment_22__leadPassengerDetails_cbxConfirmBasket']")).click();
		//*[@id="ContentPlaceHolderDefault_BodyContent_MainColumn_PaxDetailsAndPayment_22__leadPassengerDetails_imgBtnNextStep"]
		
		driver.findElement(By.xpath("//*[contains(@id,'leadPassengerDetails_cbxConfirmBasket')]")).click();
		
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
		
		
		driver.findElement(By.id("sameAddressYes")).click();
		
		driver.findElement(By.xpath("//*[contains(@id,'cardHolderAddress_imgBtnNextStep')]")).click();
		
		System.out.println("Pass");

		driver.close();
	}

}
