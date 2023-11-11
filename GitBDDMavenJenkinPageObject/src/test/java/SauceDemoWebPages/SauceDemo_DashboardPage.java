package SauceDemoWebPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;
public class SauceDemo_DashboardPage extends SeleniumUtility{
	
	public SauceDemo_DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	
	
	

	@FindBys(@FindBy(css=".btn.btn_primary.btn_small.btn_inventory"))
	private List<WebElement> allProduct;
	
	@FindBys(@FindBy(css="inventory_item_name"))
	private List<WebElement> allProductname;

	@FindBy(className="shopping_cart_link")
	private WebElement cartProduct;


	
	//TODO: if you need individual object in your script dn create getter method for your private WebElement
	
	public void cartProduct() {
		//String product1=getTextFromElement(allProductname.get(1));
		//String product2=getTextFromElement(allProductname.get(2));
		clickOnElement(allProduct.get(1));
		clickOnElement(allProduct.get(2));		
				
	}
	public void clickOnCartIcon() {
		clickOnElement(cartProduct);
	}
}