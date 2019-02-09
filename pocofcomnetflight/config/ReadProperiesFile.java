package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadProperiesFile {
	static String projectpath;
	static Properties prop;
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		read();
	}
	
	public static void read() {
		projectpath = System.getProperty("user.dir");
		System.out.println("Projectpath is " + projectpath);

		try {
			prop = new Properties();
			//FileInputStream ip = new FileInputStream(
			FileInputStream ip = new FileInputStream(projectpath+"\\src\\test\\java\\config\\config.properties");
					//projectpath+"src/test/java/config/config.properties");
			prop.load(ip);
			
			String Browsername = prop.getProperty("browser");
			System.out.println(Browsername);
			if(Browsername.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(prop.getProperty("url"));
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
