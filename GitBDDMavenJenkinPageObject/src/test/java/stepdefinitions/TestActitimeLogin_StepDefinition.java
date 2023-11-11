package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;
public class TestActitimeLogin_StepDefinition extends SeleniumUtility{
	WebDriver driver;
	String username,password;
	 @Given("^User is already having application URL as (.+)$")
	    public void user_is_already_having_application_url_as(String url)  {
	        driver=setUp("chrome", url);
	    }

	    @When("^user enter the username and password$")
	    public void user_enter_the_username_and_password()  {
	    	typeInput(driver.findElement(By.id("username")), username);
	    	typeInput(driver.findElement(By.name("pwd")), password);
	    }

	    @Then("^Actitime home page will be displayed with the application title as (.+)$")
	    public void actitime_home_page_will_be_displayed_with_the_application_title_as(String title)  {
	        String actutalTitle=getCurrentTitleOfApplication(title);
	        Assert.assertEquals(actutalTitle, title);
	    }

	    @And("^also having username as (.+) and password as (.+) for the application$")
	    public void also_having_username_as_and_password_as_for_the_application(String username, String password)  {
	        this.username=username;
	        this.password=password;
	    }

	    @And("^clicks on login button$")
	    public void clicks_on_login_button()  {
	    	clickOnElement(driver.findElement(By.id("loginButton")));
	    }
	    @And("^close the browser$")
	    public void close_the_browser()  {
	        cleanUp();
	    }
}
