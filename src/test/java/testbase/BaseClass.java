package testbase;



import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.logging.log4j.LogManager;//log4j
import org.apache.logging.log4j.Logger;   //log4j

public class BaseClass {

	
	
	
	public Properties p;
	public static WebDriver driver;
	public Logger logger;
	
	
	
	@BeforeClass
	@Parameters({"os", "browser"})
	//String os, String br
	public void setup(String os, String br) throws IOException
	
	{
		
		FileInputStream file=new FileInputStream("./src//main//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		
		
		logger=LogManager.getLogger(this.getClass());//Log4j
		//WebDriverManager.chromedriver().setup();
//		switch(br.toLowerCase())
//		{
//		case "chrome": driver=new ChromeDriver(); break;
//		case "edge": driver=new EdgeDriver(); break;
//		default: System.out.println("No matching browser..");
//					return;
//		}
		ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless"); // Run Chrome in headless mode
                options.addArguments("--no-sandbox"); // Bypass OS security model
                options.addArguments("--disable-dev-shm-usage"); // For low-memory environments
                options.addArguments("--disable-gpu"); 
                driver = new ChromeDriver(options);
		//driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
	}
	

	@AfterClass
	public void tearDown()
	{
		//extent.flush();
		//extent.flush();
		driver.close();
	}
	
	

	public String randomeString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	public String randomeNumber()
	{
		String generatedString=RandomStringUtils.randomNumeric(10);
		return generatedString;
	}
	
	public String randomAlphaNumeric()
	{
		String str=RandomStringUtils.randomAlphabetic(3);
		String num=RandomStringUtils.randomNumeric(3);
		
		return (str+"@"+num);
	}
	
	public String captureScreen(String tname) throws IOException   {

		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.hh:mm:ss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"/screenshots/"+ tname + "_" + timeStamp + ".png";
		

		File targetFile=new File(targetFilePath);
		
		//sourceFile.renameTo(targetFile);
		//FileUtils.copyFile(sourceFile, targetFile);
//		File targetFile=new File(targetFilePath);
//		
		sourceFile.renameTo(targetFile);
		
		
		
		
		return targetFilePath;

	}
	
}
	
	
