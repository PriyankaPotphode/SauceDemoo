package com.SauceDemo_TestClassPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SauceDemo_POMClassPackage.HomePagePOM;

public class TC03VerifyBagProductAddTocart extends TestBaseClass
{
	@Test

	public void TC3BagProductAddTocart () 
	{
		
		
		HomePagePOM hp = new HomePagePOM(driver);
		hp.clickaddtocartbtn();
		log.info("clicked on add to art butn");
		
		System.out.println("Apply validation");
		
		String expectedCount = "1";	
		String actualCount = hp.addToCartgetText();
		
		if(expectedCount.equals(actualCount))
		{
			log.info("Bag Product test case is passed");
		}
		else
		{
			
			log.info("Bag Product test case is failed");
			
		}

}
}

