package SauceDemoWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class SauceDemoLoginPage extends SeleniumUtility{
		public SauceDemoLoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		/**
		 * WebElements required
		 * username inputfield
		 * password inputfield
		 * login button
		 */
		@FindBy(id="user-name")
		private WebElement usernameInputField;
		
		@FindBy(id="password")
		private WebElement passwordInputField;
		
		@FindBy(id="login-button")
		private WebElement loginButton;
		
		//TODO: if you need individual object in your script dn create getter method for your private WebElement
		
		public void loginApplication(String username,String password) {
			typeInput(usernameInputField, username);
			typeInput(passwordInputField, password);
			clickOnElement(loginButton);
		}
	
}
