package steps;

import actiPages.LoginPage;
import baseScript.BaseScript;
import io.cucumber.java.en.*;

public class LoginSteps {
	LoginPage lp = new LoginPage();
	
	@Given("User navigates to Actitime page")
	public void user_navigates_to_Actitime_page() {
	  
	  BaseScript.geturl();
	    
	}

	@Then("User validates the login page title")
	public void user_validates_the_login_page_title() {
	   
	    
	}

	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) 
	 {
		
		lp.enterloginCred(string, string2);
	  }

	@When("User clicks on the login button")
	public void user_clicks_on_the_login_button() throws InterruptedException
	{
				
	    lp.cliclLoginbtn();
	    Thread.sleep(2000);
	}


}
