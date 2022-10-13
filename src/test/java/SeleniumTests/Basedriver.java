package SeleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basedriver {
	
	public static WebDriver driver;
	
	public static void launchBrower(String url) {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\z011615\\OneDrive - Alliance\\Desktop\\FixedTarget\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Error(" Launch Problem ");
		}
	}

	public static void closeTheBrowser() {
		try {
			driver.close();
		} catch (Exception e) {
			
			throw new Error("Closin the window ");
		}
	}
	
	public static void quitTheBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			throw new Error("Quit  the session  ");
		}
	}
	
	
	public static void name(String actual,String expected) {
		
		
		if(actual.equals(expected))

		{

		System.out.println("URL is Present");

		}

		else

		{

		System.out.println("URL is not Present");

		}
	}
}
