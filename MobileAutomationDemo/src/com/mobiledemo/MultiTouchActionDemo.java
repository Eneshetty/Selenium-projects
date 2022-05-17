package com.mobiledemo;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class MultiTouchActionDemo {

	public AndroidDriver<AndroidElement> driver;

	@BeforeTest
	public void OpenMaps() throws MalformedURLException, InterruptedException {

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("deviceName", "emulator-5554");
		caps.setCapability("platformVersion", "8.1");
		caps.setCapability("platformName", "Android");
		caps.setCapability("noReset", "true");

		// give package name to capability
		caps.setCapability("appPackage", "com.google.android.apps.maps");

		// give app activity
		caps.setCapability("appActivity", "com.google.android.maps.MapsActivity");

		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		
	}
	
	@Test
	public void MultiTouch() 
	{

		// Simulate the action for finger 1

		TouchAction t1 = new TouchAction(driver).press(PointOption.point(446, 553))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))).moveTo(PointOption.point(522, 441))
				.release();

		// Simulate the action for finger 2

		TouchAction t2 = new TouchAction(driver).press(PointOption.point(390, 497))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))).moveTo(PointOption.point(309, 563))
				.release();

		// combining using Multitouch Action

		MultiTouchAction mta = new MultiTouchAction(driver);
		
		mta.add(t1).add(t2).perform();

	}
}
