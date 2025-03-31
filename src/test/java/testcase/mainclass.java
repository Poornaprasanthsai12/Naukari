package testcase;

import org.monte.screenrecorder.ScreenRecorder;
import org.testng.annotations.Test;

import net.bytebuddy.implementation.bind.MethodNameEqualityResolver;

import org.testng.annotations.Test;

import pageobjects.NaukariLoginpage;
import pageobjects.NaukariHomepage;
import testbase.BaseClass;

public class mainclass extends BaseClass {

	@Test
	public void launch() throws Exception {
		logger.info("Execution has started for the case");
		ScreenRecorderUtil.startRecord("main");
		NaukariLoginpage naukarilogin = new NaukariLoginpage(driver);
		naukarilogin.login();
		naukarilogin.emailinput(p.getProperty("username"));
		naukarilogin.passwordinput(p.getProperty("password"));
		naukarilogin.login2();
		
		
		NaukariHomepage naukarihome = new NaukariHomepage(driver);
		
		
		logger.info("successfully entred username and password");
		
		
		
		naukarihome.viewprofile();
		
		
		
		naukarihome.keyskills();
		naukarihome.keyskillssave();
		
		Thread.sleep(2000);
		naukarihome.headline();
		naukarihome.headlinesave();
		Thread.sleep(2000);
		naukarihome.employmentedit();
		naukarihome.employment();
		Thread.sleep(2000);
		
		ScreenRecorderUtil.stopRecord();
		
		
		//naukarihome.updateresume("//Users//prasanth//Documents//Resume Prasanth //Poorna_Prasanth_Sai_G.pdf");
	}

}
