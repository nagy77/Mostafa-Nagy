package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

	protected WebDriver driver ;



	// TODO Auto-generated method stub


	// create constructor  
	public PageBase (WebDriver driver)
	{

		PageFactory.initElements(driver, this);


		
		
		
		


	}
}
