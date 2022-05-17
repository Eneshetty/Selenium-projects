import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\padma\\Documents\\selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2020/12/sample.html");
		
		driver.findElement(By.id("id_form")).sendKeys("Padma");
		
		driver.findElement(By.xpath("//input[@value=\"email\"]")).sendKeys("hi");
		
		driver.findElement(By.cssSelector("input[value=\"password\"]")).sendKeys("pwd");
		
		

	}

}
