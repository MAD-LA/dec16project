package com.dec16.PageAction;

import org.testng.Assert;

import com.dec16.PageLocator.CartpageLocator;

import Utility.Base_parent;

public class CartpageAction extends Base_parent{
	
	CartpageLocator cartpageLocator = new CartpageLocator ();
	
	public void Verifyitemaddedincart () throws Exception {
		
		Thread.sleep(5000);
		
		boolean Verifycart = cartpageLocator.Verifycart.isDisplayed();
		Assert.assertTrue(Verifycart);
		
		
	}
	

}
