package AlertsTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\padma\\Documents\\selenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.findElement(By.xpath("//span[@data-reactid=\"884\"]//preceding::input[1]")).sendKeys("jackets");
		
		driver.findElement(By.xpath("//span[@data-reactid=\"884\"]")).click();
		
		WebElement e = driver.findElement(By.xpath("//section[@class=\"horizontal-filters-base\"]//following::img[1]"));
		
		Actions aa = new Actions(driver);
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		aa.moveToElement(e);
		
		
		
		

	}

}
