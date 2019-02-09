package searchpackage.practice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicDatePicker {
	static WebDriver driver;
	static WebElement datepicker;
	static List<WebElement> noofColumns;
	static List<String> monthlist;
	static List<WebElement> noOfColumns;

	public static void main(String[] args) {

		monthlist = Arrays.asList("January","February","March","April","June","July","August","September","October","November","December");

		int expMonth;
		int expYear;
		String expDate = null;

		String calmonth = null;
		String calyear = null;
		boolean dateNotFound;

		//project path
		String projectpath = System.getProperty("user.dir");
		System.out.println("Projectpath is " + projectpath);

		//chrome driver initialization
		System.setProperty("webdriver.chrome.driver", projectpath +"//drivers//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//wait and size
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(driver,30);

		//get url
		String url = "http://only-testing-blog.blogspot.com/2014/09/selectable.html";
		driver.get(url);

		driver.findElement(By.id("datepicker")).click();
		dateNotFound = true;

		expDate = "12";
		expMonth = 25;
		expYear = 2018;

		WebElement nxtbutton;
		nxtbutton = driver.findElement(By.className("ui-icon ui-icon-circle-triangle-e"));

		WebElement prvbutton;
		prvbutton = driver.findElement(By.className("ui-icon ui-icon-circle-triangle-w"));

		while(dateNotFound) {
			calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			//System.out.println(calmonth);

			calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
			//System.out.println(calyear);
			if(monthlist.indexOf(calmonth)+1 == expMonth && (expYear == Integer.parseInt(calyear))) {
				selectDate("15");
			}
		}
	}


	private static void selectDate(String date) {

		datepicker = driver.findElement(By.id("ui-datepicker-div"));
		//noOfColumns = datepicker.findElement(By.tagName("td"));


		for(WebElement cell : noOfColumns) {
			if (cell.getText().equals(date)) {
				cell.findElement(By.linkText(date)).click();
				break;		
			}



		}
	}
}
