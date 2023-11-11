package webpagesfororangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class LoginPage extends SeleniumUtility {

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
	@FindBy(name="username")
	private WebElement usernameInputField;
	
	@FindBy(name="password")
	private WebElement passwordInputField;
	
	@FindBy(css=".orangehrm-login-button")
	private WebElement loginButton;
	
	@FindBy(css=".orangehrm-login-forgot>p")
	private WebElement forgotPasswordLink;
	
	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}

	public WebElement getUsernameInputField() {
		return usernameInputField;
	}

	public WebElement getPasswordInputField() {
		return passwordInputField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void loginIntoOrangeHrm(String username,String password) {
		typeInput(usernameInputField, username);
		typeInput(passwordInputField, password);
		clickOnElement(loginButton);
	}
}
