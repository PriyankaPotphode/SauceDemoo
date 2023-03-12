package com.SauceDemo_TestClassPackage;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class TC1VerifyLoginFunctionality extends TestBaseClass
{
	

	
	@Test
	public void TC1LoginFunctionality()
	{
	
//	System.out.println("Apply validation");
	
	String givenTitle = "Swag Labs";
	String actualTitle = driver.getTitle();
	
	log.info("Went on home page");
	
//	Assert.assertEquals(givenTitle, actualTitle, "TC is failed");
//	}
	
	if(givenTitle.equals(actualTitle))
	{
		log.info("TC is passed");
	}
	
	else
	{
		log.info("TC is failed");
	}
	}
	
	
	
	
}




	
	
	

