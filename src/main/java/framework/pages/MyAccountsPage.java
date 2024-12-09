package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountsPage 
{
	WebDriver driver;
	public MyAccountsPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//h1")
	WebElement myAccountText;
	
	public  boolean isAt()
	{
		return  myAccountText.getText().equalsIgnoreCase("My Account");
	}
	
}


