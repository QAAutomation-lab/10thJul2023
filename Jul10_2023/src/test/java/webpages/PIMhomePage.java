package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class PIMhomePage extends SeleniumUtility{
	
	public PIMhomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
