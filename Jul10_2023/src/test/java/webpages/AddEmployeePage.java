package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class AddEmployeePage extends SeleniumUtility{
	
	public AddEmployeePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
