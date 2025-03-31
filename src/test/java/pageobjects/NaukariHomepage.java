package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NaukariHomepage extends BasePage {

	public NaukariHomepage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@href='/mnjuser/profile']")
	WebElement btnviewprofile;
	
	@FindBy(xpath = "//input[@value='Update resume']")
	WebElement btnupdateresume;

	@FindBy(xpath = "(//span[text()='editOneTheme'])[2]")
	WebElement headlineedit;
	//input[@class='dummyUpload typ-14Bold']

	@FindBy(xpath = "(//button[@class='btn-dark-ot'])[3]")
	WebElement headlinesave;
	
	
	@FindBy(xpath = "(//span[text()='editOneTheme'])[3]")
	WebElement keyskillsedit;
	
	@FindBy(xpath = "(//span[text()='editOneTheme'])[4]")
	WebElement employmentedit;
	
	@FindBy(xpath = "(//span[text()='editOneTheme'])[13]")
	WebElement profilesummaryedit;
	
	
	
	

	public String Homepagetitle() {
		
		waitForPageToLoad(10);
		return Homepagetitle();
	}

	public void updateresume(String filepath) {
		sleep(btnupdateresume);
		btnupdateresume.sendKeys(filepath);
	}
	
	public void viewprofile() {
		sleep(btnviewprofile);
		btnviewprofile.click();
	}
	
	public void headline() {
		
		
		sleep(headlineedit);
		headlineedit.click();
	}
	
	public void headlinesave() {
		sleep(headlinesave);
		headlinesave.click();
	}
	
	public void keyskills()
	{
		
		waitForPageToLoad(10);
		//scroll(keyskillsedit);
		sleep(keyskillsedit);
		keyskillsedit.click();
	}
	
	public void keyskillssave() {
		sleep(headlinesave);
		headlinesave.click();
	}
	
	public void employmentedit() {
		waitForPageToLoad(10);
		employmentedit.click();
	}
	
	public void employment() {
		waitForPageToLoad(10);
		headlinesave.click();
	}
	
	public void profileedit() {
		waitForPageToLoad(10);
		sleep(profilesummaryedit);
		profilesummaryedit.click();
	}
	
	public void profilesave() {
		waitForPageToLoad(10);
		headlinesave.click();
	}
	
	public void scroll() {
		scroll(profilesummaryedit);
	}
	
	

	

}
