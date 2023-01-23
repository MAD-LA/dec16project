package com.dec16.PageAction;

import com.dec16.PageLocator.LoginpageLocator;

import Utility.Base_parent;

public class LoginpageAction extends Base_parent{
	
	LoginpageLocator loginpageLocator = new LoginpageLocator();
	
	
	public void metaLoginCred(String u, String p) {
		
		loginpageLocator.Username.sendKeys(u);
		loginpageLocator.Password.sendKeys(p);
		loginpageLocator.LoginButton.click();
		
	}

}
