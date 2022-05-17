package com.mobiledemo;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LaunchApp {

	public static void main(String[] args) throws IOException {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "emulator-5554");
		cap.setCapability("platformVersion  ", "8.1");
		cap.setCapability("platformName", "Android");
		cap.setCapability("noRest", true);

		AndroidDriver<AndroidElement> driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);

		// Give the package name in the capabality

		cap.setCapability("appPackage", "com.android.calculator2");

		// Give the name of the activity - activity name can be found in apk file

		cap.setCapability("appActivity", ".Calculator");

		/*driver.findElementByXPath("//android.widget.Button[@text='5']").click();

		driver.findElementByAccessibilityId("multiply").click();

		driver.findElementById("com.android.calculator2:id/digit_3").click();

		driver.findElementByAndroidUIAutomator("text(\"=\")").click();

		driver.resetApp();
		
		//driver.resetApp()

		driver.findElementByXPath("//android.widget.Button[@text='6']").click();

		driver.findElementByAccessibilityId("multiply").click();

		driver.findElementById("com.android.calculator2:id/digit_6").click();

		driver.findElementByAndroidUIAutomator("text(\"=\")").click(); */
		
	//	driver.pushFile("/sdcard/Download/img.JPG",new File("C:\\Users\\padma\\Desktop\\img.JPG"));
		
		
		driver.removeApp("io.appium.android.apis");

	}

}
