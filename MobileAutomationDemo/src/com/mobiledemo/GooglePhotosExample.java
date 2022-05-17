package com.mobiledemo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class GooglePhotosExample {
	
	public AndroidDriver<AndroidElement> driver;

	@BeforeMethod
	public void StartApp() throws MalformedURLException, InterruptedException {

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("deviceName", "emulator-5554");
		caps.setCapability("platformVersion", "8.1");
		caps.setCapability("platformName", "Android");
		caps.setCapability("noReset", "true");

		// give package name to capability
		caps.setCapability("appPackage", "com.google.android.apps.photos");

		// give app activity
		caps.setCapability("appActivity", "home.HomeActivity");

		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);

	}
	
	@Test
	public void CommonWait() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.rotate(ScreenOrientation.LANDSCAPE);
		driver.lockDevice();
		
		Thread.sleep(5000);
		driver.unlockDevice();
		
		
	}
	
	
}
