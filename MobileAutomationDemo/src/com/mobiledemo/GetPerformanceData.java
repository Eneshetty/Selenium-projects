package com.mobiledemo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class GetPerformanceData {
	public AndroidDriver<AndroidElement> driver;
	
	@BeforeMethod
	public void StartApp() throws MalformedURLException, InterruptedException {

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
	public void GetPerformanceFromDevice() 
	{
		//Getting all the supported performance Data types
		
		List<String> ls = driver.getSupportedPerformanceDataTypes();
		
		System.out.println(ls+ "\n");
		
		Iterator<String> it = ls.iterator();
		
		while(it.hasNext())
		{
			String perfData = it.next();
			
			
		}
		
		
		
		
	}
}
