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

public class Given_25_9 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kca\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://nfdv2_feature.netflights.com/");
		//Wait and Size/ Dynamic Wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); // Dynamically Manage script commands in seconds
		driver.manage().deleteAllCookies(); // Delete All the Cookies
		WebDriverWait wait = new WebDriverWait(driver,3000);
		//get url
		String url = "https://nfdv2_feature.netflights.com/";
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("London Gatwick [LGW]");
		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("New York (JFK) [JFK]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-option-text']"))).click();
		driver.findElement(By.xpath("//input[@id='mat-input-2']")).click(); // click into the select number of passengers box
		//Select # of Passengers
		driver.findElement(By.xpath("//div[@class='nf-search-popup--adults']//div[@class='nf-search-popup--ageinc']")).click();
		driver.findElement(By.xpath("//div[@class='nf-search-popup--children']//div[@class='nf-search-popup--ageinc']")).click();
		driver.findElement(By.xpath("//div[@class='nf-search-popup--children']//div[@class='nf-search-popup--ageinc']")).click();
		driver.findElement(By.xpath("//input[@id='mat-input-2']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[contains(text(),'Done')]")).click();
		Thread.sleep(2000);
		//click on find flights
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
		driver.findElement(By.xpath("//div[@id='flight-list-search']"));
		String ParentWindowHandle=driver.getWindowHandle();
		System.out.println("ParentWindowHandle "+ ParentWindowHandle);
		Thread.sleep(3000);
		for(String ChildTab:driver.getWindowHandles())
		{

			driver.switchTo().window(ChildTab);
		}
		System.out.println(driver.getTitle());
		WebElement boxarea = driver.findElement(By.xpath("//li[@class='flight-result flight-option'][1]"));
		List<WebElement> l1 = boxarea.findElements(By.tagName("a"));
		System.out.println("The number of links in the boxarea are "+l1.size());
		Select sel1=new Select(driver.findElement(By.xpath("//select[@name='airline-select']")));
		sel1.selectByVisibleText("British Airways");
		driver.findElement(By.xpath("//fieldset[@class='search']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@class='flights']//li[1]//div[1]//div[3]//div[1]//a[1]//strong[1]")).click();
		//WebElement boxarea1 = driver.findElement(By.xpath("//div[@class='nf-flight-details-itinerary']"));
		//List<WebElement> l2 = boxarea.findElements(By.tagName("a"));
		//WebElement boxarea2 = driver.findElement(By.xpath("//button[@class='btn nf-flight-details-cta-btn'][1]"));
		//https://www.youtube.com/watch?v=iaI1vcEAWlM       Handle "element not clickable exception" by "Lets Kode it"
		//driver.findElement(By.xpath("//button[@id='cookie_policy_agree']")).click();
		//driver.findElement(By.xpath("//div[@class='nf-flight-details-continue']//button[@class='btn nf-flight-details-cta-btn']")).click();
		boolean invisible = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("pnl_cookie_policy_popup")));
		if(invisible) {
			WebElement continueButton = driver.findElement(By.xpath("//div[@class='nf-flight-details-continue']//button[@class='btn nf-flight-details-cta-btn']"));
			continueButton.click();
		}
		//WebElement continueButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
		//By.xpath("//div[@class='nf-flight-details-continue']")));
		//js.executeAsyncScript("arguments[0].click();", continueButton);
	}
}
//}
