package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class orange extends BasePage{

	
	public orange(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//input[@placeholder='Username']") 
WebElement username;

@FindBy(xpath="//input[@placeholder='Passwor']") 
WebElement password;

@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']") 
WebElement login;



public void username(String uname)
{
	username.sendKeys(uname);
}

public void password(String pass)
{
	password.sendKeys(pass);
}

public void login()
{
	login.click();
}

}
