package AlertsTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\padma\\Documents\\selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");
		
		driver.findElement(By.xpath("//button[@id=\"alert\"]")).click();
		
		Alert all = driver.switchTo().alert();
		
		System.out.println(all.getText());
		
		all.accept(); 
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement (By.xpath("//button[@id=\"confirm\"]")).click();
		System.out.println(all.getText());
		
		all.dismiss();
		
		driver.findElement(By.xpath("//button[@id=\"prompt\"]")).click();
		
		System.out.println(all.getText());
		
		all.sendKeys("Paddy");
		
		
		
		//all.sendKeys("Hello");
		
		all.accept();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
