package tests;

import org.testng.annotations.Test;

import pages.LoginPage;


public class UserLogin extends TestBase 
{


	LoginPage LogObject;

	

	@Test
	public void userCanRegisterSuccessfully()	
	{
		LogObject = new LoginPage(driver);
		


		LogObject = new LoginPage(driver);
		LogObject.userlogin("01004277058", "Mostafanagy11");
	}


}