package objectRepo;

import org.openqa.selenium.By;

import utilities.BaseClass;

public class HomePageObjects extends BaseClass

{
	
	public static By testingFormPage = By.xpath("//a[contains(text(),\"Testing\")]");
	public static By xpathOperator = By.xpath("//a[contains(text(),\"Short\")]");

	
	public static void clickTestingFormPage() 	
	{

		click(testingFormPage);
		
	}
	
	public static void clickxPathOperatorPage() 	
	{

		click(xpathOperator);
		
	}
	

}
