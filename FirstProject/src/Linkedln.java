import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedln {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\padma\\Documents\\selenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//open url
		driver.get("https://www.linkedin.com/login");
		
		//username
		driver.findElement(By.id("username")).sendKeys("padmaja.net4@gmail.com");
		
		//pwd
		driver.findElement(By.name("session_password")).sendKeys("Successfull@47");
		
		driver.findElement(By.className("button__password-visibility")).click();
		
		driver.findElement(By.linkText("Forgot password?")).click();
		
		driver.navigate().back();
		
		//Thread.sleep(5000);
		driver.findElement(By.name("session_password")).sendKeys("Successfull@47");
		
		driver.findElement(By.cssSelector("button[data-litms-control-urn]")).click(); 
		
			
		
		
	}

}
