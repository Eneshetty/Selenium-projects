package testCases;

import org.testng.annotations.Test;

import objectRepo.HomePageObjects;
import objectRepo.TestingFormPageObjects;
import utilities.BaseClass;

public class TC2 extends BaseClass{

	@Test (priority = 0)
	public void systemSetUp() {
		
		openBrowser("edge");
		openAUT();
		commonWait(5);
		
	}
	
	@Test (priority=1)
	public void openform() {
		
		HomePageObjects.clickTestingFormPage();
		
		TestingFormPageObjects.formfill("Padmaja", "Ene","Milton","America");
		
		alertAction ("ok");
	}
	
	@Test (priority=2)
	public void closure() {
		quit();
	}

}
