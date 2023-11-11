package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;
import webpages.OrangeHRM_AddEmployeePage;
import webpages.OrangeHRM_HomePage;
import webpages.OrangeHRM_LoginPage;
import webpages.OrangeHRM_PersonalDetailsPage;
import webpages.OrangeHRM_PimHomePage;
public class TestOrangeHrmPim_StepDef extends SeleniumUtility{
	
	OrangeHRM_LoginPage getOrangeHRM_LoginPage;
	OrangeHRM_HomePage getOrangeHRM_HomePage;
	OrangeHRM_AddEmployeePage getOrangeHRM_AddEmployeePage;
	OrangeHRM_PimHomePage getOrangeHRM_PimHomePage;
	OrangeHRM_PersonalDetailsPage getOrangeHRM_PersonalDetailsPage;
	WebDriver driver;

	 @Given("^user is already in OrangeHRM login page$")
	    public void user_is_already_in_orangehrm_login_page()  {
		 driver= setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        getOrangeHRM_LoginPage=new OrangeHRM_LoginPage(driver);
	        getOrangeHRM_HomePage=new OrangeHRM_HomePage(driver);
	        getOrangeHRM_AddEmployeePage=new OrangeHRM_AddEmployeePage(driver);
	        getOrangeHRM_PimHomePage =new OrangeHRM_PimHomePage(driver);
	        getOrangeHRM_PersonalDetailsPage =new OrangeHRM_PersonalDetailsPage(driver);
	    }

	    @And("^logged in with valid username and password$")
	    public void logged_in_with_valid_username_and_password()  {
	    	getOrangeHRM_LoginPage.loginIntoOrangeHrm("Admin", "admin123");
	    }

	    @And("^click on PIM link$")
	    public void click_on_pim_link()  {
	    	getOrangeHRM_HomePage.clickOnPIM();
	    }
	    @When("^user clicks on add button$")
	    public void user_clicks_on_add_button()  {
	    	getOrangeHRM_PimHomePage.clickOnAddButton();
	    }

	    @Then("^user should be able to search newly added employee$")
	    public void user_should_be_able_to_search_newly_added_employee()  {
	    	setSleepTime(2000);
	    	String acutalMsg=getOrangeHRM_PimHomePage.getSearchResultMsg();
	    	String expectedMsg="(1) Record Found";
			Assert.assertEquals(acutalMsg, expectedMsg);
	    }

	    @And("^enters firstname, lastname, empId and click on save button$")
	    public void enters_firstname_lastname_empid_and_click_on_save_button()  {
	    	getOrangeHRM_AddEmployeePage.createEmployee("Qa", "Tester", 1070);
	    }

	    @And("^enter created empId in employee id input field$")
	    public void enter_created_empid_in_employee_id_input_field()  {
	    	getOrangeHRM_PimHomePage.searchCreatedEmployee(1070);
	    }
	    
	    @Then("^user should not be able to search newly added employee$")
	    public void user_should_not_be_able_to_search_newly_added_employee(){
	    	String acutalMsg=getOrangeHRM_PimHomePage.getSearchResultMsg();
	    	String expectedMsg="No Records Found";
			Assert.assertEquals(acutalMsg, expectedMsg);
	    }

	    @And("^select checkbox$")
	    public void select_checkbox(){
	    	getOrangeHRM_PimHomePage.selectNewlyCreatedEmpCheckBox();
	    }

	    @And("^click on delete selected$")
	    public void click_on_delete_selected(){
	    	getOrangeHRM_PimHomePage.clickOnDeleteSynbol();
	    }

	    @And("^click on yes delete button displayed on popup$")
	    public void click_on_yes_delete_button_displayed_on_popup(){
	    	getOrangeHRM_PimHomePage.confirmDeletion();
	    }
	    
	    @And("^close the browser for OrangeHRM$")
	    public void close_the_browser() {
	    	cleanUp();
	    }
}
