package com.SauceDemo_POMClassPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_PagePOM 


{
	private WebDriver driver;
	
//	Login finctionality find element action perform
	
	@FindBy(xpath = "//input[@id='user-name']")
	 WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	 WebElement password;
	
	@FindBy(xpath= "//input[@id='login-button']")
	WebElement Loginbtn;
	
	

	
	public void sendUsername()
	{
		username.sendKeys("standard_user");
	}
	
   public void sendPassword()
{
	password.sendKeys("secret_sauce");
}
	
	public void clickloginbtn()
	{
		Loginbtn.click();
	}

	
	public  Login_PagePOM(WebDriver driver)
		 {
		this.driver = driver;		 
		 PageFactory.initElements(driver, this);

		 }
 	
	

}
