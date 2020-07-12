package pages;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LoginPage  extends PageBase
{


	public LoginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "email")
	WebElement emailBox;
	

	@FindBy(id = "pass")
	WebElement passBox;

	@FindBy(id = "u_0_b")
	WebElement loginBtn;



	public void userlogin(String  email ,String password ) 
	{ 
		emailBox.sendKeys(email);
		passBox.sendKeys(password);
		loginBtn.click();
		


	}


}