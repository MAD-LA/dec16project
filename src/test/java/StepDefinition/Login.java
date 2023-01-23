package StepDefinition;

import com.dec16.PageAction.AccountpageAction;
import com.dec16.PageAction.HomepageAction;
import com.dec16.PageAction.LoginpageAction;

import Utility.Base_parent;
import Utility.Utilitydec;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login extends Base_parent {
	
	HomepageAction homepageAction = new HomepageAction();
	LoginpageAction loginpageAction = new LoginpageAction();
	AccountpageAction accountpageAction = new AccountpageAction();
	

    @Given("^MetaLaunch \"([^\"]*)\"$")
    public void metalaunch(String URL) throws Throwable {
    	metaLaunchURL(URL);
}


     @Then("^Click Login link$")
     public void click_Login_link() throws Throwable { 
    	
    	 homepageAction.ClickLoginlink();
}

     @Then("^Enter Username and Password and Click Login button$")
     public void enter_Username_and_Password_and_Click_Login_button() throws Throwable {
   
    	 loginpageAction.metaLoginCred(metaprop.getProperty("Username1"), metaprop.getProperty("Password1"));
}

     @Then("^Verify user can login with valid credentials$")
     public void verify_user_can_login_with_valid_credentials() throws Throwable {
    
    	 accountpageAction.Verifyusercanloginwithvalidcredentials();
    	 
    	 Utilitydec.takeMyScreenshot(driver, "Account Profile Page");
}



}
