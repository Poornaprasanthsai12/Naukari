package testcase;

import org.testng.Assert;

import org.testng.annotations.Test;


import pageobjects.landingpage;
import pageobjects.orange;
import testbase.BaseClass;
import utilities.DataProviders;


/*Data is valid  - login success - test pass  - logout
Data is valid -- login failed - test fail

Data is invalid - login success - test fail  - logout
Data is invalid -- login failed - test pass
*/

public class TC_003_LoginDDT extends testbase.BaseClass
{

	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void verify_loginDDT(String uname, String pass, String exp)
	{
		logger.info("**** Starting TC_003_LoginDDT *****");
		
		try {
	
			orange o=new orange(driver);
			o.username(p.getProperty(uname));
			o.password(p.getProperty(pass));
			o.login();
			//My Account Page
			landingpage lp=new landingpage(driver);
			boolean targetPage=lp.dashboard();
			
			if(exp.equalsIgnoreCase("Valid"))
			{
				if(targetPage==true)
				{
					lp.profile();
					lp.logout();
					Assert.assertTrue(true);
				}
				else
				{
					Assert.assertTrue(false);
				}
			}
			
			if(exp.equalsIgnoreCase("Invalid"))
			{
				if(targetPage==true)
				{
					lp.profile();
					lp.logout();
					Assert.assertTrue(false);
				}
				else
				{
					Assert.assertTrue(true);
				}
			}
		}
		catch(Exception e)
		{
			Assert.fail("An exception occurred: " + e.getMessage());
		}
			
		logger.info("**** Finished TC_003_LoginDDT *****");
	}
	
}








