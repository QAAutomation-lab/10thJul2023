package day7.propertyfile;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class GoogleSuggestion {

	public static void main(String[] args) throws InterruptedException {
		String chromeExePath = System.getProperty("user.dir") + "\\Executables\\chromedriver.exe";
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		// creating an instance of Chrome browser and up-casting it to WebDriver
		// interface
		WebDriver driver = new ChromeDriver();
		// maximize browser window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// to enter required application URL use get() of WebDriver interface
		driver.get("https://www.google.com/");

		// type selenium interview questions
		driver.findElement(By.name("q")).sendKeys("selenium interview questions");

		// uncomment this line if you get stale element exception during execution
		// fluent Wait declaration
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("ul>li>div>div:nth-of-type(2)>*:first-child>span")));
		
		// get all the suggestions
		List<WebElement> sugg = driver.findElements(By.cssSelector("ul>li>div>div:nth-of-type(2)>*:first-child>span"));
		// suggestion count
		System.out.println("Suggestion count:" + sugg.size());
		// print suggestions in the console
		for (int i = 0; i < sugg.size(); i++) {
			// to avoid stale element exception re-identify the required element like below, if you are not using fluent wait
			// sugg=driver.findElements(By.cssSelector("ul>li>div>div:nth-of-type(2)>*:first-child>span"));  
			WebElement element = sugg.get(i);
			System.out.println(element.getText());
			// or
			// System.out.println(sugg.get(i).getText());
		}
	}

}
