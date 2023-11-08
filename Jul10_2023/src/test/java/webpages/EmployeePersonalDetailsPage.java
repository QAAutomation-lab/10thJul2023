package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class EmployeePersonalDetailsPage extends SeleniumUtility{
	
	public EmployeePersonalDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
