package com.SauceDemo_TestClassPackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo_POMClassPackage.HomePagePOM;
import com.SauceDemo_POMClassPackage.Login_PagePOM;

public class TestBaseClass 

{
 WebDriver driver;
Logger log = Logger.getLogger("SauceDemo1");

@BeforeMethod

public void SetUp()
{
	
		System.setProperty("webdriver.chrome.driver", 
		"./DriverFolder/chromedriver.exe");
		
		driver = new ChromeDriver();
	
		PropertyConfigurator.configure("log4j.properties");

	driver.manage().window().maximize();
	log.info("browser maximized");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.saucedemo.com/");
	log.info("URL opened");



	Login_PagePOM lp = new Login_PagePOM(driver);
	lp.sendUsername();
	log.info("username entered");
	
	lp.sendPassword();
	log.info("password enterd");
	
	lp.clickloginbtn();
	log.info("clicked on loginbtn");
	
	log.info("went on home page");
	}
@AfterMethod
public void logoutActivity()
{
	HomePagePOM hp = new HomePagePOM(driver);
	hp.clicksettingbtn();
	log.info("clicked on stg btn");
	
	hp.clicklogoutbtn();
	log.info("clicked on logout bt");
	
}

  



public void tearDown()
{
	driver.quit();
	System.out.println("browser is closed");
}
}
