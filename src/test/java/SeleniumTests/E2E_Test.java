package SeleniumTests;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class E2E_Test extends Basedriver{
	

	public static void main(String[] args) throws InterruptedException {
		
		try {
			launchBrower("https://www.toolsqa.com/automation-practice-form");
			
			String currentUrl= driver.getCurrentUrl();
			
			System.out.println(" Curent URL "+currentUrl);
			
			assertEquals(currentUrl, "https://www.toolsqa.com/automation-practice-form");
			
			String formHeader=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/h1")).getText();
			
			System.out.println("Form Header ="+formHeader);
			
			assertEquals(formHeader, "Practice Automation Form");
			
//			
//			CommonMetheds.filltextbox("//input[@name='firstname']", "Pradeep");
//			
//			CommonMetheds.filltextbox("//input[@id='lastname']", "palepu");
//			
//			CommonMetheds.clickbutton("//button[@id='buttonwithclass']");
//			
//			Thread.sleep(10000);
//			
//			CommonMetheds.scroldown();
//			
//			CommonMetheds.clickbutton("//input[@id='sex-0']");		
			
			CommonMetheds.scroldown();
			
			Thread.sleep(2000);			
			WebElement element = driver.findElement(By.xpath("//select[@id='continentsmultiple']"));
			Select se = new Select(element);
			int elementsize = driver.findElements(By.xpath("//select[@id='continentsmultiple']//option")).size();
			
			System.out.println(elementsize);
			
			for (int i = 1; i < elementsize; i++) {
				se.selectByIndex(i);
				Thread.sleep(2000);	
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			quitTheBrowser();
		}
		
	}

}
