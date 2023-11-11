package SauceDemoWebPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class SauceDemo_CartPage extends SeleniumUtility {
	
	public SauceDemo_CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	@FindBys(@FindBy(css="inventory_item_name"))
	private List<WebElement> cartProductname;
	
	@FindBy(id="checkout")
	private WebElement checkOut;
	
	//TODO: if you need individual object in your script dn create getter method for your private WebElement
	
	public void checkOut() {
	//String product1=getTextFromElement(cartProductname.get(1));
		//String product2=getTextFromElement(cartProductname.get(2));

		clickOnElement(checkOut);
			}
}
