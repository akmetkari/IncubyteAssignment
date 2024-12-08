package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage 
{
	WebDriver driver;
	CreateAccountPage createAccountPage;
	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public CreateAccountPage moveToCreateAccountPage() {
	
		createAccountLink.click();
		createAccountPage = new CreateAccountPage(driver);
		return createAccountPage;
	}
	
	@FindBy(xpath="//div[@class='header content']/preceding::a[contains(text(),'Create an Account')]")
	WebElement createAccountLink;
	
	@FindBy(xpath = "//div[@class='header content']/preceding::a[contains(text(),'Sign In')]")
	WebElement signInLink;
	
}
