package stepdefinitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;

public class TestActitimeLoginFunctionality_StepDef extends SeleniumUtility {
	String url;

	@Given("user has already valid url for actitime application")
	public void user_has_already_valid_url_for_actitime_application() {
		url = "https://demo.actitime.com/login.do";
	}

	@And("user has opeded browser with url for actitime application")
	public void user_has_opeded_browser_with_url_for_actitime_application() {
		setUp("chrome", url);
	}

	@When("user enters a valid username for actitime application")
	public void user_enters_a_valid_username_for_actitime_application() {
		typeInput(driver.findElement(By.id("username")), "admin");
	}

	@And("user enters a valid password for actitime application")
	public void user_enters_a_valid_password_for_actitime_application() {
		typeInput(driver.findElement(By.name("pwd")), "manager");
	}

	@And("user enters a invalid password for actitime application")
	public void user_enters_a_invalid_password_for_actitime_application() {
		typeInput(driver.findElement(By.name("pwd")), "admin123");
	}

	@And("user click on login button for actitime application")
	public void user_click_on_login_button_for_actitime_application() {
		clickOnElement(driver.findElement(By.id("loginButton")));

	}

	@Then("user should be in home page of actitime application")
	public void user_should_be_in_home_page_of_actitime_application() {

		String expectedHomePageTitle = "actiTIME - Login";
		String actualHomePageTitle = getCurrentTitleOfApplication(expectedHomePageTitle);

		Assert.assertEquals(expectedHomePageTitle, actualHomePageTitle);
	}

	@Then("user should not be in home page of actitime application")
	public void user_should_not_be_in_home_page_of_actitime_application() {

		String expectedHomePageTitle = "actiTIME - Enter Time-Track";
		String actualHomePageTitle = getCurrentTitleOfApplication(expectedHomePageTitle);

		Assert.assertEquals(expectedHomePageTitle, actualHomePageTitle);
	}

	@Then("click on logout from actitime application")
	public void click_on_logout_from_actitime_application() {
		clickOnElement(driver.findElement(By.id("logoutLink")));
	}

	@Then("close the browser for actitime application")
	public void close_the_browser_for_actitime_application() {
		cleanUp();
	}
}
