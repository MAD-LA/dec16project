package com.dec16.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Base_parent;

public class CartpageLocator extends Base_parent {
	
	
	public CartpageLocator () {
		

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//td [text () = 'Nokia lumia 1520']")
	public WebElement Verifycart;
	

		
	}


