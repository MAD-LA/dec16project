package com.dec16.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Base_parent;

public class HomepageLocator extends Base_parent {
	
	
	public HomepageLocator () {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="login2")
	public WebElement LoginLink;
	

	@FindBy(xpath="//a [text () = 'Nokia lumia 1520']")
	public WebElement Nokiaphone;
	
	
	@FindBy (xpath ="//a [text () = 'Add to cart']")
	public WebElement Addtocart;

	@FindBy (xpath ="//a [text () = 'Cart']")
	public WebElement Cartlink;
	
}
