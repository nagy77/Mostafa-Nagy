package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registeration  extends PageBase
{

	public Registeration(WebDriver driver) {
		super(driver);


	}
	@FindBy(id = "u_0_q")
	WebElement firstname ;


	public void registeration()
	{
		firstname.click();

	}

}
