package framework.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import framework.dataProvider.DataProviders;
import framework.pages.CreateAccountPage;
import framework.pages.LandingPage;
import framwork.base.BaseClass;

public class TC_01_CreateAccount extends BaseClass 
{
	WebDriver driver;
	LandingPage landingPage;
	CreateAccountPage createAccountPage;
	
	
	@Test(dataProvider = "CreateAccount", dataProviderClass = DataProviders.class) 
	public void CreateAccount(String firstName,String lastName,String email,String password,String confirmPassword)
	{
		landingPage = goTo();
		createAccountPage = landingPage.moveToCreateAccountPage();
		
		Assert.assertTrue(createAccountPage.isAt(), "User is not on the create account page");
		
		createAccountPage.FillPersonalDetails(firstName,lastName);
		createAccountPage.FillSignInInformationDetails(email,password,confirmPassword);
	}
	
	
}
