package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	// Browser setup

	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver.exe");

			driver = new ChromeDriver();
			System.out.println(browserName + "browser is up and running");
		} else if (browserName.equalsIgnoreCase("Firefox")) {

			System.setProperty("webdriver.gecko.driver", ".\\lib\\geckodriver.exe");

			driver = new FirefoxDriver();
			System.out.println(browserName + "browser is up and running");
		} else if (browserName.equalsIgnoreCase("Edge")) {

			System.setProperty("webdriver.edge.driver", ".\\lib\\msedgedriver.exe");

			driver = new EdgeDriver();
			System.out.println(browserName + "browser is up and running");
		} else {
			System.out.println("unable to launch " + browserName + "browser");
		}

	}

	public static void openAUT()

	{
		try {
			driver.get("https://seleniumautomationpractice.blogspot.com/");
			System.out.println("AUT is up and running");
		} catch (Exception ex) {

			System.out.println("unable to open URL" + ex.getMessage());
		}

	}

	public static void commonWait(int time)

	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

		System.out.println("waited for " + time + "seconds");

	}

	public static void click(By locName) {
		try {
			driver.findElement(locName).click();
		} catch (Exception ex) {

			System.out.println("unable to find locator " + locName + " exception " + ex + " occured");
		}

	}

	public static void sendKey(By loc, String cle) {

		try {
			driver.findElement(loc).sendKeys(cle);
		} catch (Exception ex) {

			System.out.println(ex + " Exception occured");
		}

	}

	public static void select(By loc, String nation) {

		try {

			new Select(driver.findElement(loc)).selectByVisibleText(nation);
		} catch (Exception ex) {

			System.out.println(ex + " Exception occured");
		}

	}

	public static void alertAction(String action) {

		try {

			if (action.equalsIgnoreCase("Ok")) {
				driver.switchTo().alert().accept();
			} else if (action.equalsIgnoreCase("Cancel")) {
				driver.switchTo().alert().dismiss();
			}

			
		} catch (Exception ex) {

			System.out.println("error in performing action on Alert " + action);
		}

	}

	public static void quit() {

		driver.close();
		System.out.println("Quitting the browser");
	}

}
