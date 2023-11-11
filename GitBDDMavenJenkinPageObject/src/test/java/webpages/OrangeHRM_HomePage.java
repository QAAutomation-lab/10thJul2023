package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class OrangeHRM_HomePage extends SeleniumUtility {

	public OrangeHRM_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(css="ul.oxd-main-menu>li:nth-of-type(2) span")
	private WebElement pimLink;
	
	public void clickOnPIM() {
		clickOnElement(pimLink);
	}
}
