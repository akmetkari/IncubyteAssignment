package framework.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import framework.dataProvider.DataProviders;
import framework.pages.HomePage;
import framework.pages.LandingPage;
import framework.pages.MyAccountsPage;
import framework.pages.SignInPage;
import framwork.base.BaseClass;

public class TCSignInWithValid02 extends BaseClass
{
	WebDriver driver;
	LandingPage landingPage;
	SignInPage signInPage;
	MyAccountsPage myAccountspage;
	HomePage homePage;
	
	@Test (dataProvider = "LoginWithCorrect", dataProviderClass = DataProviders.class) 
	public void signInWithCorrect(String userName, String password)
	{
		landingPage = goTo();
		signInPage = landingPage.moveToSignPage();
		
		homePage = signInPage.enterDetails(userName, password);
		Assert.assertTrue(homePage.isAt());
	}
}
