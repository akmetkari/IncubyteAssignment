package framework.testCases;

import org.testng.annotations.Test;

import framework.dataProvider.DataProviders;

public class Check {

	
	@Test(dataProvider = "CreateAccount",dataProviderClass = DataProviders.class) 
	public void checkTest(String name,String lname,String email,String password,String cpassword)
	{
		System.out.println(name+"="+lname+" "+email+" "+password+" "+cpassword);
		
	}
	
}
