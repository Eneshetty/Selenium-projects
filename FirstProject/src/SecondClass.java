import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    //System.out.println("Hello World");
    
    
    // start browser
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\padma\\Documents\\selenium\\drivers\\chromedriver.exe");
    
    WebDriver driver = new ChromeDriver();
    
    
    driver.get("https://github.com/");
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	
	driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
	
	
	driver.findElement(By.xpath("//input[@name=\"login\"]")).sendKeys("peneshetty@gmail.com");
		
	driver.findElement(By.cssSelector("input#password")).sendKeys("Deloitte@47");
		
	driver.findElement(By.xpath("//input[@value=\"Sign in\"]")).click(); 
	
		driver.findElement(By.xpath("//summary[@class=\"Header-link\" and @aria-label=\"View profile and more\" ]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("button[class=\"dropdown-item dropdown-signout\"]")).click();
		
    
   // shutting down
    //driver.close();
    driver.quit();
    
    //element handling
     
    
    
	}

}
