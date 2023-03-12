package com.SauceDemo_TestClassPackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SauceDemo_POMClassPackage.HomePagePOM;
import com.SauceDemo_POMClassPackage.Login_PagePOM;

public class TC04VerifyAllProductAddToCart extends TestBaseClass

{
	@Test
	public static void TC4VerifyAllPrductAddtoCart()
	{
		
	

//	System.setProperty("webdriver.chromedriver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
//	
//	WebDriver driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	System.out.println("browser maximized");
//	
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	
//	driver.get("https://www.saucedemo.com/");
//	System.out.println("URL opened");
	
//	Login_PagePOM lp = new Login_PagePOM(driver);
//	lp.sendUsername();
//	System.out.println("username entered");
//	
//	lp.sendPassword();
//	System.out.println("password enterd");
//	
//	lp.clickloginbtn();
//	System.out.println("clicked on loginbtn");
//	
//	System.out.println("went on home page");
//	
	HomePagePOM hp = new HomePagePOM(driver);
	hp.clickAllProductAddtocart();
	System.out.println("clicked on all product");
	
	System.out.println("Apply validation");
	
	String expectedCount = "6";
	String actualCount = hp.addToCartgetText();
	
	if(expectedCount.equals(actualCount))
	{
		System.out.println("All product Tc passed");
		
	}
	else
	{
		System.out.println("All product Tc failed");
	}
	}
}
