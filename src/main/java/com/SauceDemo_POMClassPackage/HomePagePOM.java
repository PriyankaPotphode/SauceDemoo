package com.SauceDemo_POMClassPackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOM
{

	

    private WebDriver driver;
    
   private Select s;
   
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement settingbtn;
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement Logout;
	
	@FindBy(xpath= "//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement BagaddToCartButton;
//	all product
	@FindBy(xpath = "//button[text()='Add to cart']")
	private List<WebElement> Allproductaddtocart;
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement AddToCart;
	
//	single bag
	@FindBy(xpath= "//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement ClickBagProduct;
	
//	dropdown
	@FindBy(xpath = "//select[@class='product_sort_container']")
	private WebElement dropdown;
	
	public void clickDropDown()
	{
		s.selectByIndex(3);
	}
	
	public String getTextdropdown() 
	{
	
	String t = dropdown.getText();
	return t;
	}
	
	
	public void clickAddTocart()
	{
		AddToCart.click();
	}
	
	public void clickBagProduct()
	{
		ClickBagProduct.click();
	}
	public void clicksettingbtn()
	{
		settingbtn.click();
	}
	
	public void clicklogoutbtn()
	{
		Logout.click();
	}
	
	public void clickaddtocartbtn()
	{
		BagaddToCartButton.click();
	}
	
	public void clickAllProductAddtocart()
	{
		for(WebElement x:Allproductaddtocart)
		{
			x.click();
		}
		
		
	}
	
	public String addToCartgetText()
	{
		String productCount =AddToCart.getText();
		return productCount;
	}
	
	
	
	public HomePagePOM(WebDriver driver)
	{
		this.driver = driver;		 
		PageFactory.initElements(driver, this);
		
		s = new Select(dropdown);
		
	}

}
