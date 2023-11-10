package stepdef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;

public class GoogleSearch_StepDef extends SeleniumUtility {
	WebDriver driver;
	@Given("User is already in google search page")
	public void user_is_already_in_google_search_page() {	    
	    driver=setUp("chrome", "https://www.google.com");
	}

	@When("user types {string}")
	public void user_types(String string) {	    
	    driver.findElement(By.name("q")).sendKeys(string);
	}

	@Then("user should get {string} suggestions")
	public void user_should_get_suggestions(String string) {
	    int expectedSuggCount=Integer.parseInt(string);
	    List<WebElement> suggestionList=driver.findElements(By.cssSelector(".G43f7e>li>div>*:nth-child(2)>div>*:first-child>span"));
	    Assert.assertEquals(suggestionList.size(), expectedSuggCount);
	}

	@Then("user should be able to see {string} in each suggestion")
	public void user_should_be_able_to_see_in_each_suggestion(String string) {
		List<WebElement> suggestionList=driver.findElements(By.cssSelector(".G43f7e>li>div>*:nth-child(2)>div>*:first-child>span"));
	    for(int i=0;i<suggestionList.size();i++) {
	    	suggestionList=driver.findElements(By.cssSelector(".G43f7e>li>div>*:nth-child(2)>div>*:first-child>span"));
	    	String actualSuggestion=suggestionList.get(i).getText();
	    	Assert.assertTrue(actualSuggestion.contains("selenium"));
	    }
	}

	@When("user selects option from the suggestion")
	public void user_selects_option_from_the_suggestion() {
		List<WebElement> suggestionList=driver.findElements(By.cssSelector(".G43f7e>li>div>*:nth-child(2)>div>*:first-child>span"));
		suggestionList.get(2).click();	    
	}

	@Then("Select suggestion page should be displayed")
	public void select_suggestion_page_should_be_displayed() {	    
	    String actualTitle=getCurrentTitleOfApplication();
	    Assert.assertTrue(actualTitle.contains("selenium"));
	}
	@And("^close the browser$")
	public void close_the_browser() {
		cleanUp();
	}
	
	@When("^user trying to search (.+)$")
	public void user_trying_to_search(String item) {
		 driver.findElement(By.name("q")).sendKeys(item);
	}
	
	@Then("^Selected suggestion page should be displayed with title (.+)$")
	public void selected_suggestion_page_should_be_displayed_with_title(String item) {
		String actualTitle=getCurrentTitleOfApplication();
		System.out.println("actual: "+actualTitle);
		System.out.println("Expected: "+item);
	    Assert.assertTrue(actualTitle.contains(item));
	}
}
