package com.webautomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class WebApplicationAutomation {

public AndroidDriver<AndroidElement> driver;
	
	@Test
	public void OpenBrowser() throws MalformedURLException
	{

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("deviceName", "emulator-5554");
		caps.setCapability("platformVersion", "8.1");
		caps.setCapability("platformName", "Android");
		caps.setCapability("noReset", "true");

		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		
	   caps.setCapability("chromedriverExecutable", "C:\\Users\\padma\\Documents\\selenium\\drivers\\chromedriver.exe");
	
	   driver.get("http://automationpractice.com/index.php");
	
	
	
	}
}
