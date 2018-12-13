package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
public class signup {
	 public static void main(String[] args)     {
		 
		 System.setProperty("webdriver.gecko.driver","/Users/anmol/SeleniumGecko/geckodriver");
		 

		 	FirefoxOptions opt = new FirefoxOptions();
			
			opt.addPreference("dom.webnotifications.enabled", false);
			
			WebDriver driver =  new FirefoxDriver(opt);   
	        
	        driver.get("https://www.facebook.com");   
	        
	        driver.manage().window().maximize();
	        
	        WebElement firstname = driver.findElement( By.name("firstname"));
	        firstname.sendKeys("abhishek");   
	        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	        
	        driver.findElement( By.name("lastname")).sendKeys("garg");
	        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	        
	        driver.findElement( By.name("reg_email__")).sendKeys("abhi.garg.45.67@gmail.com");
	        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	        
	        driver.findElement( By.name("reg_email_confirmation__")).sendKeys("abhi.garg.45.67@gmail.com");
	        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	        
	        driver.findElement( By.name("reg_passwd__")).sendKeys("qwertq1234");
	        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	        
	        Select selectDay = new Select(driver.findElement(By.id("day")));
	        selectDay.selectByVisibleText("12");
	        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	        
	        Select selectMonth = new Select(driver.findElement(By.id("month")));
	        selectMonth.selectByVisibleText("Oct");
	        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	        
	        Select selectYear = new Select(driver.findElement(By.id("year")));
	        selectYear.selectByVisibleText("1988");
	        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	        
	        driver.findElement(By.id("u_0_a")).click();
	        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	        
	        driver.findElement(By.name("websubmit")).click();
	        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	        


	        
	        //driver.close();
	    }

}
