package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;
import webpages.VtigerHomePage;
import webpages.VtigerLoginPage;

public class TestVitgerStepDefinition extends SeleniumUtility {
	String appUrl = null;
	WebDriver driver;
	VtigerHomePage getVtigerHomePage;
	VtigerLoginPage getVtigerLoginPage;

	@Given("^User has a valid application URL$")
	public void user_has_a_valid_application_url() {
		appUrl = "https://demo.vtiger.com/vtigercrm/index.php";
	}

	@Given("^User has a valid application URL (.+)$")
	public void user_has_a_valid_application(String url) {
		System.out.println("App URL: " + url);
		appUrl = url;
	}

	@When("^User hits a login page url$")
	public void user_hits_a_login_page_url() {
		driver = setUp("chrome", appUrl);
		getVtigerLoginPage = new VtigerLoginPage(driver);
		getVtigerHomePage = new VtigerHomePage(driver);
	}

	@Then("User should reach to login page with title {string}")
	public void user_should_reach_to_login_page_with_title_something(String strArg1) {
		Assert.assertEquals(getCurrentTitleOfApplication(), strArg1, "User not reached to login page");
	}

	@Then("User should reach to home page with title {string}")
	public void user_should_remain_in_login_page_with(String pagetitle) {
		Assert.assertEquals(getCurrentTitleOfApplication(), pagetitle, "User not reached to " + pagetitle + "page");

	}

	@Then("^User should remain in login page with title (.+)$")
	public void user_should_remain_in_login_page_with_title(String pagetitle) {
		Assert.assertEquals(getCurrentTitleOfApplication(), pagetitle, "User not reached to " + pagetitle + "page");

	}

	@And("^Enter the user name as (.+)$")
	public void enter_the_user_name(String username) {
		WebElement un = driver.findElement(By.id("username"));
		typeInput(un, username);
	}

	@And("^close the browser for vtiger$")
	public void close_the_browser() {
		driver.close();
	}

	@And("^Enter the password as (.+)$")
	public void enter_the_password(String password) {
		WebElement pwd = driver.findElement(By.id("password"));
		typeInput(pwd, password);
	}

	@And("^Click on Signin button$")
	public void click_on_signin_button() {
		WebElement signInButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
		clickOnElement(signInButton);
	}

	@Then("^User should able to navigate back to login page with title \"(.+)\"$")
	public void user_should_able_to_navigate_back_to_login_page_with_title_vtiger(String title) {
		Assert.assertEquals(getCurrentTitleOfApplication(), title);
	}

	@And("^click on profile symbol$")
	public void click_on_profile_symbol() {
		getVtigerHomePage.clickOnUserProfile();
	}

	@And("^click on sign out link$")
	public void click_on_sign_out_link() {
		getVtigerHomePage.clickOnSignOutLink();
	}
}
