package SauceDemoWebPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;


public class CompletePage extends SeleniumUtility {
	


		public CompletePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="back-to-products")
		private WebElement backToHome;
		
		
		public void backToHome() {
			clickOnElement(backToHome);
		}

}
