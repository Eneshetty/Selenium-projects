package module3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Dependency {
	
	WebDriver driver;// = new ChromeDriver();
	
	@Test (priority =0)
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\padma\\Documents\\selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority =1)
	public void openAUT() {
    driver.get("https://github.com/");
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	}
	
	@Test (priority =2)
	public void signIn() {
		driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
	}
	
	@Test (priority =3, dependsOnMethods="signIn")
	public void login() 
	{
		driver.findElement(By.xpath("//input[@name=\"login\"]")).sendKeys("peneshetty@gmail.com");
		
		driver.findElement(By.cssSelector("input#password")).sendKeys("Deloitte@47");
		
		driver.findElement(By.xpath("//input[@value=\"Sign in\"]")).click(); 
		
	}
	
	//@AfterClass
	//public void afterClass() {
////System.out.println("Test 7");
	//}
	
	//@AfterTest
	@Test(priority =4, dependsOnMethods="login", enabled =true)
	public void logout() throws InterruptedException {
		
		driver.findElement(By.xpath("//summary[@class=\"Header-link\" and @aria-label=\"View profile and more\" ]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("button[class=\"dropdown-item dropdown-signout\"]")).click();
		
	}
	
	@Test (priority =5)
	public void quit() {
		driver.quit();
	}

}
