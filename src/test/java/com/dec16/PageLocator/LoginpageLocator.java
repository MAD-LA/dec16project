package com.dec16.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Base_parent;

public class LoginpageLocator extends Base_parent{
	
	public LoginpageLocator () {
		
		PageFactory.initElements(driver, this);
			
	}

	@FindBy(id="loginusername")
	public WebElement Username;
	
	@FindBy(id="loginpassword")
	public WebElement Password ;
	
	@FindBy(xpath="//button [text()='Log in']")
	public WebElement LoginButton;
	
	
}
