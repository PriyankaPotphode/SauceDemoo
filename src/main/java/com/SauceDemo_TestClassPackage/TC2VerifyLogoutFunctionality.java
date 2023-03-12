package com.SauceDemo_TestClassPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SauceDemo_POMClassPackage.HomePagePOM;

public class TC2VerifyLogoutFunctionality extends TestBaseClass
{
	@Test
public void TC2LogoutFunctionality()
{
	HomePagePOM hp = new HomePagePOM(driver);
	hp.clicksettingbtn();
	log.info("clicked on stg btn");
	
	hp.clicklogoutbtn();
	log.info("clicked on logout bt");
	
	String givenTitle = "Swag Labs";   //PO/BA/dev		
	String actualTitle = driver.getTitle();
	
	if(givenTitle.equals(actualTitle))
	{
		log.info("LogOut Test is passed");
	}
	else
	{
		log.info("LogOut Test is failed");
	}
	
  
	
	
	
	
	
}
}
