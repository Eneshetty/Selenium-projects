package com.mobiledemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class PassKeyEvents {

	AndroidDriver<AndroidElement> driver;

	@BeforeMethod
	public void OpenApp() throws MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "emulator-5554");
		cap.setCapability("platformVersion  ", "8.1");
		cap.setCapability("platformName", "Android");
		cap.setCapability("noRest", true);

		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);

		// Give the package name in the capabality

		cap.setCapability("appPackage", "io.appium.android.apis");

		// Give the name of the activity - activity name can be found in apk file

		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

	}

	@Test
	public void SendEmail() throws InterruptedException {

		Thread.sleep(3000);

		driver.findElementByAndroidUIAutomator("text(\"OS\")").click();

		Thread.sleep(3000);

		driver.findElementByAndroidUIAutomator("text(\"SMS Messaging\")").click();
		
		Thread.sleep(3000);
		
		AndroidElement e1 = driver.findElementById("io.appium.android.apis:id/sms_recipient");
		
		e1.sendKeys("HAr");
		Thread.sleep(3000);
		
		driver.pressKey(new KeyEvent(AndroidKey.I));
		
		
		
		
		//AndroidElement e1 = driver.findElementById("io.appium.android.apis:id/sms_content");
		
	}

}
