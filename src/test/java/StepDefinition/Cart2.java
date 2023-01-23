package StepDefinition;

import com.dec16.PageAction.CartpageAction;
import com.dec16.PageAction.HomepageAction;


import Utility.Base_parent;
import Utility.Utilitydec;
import cucumber.api.java.en.Then;

public class Cart2 extends Base_parent{

	HomepageAction homepageAction = new HomepageAction();

	CartpageAction cartpageAction = new CartpageAction ();
	

@Then("^Click Nokia Lumia$")
public void click_Nokia_Lumia() throws Throwable {
	
	homepageAction.ClickNokiaLumia();
    
}

@Then("^Click add to cart$")
public void click_add_to_cart() throws Throwable {
    
	homepageAction.Clickaddtocart();
}


@Then("^Click Cart$")
public void click_Cart() throws Throwable {
	
	homepageAction.ClickCart();
    
}

@Then("^Verify item added in cart$")
public void verify_item_added_in_cart() throws Throwable {
	
	cartpageAction.Verifyitemaddedincart();
	
	Utilitydec.takeMyScreenshot(driver, "Cart Page");
   
}


}
