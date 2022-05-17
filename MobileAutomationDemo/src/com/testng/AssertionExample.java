package com.testng;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AssertionExample {
	
	@Test
	public void AssertionAPIDemo() throws MalformedURLException {
	
	DesiredCapabilities caps = new DesiredCapabilities();
	
	caps.setCapability("deviceName", "emulator-5554");
	caps.setCapability("platformVersion", "8.1");
	caps.setCapability("platformName", "Android");
	caps.setCapability("noReset","true");
	
	 //Give the package name in the capability
	  
	  caps.setCapability("appPackage", "io.appium.android.apis");
	  
	  //Give the name of the activity - Acivity name can be identified from Apk info app
	  
	  caps.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
	  
	  AndroidDriver<AndroidElement> driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),caps);
	  
	  
	  AndroidElement e1 = driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Content\"]");
	  
	  String ActualText = e1.getText();
	  
	  System.out.println(ActualText);
	  
	  Assert.assertEquals(ActualText,"Padmaja");
	  
	  
	  //soft Assert usage
	  
	  //SoftAssert s1 = new SoftAssert();
	  
	  //s1.assertEquals(false, false)
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}

}
