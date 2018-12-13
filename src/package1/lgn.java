package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class lgn {
	
	 public static void main(String[] args) throws InterruptedException {
		 
		 System.setProperty("webdriver.gecko.driver","/Users/anmol/SeleniumGecko/geckodriver");
		 
		 FirefoxOptions opt = new FirefoxOptions();
			
			opt.addPreference("dom.webnotifications.enabled", false);
			
			WebDriver driver =  new FirefoxDriver(opt);
		 
	        String user_name = "molirockstar@gmail.com";
	        String pwd = "qwert1234";
	      
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com");
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.findElement(By.name("email")).clear();
	        driver.findElement(By.name("email")).sendKeys(user_name);
	        driver.findElement(By.name("pass")).clear();
	        driver.findElement(By.name("pass")).sendKeys(pwd);
	        driver.findElement(By.xpath("//input[contains(@value,'Log In')]")).click();
	        Thread.sleep(10000);                
	        System.out.println("logged in successfully");
	        WebElement notification = driver.findElement(By.xpath("//a[contains(@action,'cancel')]"));
	        if(notification.isDisplayed()) {
	            System.out.println("Notification is present");
	            notification.click();
	        }
	        WebElement status =driver.findElement(By.xpath("//textarea[@name='xhpc_message']"));
	        status.sendKeys("Hello");
	        Thread.sleep(3000);
	        WebDriverWait wait = new WebDriverWait(driver,30);


	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Post']"))).click();

     }
}