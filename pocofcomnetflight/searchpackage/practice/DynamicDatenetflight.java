package searchpackage.practice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicDatenetflight {
	WebDriver driver;
	static WebDriverWait wait;

	public static void main(String[] args) {
		//project path
		String projectpath = System.getProperty("user.dir");
		System.out.println("Projectpath is " + projectpath);

		//chrome driver initialization
		System.setProperty("webdriver.chrome.driver", projectpath +"//drivers//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//wait and size
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,30);

		//get url
		String url = "https://nfdv2_feature.netflights.com";
		driver.get(url);

		//datepicker-Remains
		driver.findElement(By.xpath("//span[@class='selbtngroup']//button[@type='button']")).click();

		WebElement dateWidget = driver.findElement(By.className("caltable"));
		dateWidget.findElement(By.tagName("tr"));
		List<WebElement> columns = dateWidget.findElements(By.tagName("td"));
		//List<WebElement> datetxt = driver.findElement(By.className("datevalue currmonth"));
		
		//nxt
		WebElement nxtbutton;
		nxtbutton = driver.findElement(By.xpath("//div[@class='headerbtncell right']//button[@type='button']"));
		nxtbutton.click();

		String month = driver.findElement(By.className("headerlabelbtn")).getText();
		System.out.println(month);

		String[] splitstr = month.split(" ");
		String curmonth = splitstr[0];
		String curyear = splitstr[1];

		System.out.println(curmonth);
		System.out.println(curyear);
		//datevalue currmonth
		/*
		for(WebElement cell : columns) {
			if (datetxt.getText().equals("13"))
			{
				datetxt.click();
				break;		
			}
			for(WebElement cell1 : columns) {
				if (datetxt.getText().equals("20"))
				{
					datetxt.click();
					break;		
				}
			*/
			System.out.println("Pass");
			
			/*
		List<String>monthlist = Arrays.asList("January","February","March","April","June","July","August","September","October","November","December");

		String expDate = "12";
		String expMonth = "25";
		String expYear = "2018";
		boolean dateNotFound;

		WebElement nxtbutton;
		WebElement prvbutton;

		while(dateNotFound) {
			calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			//System.out.println(calmonth);

			calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
			//System.out.println(calyear);
			if(monthlist.indexOf(calmonth)+1 == expMonth && (expYear == Integer.parseInt(calyear))) {
				selectDate("15");
			}
			 */
		}
}

	
