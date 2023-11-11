package webpages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class OrangeHRM_PimHomePage extends SeleniumUtility {

	public OrangeHRM_PimHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(css=".orangehrm-header-container>button")
	private WebElement addButton;
	
	@FindBy(xpath="//div[div[label[text()='Employee Id']]]/div[2]/input")
	private WebElement employeeIdInputField;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchButtonOnPimPage;
	
	@FindBy(css=".orangehrm-vertical-padding>span")
	private WebElement searchResultCountMsg;
	
	@FindBy(css=".oxd-table-body>div:nth-child(1) label")
	private WebElement firstEmpCheckBox;
	
	@FindBy(css=".oxd-table-body>div:nth-child(1) .bi-pencil-fill")
	private WebElement firstEmpEditSymbol;
	
	@FindBy(css=".oxd-table-body>div:nth-child(1) .bi-trash")
	private WebElement firstEmpDeleteSymbol;
	
	@FindBy(css=".orangehrm-modal-footer>button:nth-of-type(2)")
	private WebElement yesButtonOnConfirmationPopup;
	
	//Function: clickOn Add button
	public void clickOnAddButton() {
		clickOnElement(addButton);
	}
	
	//Function: search employee
	public void searchCreatedEmployee(int employeeId) {
		setSleepTime(2000);
		employeeIdInputField.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.BACK_SPACE));
		typeInput(employeeIdInputField, String.valueOf(employeeId));
		setSleepTime(2000);
		clickOnElement(searchButtonOnPimPage);
	}
	
	//Function: getSearchResultMsg
	public String getSearchResultMsg() {
		setSleepTime(2000);
		return getTextFromElement(searchResultCountMsg);
	}
	
	//Function: deleteCreatedEmployee
	public void selectNewlyCreatedEmpCheckBox() {
		clickOnElement(firstEmpCheckBox);
	}
	//Function: deleteCreatedEmployee
		public void clickOnDeleteSynbol() {
			clickOnElement(firstEmpDeleteSymbol);
		}
		//Function: deleteCreatedEmployee
		public void confirmDeletion() {
			clickOnElement(yesButtonOnConfirmationPopup);
		}
	
	//Function: clickOnEditSymbolOfCreatedEmployee
	public void editCreatedEmployee(String jobTitle) {
		clickOnElement(firstEmpCheckBox);
		clickOnElement(firstEmpEditSymbol);
	}
}

