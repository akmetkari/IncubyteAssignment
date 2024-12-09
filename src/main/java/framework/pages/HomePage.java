package framework.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;
	WebDriverWait wait;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		 this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Set default timeout
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//div[@class='header content']/preceding::span[@class='logged-in']")
	WebElement welcomeMessage;
	
	public boolean isAt()
	{
		wait.until(ExpectedConditions.visibilityOf(welcomeMessage));
		return welcomeMessage.isDisplayed();
	}
}
