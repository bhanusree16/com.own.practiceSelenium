package objectRepository;


import org.testng.Reporter;

import org.testng.annotations.Test;

import POM_pages.LoginPage;

public class Testcase_with_baseclass extends BaseClass 
{
//	before running this test it will go to base class and run before method 
//	after running this test it will go to base class and run after method
//	for each test it will do the same
	@Test(description="invalid credentials")
	public void login() throws InterruptedException
	{
		Reporter.log("=======test started=======",true);
		LoginPage obj = new LoginPage(driver);
		
		obj.loginpage("bhanu", "sareddy");
		Reporter.log("=======invalid =======",true);
		
	}
	
	@Test(description="valid credentials")
	public void login1() throws InterruptedException
	{
		Reporter.log("=======test started=======",true);
		LoginPage obj = new LoginPage(driver);
		
		obj.loginpage("bhanu12reddy", "sareddy@123");
		Reporter.log("=======valid=======",true);
		
	}
	
	
	
	

}
