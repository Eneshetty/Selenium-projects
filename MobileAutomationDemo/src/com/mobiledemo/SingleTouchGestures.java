package com.mobiledemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;

public class SingleTouchGestures {

	@Test
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

		AndroidDriver<AndroidElement> driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);

		// X:136 , Y:358

		TouchAction ta = new TouchAction(driver);

		Thread.sleep(2000);

		// Tap is used to tap on the screen

		ta.tap(PointOption.point(136, 358)).perform();

	}
}
