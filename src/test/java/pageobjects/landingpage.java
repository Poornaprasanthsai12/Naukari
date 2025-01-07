package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class landingpage extends BasePage {
	
	public landingpage(WebDriver driver)
	{
		super(driver);
	}
	
	
	
	@FindBy(xpath="//h6[text()='Dashboard']") 
	WebElement dashboard;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']") 
	WebElement profile;
	
	@FindBy(xpath="//a[@class='oxd-userdropdown-link']") 
	WebElement logout;
	
	
	
	public boolean dashboard() {
		try {
			return(dashboard.isDisplayed());
			
		}catch(Exception e) {
			return(false);
		}
		
		
	
	}
	
    public void profile() {
    	profile.click();
		
	}
    
    public void logout() {
    	
    	sleep(7, logout);
    	logout.click();
    }

}
