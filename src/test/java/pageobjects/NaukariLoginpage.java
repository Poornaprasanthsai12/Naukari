package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NaukariLoginpage extends BasePage {

	public NaukariLoginpage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@id='login_Layer']")
	WebElement btnlogin;

	@FindBy(xpath = "//input[@placeholder='Enter your active Email ID / Username']")
	WebElement inputboxemail;

	@FindBy(xpath = "//input[@placeholder='Enter your password' and @type='password']")
	WebElement inputboxpassword;

	@FindBy(xpath = "//button[text()='Login']")
	WebElement btnlogin2;

	public void login() {
		//sleep(4, btnlogin);
		btnlogin.click();

	}

	public void emailinput(String uname) {

		inputboxemail.sendKeys(uname);

	}

	public void passwordinput(String password) {
        
		inputboxpassword.sendKeys(password);

	}

	public void login2() {

		btnlogin2.click();

	}

}
