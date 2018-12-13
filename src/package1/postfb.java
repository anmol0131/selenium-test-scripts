package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class postfb {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/anmol/SeleniumGecko/geckodriver");

		FirefoxOptions opt = new FirefoxOptions();
		
		opt.addPreference("dom.webnotifications.enabled", false);
		
		WebDriver driver = new FirefoxDriver(opt);
		
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("molirockstar@gmail.com");
		
	    driver.findElement(By.id("pass")).sendKeys("qwert1234");
	    
	    //driver.findElement(By.id("u_0_8")).click();
	    driver.findElement(By.cssSelector(".uiButton.uiButtonConfirm")).click();
	    
	   // driver.get("http://www.facebook.com/profile.php?id=100005503098522");
	    
	    Thread.sleep(5000);
	    
		WebElement TextArea = driver.findElement(By.name("xhpc_message"));
		
		Thread.sleep(2000);
		TextArea.click();
		TextArea.sendKeys("Aur bhai kya haal hai");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("_3qpq _3qps  _2iel")).click();
		
		Thread.sleep(3000);

		
		WebElement PostBtn = driver.findElement(By.cssSelector("bqwert1234utton[data-testid='react-composer-post-button']"));
		PostBtn.click();
		
	   Thread.sleep(3000);
//	    
//	    driver.findElement(By.cssSelector("_1se_")).click();
//	    
//	    Thread.sleep(5000);
//	    
//	    driver.findElement(By.cssSelector("_2j78")).click();
	    
	    
	    
	    
	    
	    
	    
	     
	    
	    
}   
	    
	    

}
