package framework.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	WebDriver driver;
	HomePage homePage;
	public SignInPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	WebElement emailIDField;
	
	@FindBy(id="pass")
	WebElement passwordField;
	
	@FindBy(xpath="//button[type='submit']")
	WebElement submitButton;
	
	public HomePage enterDetails(String userName, String password) {

		emailIDField.sendKeys(userName);
		passwordField.sendKeys(password,Keys.TAB,Keys.ENTER);
		homePage = new HomePage(driver);
		return homePage;
	}
	
	
	
	
}
