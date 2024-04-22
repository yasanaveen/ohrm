package com.OrangeHrmTestCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.j2objc.annotations.Property;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	String ApplicationUrl = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	public static Logger log;
	
	@BeforeMethod
	public void setup()
	{
		log =  Logger.getLogger("orangeHrm");
		PropertyConfigurator.configure("Log4j.properties");
		
		WebDriverManager.chromiumdriver().setup();
		driver=new ChromeDriver();
		log.info("chrome Browser Launched..");
		
		driver.get(ApplicationUrl);
		log.info("orangeHrm Launched successfull...");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		log.info("browser closed....");
	}

}
