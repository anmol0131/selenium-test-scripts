package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
public class web {
	 public static void main(String[] args)     {
		 
		 System.setProperty("webdriver.gecko.driver","/Users/anmol/SeleniumGecko/geckodriver");
		 

		 	FirefoxOptions opt = new FirefoxOptions();
			
			opt.addPreference("dom.webnotifications.enabled", false);
			
			WebDriver driver =  new FirefoxDriver(opt);   
	        
	        driver.get("http://localhost:9001");   
	        
	        driver.manage().window();
	        
	        WebElement firstname = driver.findElement( By.name("name"));
	        String name = "anmol";
	        firstname.sendKeys(name);   
	        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	        
	        driver.findElement( By.name("id")).sendKeys("12345");
	        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	        
	        driver.findElement( By.name("ContactNumber")).sendKeys("01021021");
	        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	        	        
	        driver.findElement(By.id("sss")).click();
	        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	        
	        WebElement TxtBoxContent = driver.findElement(By.id("name"));
	        String res[] = TxtBoxContent.getText().split(" ");
	        assert res[1] == name && res.length <=15 : "length limit exceeded";
	        
	        WebElement secon = driver.findElement(By.id("id"));
	        String wed[] = secon.getText().split(" ");
	        
	        assert (wed[1].matches("[0-9]+") && wed[1].length() > 0): "invalid type";
	        
	        
	        WebElement num = driver.findElement(By.id("num"));
	        String sed[] = num.getText().split(" ");
	        
	        System.out.println("1. " + res[1] + "2. " + wed[1] + "3. " + sed[1]);
	        
	        
		    
	        

	        


	        
	        
	    }

}
