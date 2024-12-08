package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {

	WebDriver driver;
	public CreateAccountPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1")
	WebElement createAccountHeader;

	public boolean isAt() {
		return driver.getCurrentUrl().contains("/account/create/");
	}
	
	
	@FindBy(id ="firstname")
	WebElement firstNameField;
	@FindBy(id="lastname")
	WebElement lastNameField;
	@FindBy(id="email_address")
	WebElement emailField;
	@FindBy(id="password")
	WebElement passwordField;
	@FindBy(id="password-confirmation")
	WebElement passwordConfirmField;
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitButtonField;

	

	public void FillPersonalDetails(String firstName,String lastName) {
		firstNameField.sendKeys(firstName);
		lastNameField.sendKeys(lastName);
	}

	public void FillSignInInformationDetails(String email,String password,String confirmPassword) {
		emailField.sendKeys(email);
		passwordField.sendKeys(password);
		passwordConfirmField.sendKeys(confirmPassword);
	}
	
	

}
