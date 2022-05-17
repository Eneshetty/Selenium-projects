package AlertsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\padma\\Documents\\selenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		
		WebElement e = driver.findElement(By.xpath("//select[@name=\"continents\"]"));
		
		Select s = new Select(e);
		
		s.selectByIndex(5);
		
		Thread.sleep(2000);
		
		s.selectByValue("c");
		
		Thread.sleep(2000);

		
		s.selectByVisibleText("Australia");
		
		Thread.sleep(2000);

		
		s.deselectByVisibleText("Australia");

		
		

	}

}
