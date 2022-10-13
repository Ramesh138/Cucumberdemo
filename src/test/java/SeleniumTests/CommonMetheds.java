package SeleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class CommonMetheds extends Basedriver {
	
	public static void scroldown() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		  js.executeScript("window.scrollBy(0,1500)");
	}
	
	
	public static void filltextbox(String xpathvalue,String sendvalue) throws InterruptedException {
		
		driver.findElement(By.xpath(xpathvalue)).clear();
		
		driver.findElement(By.xpath(xpathvalue)).sendKeys(sendvalue);
		
		Thread.sleep(2000);
		
		System.out.println(" file the value  in the text box"+sendvalue);
	}
	
	public static void clickbutton(String xpathvalue) throws InterruptedException {
		driver.findElement(By.xpath(xpathvalue)).click();
		
		Thread.sleep(2000);
		
		System.out.println(" click the button");
	}
	
	public static void pagetoload() throws InterruptedException {
		
		Thread.sleep(1000);
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
}
