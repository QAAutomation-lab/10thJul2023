package testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;
import webpages.HomePage;
import webpages.LoginPage;

public class OrangeHrmLoginLogout extends SeleniumUtility{
	WebDriver driver=null;
	LoginPage getLoginPage;
	HomePage getHomePage;
	String expectedLoginPageUrl;
	String actualLoginPageUrl;
	@BeforeTest
	public void preCondition() {
		driver=setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		getLoginPage=new LoginPage(driver);
		getHomePage=new HomePage(driver);
	}
	
	@Test(priority=1)
	public void testLoginPage() {
		expectedLoginPageUrl="login";
		actualLoginPageUrl=getCurrentUrlOfApplication();
		Assert.assertTrue(actualLoginPageUrl.contains(expectedLoginPageUrl));
	}
	@Test(priority=2)
	public void testLogout() {
		getLoginPage.loginIntoApplication("Admin", "admin123");
		getHomePage.logoutFromApplication();
		Assert.assertTrue(actualLoginPageUrl.contains(expectedLoginPageUrl));
	}
	
	@AfterTest
	public void postCondition() {
		cleanUp();
	}
}
