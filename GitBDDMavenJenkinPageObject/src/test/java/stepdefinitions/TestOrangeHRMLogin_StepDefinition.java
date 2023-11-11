package stepdefinitions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;
import webpagesfororangehrm.LoginPage;
public class TestOrangeHRMLogin_StepDefinition extends SeleniumUtility {
	String appUrl;	
	LoginPage getLoginPage;
	@Given("user has a valid url")
	public void user_has_a_valid_url() {
	  appUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";	    
	}
	@When("user has opened chrome browser and entered the URL")
	public void user_has_opened_chrome_browser_and_entered_the_url() {	    
		 WebDriver driver=setUp("chrome", appUrl);
		 getLoginPage=new LoginPage(driver);
	}
	@Then("user should be able to see username input field")
	public void user_should_be_able_to_see_username_input_field() {
		boolean displayStatus=isElementExist(getLoginPage.getUsernameInputField());
		boolean enbleStatus=isElementFunctional(getLoginPage.getUsernameInputField());
		String actualUserNamePlaceholdername=getAttributeValueFromElement(getLoginPage.getUsernameInputField(),"placeholder");
	    String expectedUserNamePlaceholdername="Username";
	    Assert.assertTrue(displayStatus,"Username input field is not present or visible");
	    Assert.assertTrue(enbleStatus,"Username input field is not functional");
	    Assert.assertEquals(actualUserNamePlaceholdername,expectedUserNamePlaceholdername,"Username field placeholder got changed or not present");
	}
	@And("user should be able to see password input field")
	public void user_should_be_able_to_see_password_input_field() {
		boolean displayStatus=isElementExist(getLoginPage.getPasswordInputField());
		boolean enbleStatus=isElementFunctional(getLoginPage.getPasswordInputField());
		String actualPwdPlaceholdername=getAttributeValueFromElement(getLoginPage.getPasswordInputField(),"placeholder");
	    String expectedPwdPlaceholdername="Password";
	    Assert.assertTrue(displayStatus,"Password input field is not present or visible");
	    Assert.assertTrue(enbleStatus,"Password input field is not functional");
	    Assert.assertEquals(actualPwdPlaceholdername,expectedPwdPlaceholdername,"Password field placeholder got changed or not present");   
	}
	@And("user should be able to see login button")
	public void user_should_be_able_to_see_login_button() {
	    
	    
	}

	@And("user should be able to see forgot you password link")
	public void user_should_be_able_to_see_forgot_you_password_link() {
	    
	
	}
}
