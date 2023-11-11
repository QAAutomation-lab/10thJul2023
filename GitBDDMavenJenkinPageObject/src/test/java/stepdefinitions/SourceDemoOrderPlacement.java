package stepdefinitions;

import org.openqa.selenium.WebDriver;

import SauceDemoWebPages.CheckOutInfoPage;
import SauceDemoWebPages.CompletePage;
import SauceDemoWebPages.FinishPage;
import SauceDemoWebPages.SauceDemoLoginPage;
import SauceDemoWebPages.SauceDemo_CartPage;
import SauceDemoWebPages.SauceDemo_DashboardPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;

public class SourceDemoOrderPlacement extends SeleniumUtility{
	WebDriver driver;
	SauceDemoLoginPage getLoginPage;
	SauceDemo_DashboardPage getdashboardPage;
	SauceDemo_CartPage getCartPage;
	CheckOutInfoPage getInfoPage;
	FinishPage getfinishclick;
	CompletePage backhome;
	
	@Given("User is already logged in")
	public void user_is_already_logged_in() {
	  driver= setUp("chrome", "https://www.saucedemo.com/inventory.html");
	  getLoginPage=new SauceDemoLoginPage(driver);
		getdashboardPage=new SauceDemo_DashboardPage(driver);
		getCartPage=new SauceDemo_CartPage(driver);
		getInfoPage=new CheckOutInfoPage(driver);
		getfinishclick =new FinishPage(driver);
		backhome=new CompletePage(driver);
		getLoginPage.loginApplication("standard_user", "secret_sauce");		  
	}

	@When("click on add to cart link of any product")
	public void click_on_add_to_cart_link_of_any_product() {
		getdashboardPage.cartProduct();	    
	}

	@When("click on cart button")
	public void click_on_cart_button() {
		getdashboardPage.clickOnCartIcon();
	    
	}

	@Then("product should be added into the cart")
	public void product_should_be_added_into_the_cart() {
	   //TODO: verify product added in the cart
	    
	}

	@When("click on checkout button")
	public void click_on_checkout_button() {
		getCartPage.checkOut();
	    
	}

	@When("fill all required information like, firstName, LastName, ZipCode and click on continue button")
	public void fill_all_required_information_like_first_name_last_name_zip_code() {
		getInfoPage.continueButton("Bhagyashri", "Shinde", "412307");	    
	}

	@When("click on finish button")
	public void click_on_finish_button() {
		getfinishclick.finishClick();
	    
	}

	@Then("Message should be displayed {string}")
	public void message_should_be_displayed(String string) {
	   //TODO: 
	    
	}

	@Then("click on navigation pannel and click on logout")
	public void click_on_navigation_pannel_and_click_on_logout() {
	   
	    
	}

	@Then("User should be logged out from the application")
	public void user_should_be_logged_out_from_the_application() {
	   
	    
	}

}
