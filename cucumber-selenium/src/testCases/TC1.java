package testCases;

import objectRepo.HomePageObjects;
import objectRepo.TestingFormPageObjects;
import utilities.BaseClass;

public class TC1 extends BaseClass{

	public static void main(String[] args) {
		 
		openBrowser("firefox");
		openAUT();
		commonWait(10);
		
		HomePageObjects.clickTestingFormPage();
		
		TestingFormPageObjects.formfill("Padmaja", "Ene","Milton","America");
		
		driver.navigate().back();
		
		HomePageObjects.clickxPathOperatorPage();
		
		driver.navigate().back();
				
		quit();

	}

}
