package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Tutuorials {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/anmol/SeleniumGecko/geckodriver");

		FirefoxOptions opt = new FirefoxOptions();
		
		opt.addPreference("dom.webnotifications.enabled", false);
		
		WebDriver driver =  new FirefoxDriver(opt);
		
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("molirockstar@gmail.com");
		
	    driver.findElement(By.id("pass")).sendKeys("qwert1234");
	    
	    
	    
//	    driver.findElement(By.cssSelector(".uiButton.uiButtonConfirm")).click();
//	    
//	    driver.findElement(By.id("userNavigationLabel")).click();
//	    
//	    Thread.sleep(5000);
//	    
//	    WebElement signOut = driver.findElement(By.partialLinkText("Log Out"));
//	    signOut.click();
//	   
//	    driver.close();
	     
		
	}

}
