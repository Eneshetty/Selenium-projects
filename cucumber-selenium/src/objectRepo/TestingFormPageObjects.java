package objectRepo;

import org.openqa.selenium.By;

import utilities.BaseClass;

public class TestingFormPageObjects extends BaseClass{
	
	public static By firstName = By.xpath("//input[@id=\"ts_first_name\"]");
	public static By lastName = By.cssSelector("input#ts_last_name");
	public static By address = By.id("ts_address");
	public static By nationality = By.xpath("//select[@name=\"ts_country\"]");
	public static By male = By.xpath("//input[@value=\"male\"]");
	public static By female = By.xpath("//input[@value=\"female\"]");
	public static By cricket = By.id("id=\"ts_checkbox1\"");
	public static By football = By.xpath("//input[@value=\"football\"]");
	public static By hockey = By.xpath("//input[@value=\"Hockey\"]");
	public static By submit = By.xpath("//input[@value=\"submit\"]");
	
	
	public static void formfill(String fname, String lname, String add, String nation) {
		
		sendKey(firstName,fname);
		sendKey(lastName,lname);
		sendKey(address,add);
		select(nationality,nation);
		click(female);
		click(football);
		click(submit);
	}

}
