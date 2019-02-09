package searchpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GivenOld_18_9 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kca\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://nfdv2_feature.netflights.com/");
		//project path
		String projectpath = System.getProperty("user.dir");
		System.out.println("Projectpath is " + projectpath);
		//wait and size
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,30);
		//get url
		String url = "https://nfdv2_feature.netflights.com/";
		driver.get(url);
		//accept cookies
		//driver.findElement(By.id("cookie_policy_agree")).click();
		//select flight
		driver.findElement(By.xpath("//ul[@class='nf-nav-links tabs tabs-transparent js-nav-link-scroll']//li[1]")).click();
		//flying from
		String flyingfrom = "London Gatwick [LGW]";
		driver.findElement(By.id("mat-input-0")).sendKeys(flyingfrom);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-option-text']"))).click();
		//fliying to
		String fliyingto = "Miami [MIA]";
		driver.findElement(By.id("mat-input-1")).sendKeys(fliyingto);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-option-text']"))).click();
		//Select # of passenger
		driver.findElement(By.xpath("//input[@id='mat-input-2']")).click();
		//Select 2 adult
		//click on +
		driver.findElement(By.xpath("//div[@class='nf-search-popup--adults']//div[@class='nf-search-popup--ageinc']")).click();
		//child
		//Select 2 child
		driver.findElement(By.xpath("//div[@class='nf-search-popup--children']//div[@class='nf-search-popup--ageinc']")).click();
		driver.findElement(By.xpath("//div[@class='nf-search-popup--children']//div[@class='nf-search-popup--ageinc']")).click();
		//Click on done button - unable to do
		//button[contains(text(),'Done')]
		//driver.findElement(By.xpath("//button[contains(text(),'Done')]")).click();
		//click on # of passenger
		driver.findElement(By.xpath("//input[@id='mat-input-2']")).click();
		//click on find flights
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
		String ParentWindowHandle=driver.getWindowHandle();
		System.out.println("ParentWindowHandle "+ ParentWindowHandle);
		Thread.sleep(3000);
		for(String ChildTab:driver.getWindowHandles())
		{
			driver.switchTo().window(ChildTab);
		}
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		String Airline = "British Airways";
		WebElement Airlinebox=driver.findElement(By.xpath("//select[@name='airline-select']"));
		Airlinebox.sendKeys("British Airways");
		Thread.sleep(1000);
		List<WebElement> AirlineOptions= Airlinebox.findElements(By.tagName("British Airways"));
		for(WebElement selectLi:  AirlineOptions)
		{
			if(selectLi.getText().equals(Airline)) {
				selectLi.click();
			}
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='search-button']")).click();
		Thread.sleep(1000);
		//https://www.youtube.com/watch?v=k1RnQG9XzM4
		WebElement boxarea = driver.findElement(By.xpath("//li[@class='flight-result flight-option'][1]"));
		//WebElement boxarea = driver.findElement(By.xpath("//div[@id='flight-results']"));
		List<WebElement> l1 = boxarea.findElements(By.tagName("a"));
		System.out.println("The number of links in the boxarea are "+l1.size());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='flightSelect button'][1]")).click();
	}
}
//}
