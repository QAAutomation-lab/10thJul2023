package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;
import webpages.GoogleSearchPage;

public class TestGoogleSearch_StepDef extends SeleniumUtility {
	static WebDriver driver;
	GoogleSearchPage getGoogleSearchPage;
	@Given("^User is already in Google search page$")
	public void user_is_already_in_google_search_page() {
		driver = setUp("chrome", "https://www.google.com");
		getGoogleSearchPage = new GoogleSearchPage(driver);
	}
	@When("^user types (.+) in search input field, clicks on search button$")
	public void user_types_in_search_input_field_clicks_on_search_button(String texttobesearched) {
		getGoogleSearchPage.searchText(texttobesearched);
	}
	@And("^close the opened browser$")
	public void close_the_opened_browser() {
		cleanUp();
	}

	@Then("^user reached to search result page with the title (.+)$")
	public void user_reached_to_search_result_page_with_the_title(String expectedtitle) {
		Assert.assertEquals(getGoogleSearchPage.searchedResultPageTitle(), expectedtitle);
	}

}
