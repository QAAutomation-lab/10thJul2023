package SauceDemoWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class CheckOutInfoPage extends SeleniumUtility {
	
	public CheckOutInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first-name")
	private WebElement firstName;
	
	@FindBy(id="last-name")
	private WebElement lastName;
	
	@FindBy(id="postal-code")
	private WebElement postalCode;
	
	@FindBy(id="continue")
	private WebElement continueButton;
	
	//TODO: if you need individual object in your script dn create getter method for your private WebElement
	
	public void continueButton(String FirstName,String LastName,String PostalCode ) {
	
		typeInput(firstName, FirstName);
		typeInput(lastName, LastName);
		typeInput(postalCode, PostalCode);
		clickOnElement(continueButton);
	}

}
