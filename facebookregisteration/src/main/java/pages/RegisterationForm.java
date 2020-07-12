package pages;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterationForm  extends PageBase
{


	public RegisterationForm(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "u_0_q")
	WebElement fnTxtBox;


	@FindBy(id = "u_0_s")
	WebElement srTxtBox;

	@FindBy(id = "u_0_v")
	WebElement mbTxtBox;

	@FindBy(id = "password_step_input")
	WebElement npTxtBox;

	@FindBy(id = "u_0_a")
	WebElement genderRdoBtn;

	@FindBy(id = "u_0_16")
	WebElement signUpBtn;

	@FindBy(xpath = "//*[@id=\"facebook\"]/body/div[4]/div[2]/div/div/div/div[3]/button\n" + 
			"")
	WebElement confirm ;

	public void userRegisteration(String  firstName ,String lastName , String MobileNumber  , String newPassword ) 
	{ 
		fnTxtBox.click();
		fnTxtBox.sendKeys(firstName);
		srTxtBox.click();
		srTxtBox.sendKeys(lastName);
		mbTxtBox.click();
		mbTxtBox.sendKeys(MobileNumber);
		npTxtBox.click();
		npTxtBox.sendKeys(newPassword);
		genderRdoBtn.click();
		signUpBtn.click();
		confirm.click();


	}


}
