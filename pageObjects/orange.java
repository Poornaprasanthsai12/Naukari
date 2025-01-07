package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//input[@name='username']") 
WebElement username;

@FindBy(xpath="//input[@name='password']") 
WebElement password;



public void clickMyAccount()
{
	username.click();
}

public void clickRegister()
{
	password.click();
}

}
