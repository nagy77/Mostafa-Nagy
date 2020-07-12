package tests;

import org.testng.annotations.Test;

import pages.Registeration;
import pages.RegisterationForm;

public class UserRegisterationTest extends TestBase 
{


	Registeration RegObject;

	RegisterationForm RegFormObject;

	@Test
	public void userCanRegisterSuccessfully()	
	{
		RegObject = new Registeration(driver);
		RegObject.registeration();


		RegFormObject = new RegisterationForm(driver);
		RegFormObject.userRegisteration("Mostafa", "Nagy", "01004277058", "Mostafanagy11");
		
	}


}



