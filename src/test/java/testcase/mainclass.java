package testcase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pageobjects.landingpage;
import pageobjects.orange;
import testbase.BaseClass;

public class mainclass  extends BaseClass {
	
	
	@Test
	public void launch() 
	{
		logger.info("Execution has started for the case");
		orange o=new orange(driver);
		o.username(p.getProperty("username"));
		o.password(p.getProperty("password"));
		o.login();
		landingpage lp =new landingpage(driver);
		lp.dashboard();
		lp.profile();
		lp.logout();
		logger.info("successfully entred username and password");
	}

}
