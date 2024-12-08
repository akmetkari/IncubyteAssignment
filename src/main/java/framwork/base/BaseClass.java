package framwork.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import framework.dataProvider.ConfigReader;
import framework.pages.LandingPage;

public class BaseClass 
{
	WebDriver driver;
	LandingPage landingPage;
	String browser = ConfigReader.getProperty("browser");
	String url = ConfigReader.getProperty("appURL");
	
	@BeforeTest
	public void initlizeDriver()
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else 
		{
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		
	}
	
	public LandingPage goTo( )
	{
		driver.get(url);
		landingPage = new LandingPage(driver);
		return landingPage;
	}
	
	
	
}
