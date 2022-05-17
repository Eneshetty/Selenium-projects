package AlertsTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandler {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\padma\\Documents\\selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2019/04/new-window.html");
		
		String mw = driver.getWindowHandle();
		
		System.out.println("My window name is : " + mw);
		
		driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
		
		Set <String> awn = driver.getWindowHandles();
		
		System.out.println("Another window name : "+awn);
		
		String window1 = (String) awn.toArray()[0];
		
		String window2 = (String) awn.toArray()[1];
		
		driver.switchTo().window(window2);
			
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Kamachi amman");
		
		driver.findElement(By.xpath("//input[@name=\"q\"]")).submit();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
