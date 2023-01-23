package com.dec16.PageAction;

import org.testng.Assert;

import com.dec16.PageLocator.AccountpageLocator;

import Utility.Base_parent;

public class AccountpageAction extends Base_parent {
	
	AccountpageLocator accountpageLocator = new AccountpageLocator();
	
	public void Verifyusercanloginwithvalidcredentials () throws Exception {
		
		Thread.sleep(5000);
		
		boolean verifyaccountprofile = accountpageLocator.Accountprofile.isDisplayed();
		Assert.assertTrue(verifyaccountprofile);
		
		
	}
	

}
