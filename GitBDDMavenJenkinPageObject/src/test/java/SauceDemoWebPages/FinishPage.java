package SauceDemoWebPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;


public class FinishPage extends SeleniumUtility {
	


		public FinishPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="finish")
		private WebElement finishButton;
		
		
		public void finishClick() {
			clickOnElement(finishButton);
		}

}
