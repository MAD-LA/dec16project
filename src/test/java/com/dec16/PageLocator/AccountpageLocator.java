package com.dec16.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Base_parent;

public class AccountpageLocator extends Base_parent {
	
	public AccountpageLocator () {
		
		PageFactory.initElements(driver, this);
		}

		@FindBy(id="nameofuser")
		public WebElement Accountprofile;
		
		
	}
	


