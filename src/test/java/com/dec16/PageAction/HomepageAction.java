package com.dec16.PageAction;

import com.dec16.PageLocator.HomepageLocator;

import Utility.Base_parent;

public class HomepageAction extends Base_parent {
	
	HomepageLocator homepageLocator = new HomepageLocator ();
	
	
	public void ClickLoginlink () throws Exception {
		
		homepageLocator.LoginLink.click();
		
		Thread.sleep(5000);
		
	}
	
	public void ClickNokiaLumia () {
		
		homepageLocator.Nokiaphone.click();
		
	}
	
	public void Clickaddtocart () throws Exception {
		
		homepageLocator.Addtocart.click();
		
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
	}

	public void ClickCart () {
		
		homepageLocator.Cartlink.click();
		
	}
	
	
}
