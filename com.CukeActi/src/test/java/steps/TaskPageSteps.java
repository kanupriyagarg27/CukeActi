package steps;


import org.testng.Assert;

import actiPages.TaskPage;
import io.cucumber.java.en.*;

public class TaskPageSteps  {
	
	TaskPage tp= new TaskPage();
	
	@Then("Task list page should be displayed")
	public void task_list_page_should_be_displayed() throws InterruptedException {
		System.out.println("Reached Task List Page"); 
		Thread.sleep(2000);
		String tptitle = tp.getTaskPageTitle();
		Assert.assertEquals(tptitle,"actiTIME - Task List");
	}

	@When("User clicks on add new button")
	public void user_clicks_on_add_new_button() {
		tp.addnewbtnclick();
	    
	}

	@Then("User selects the option new customer")
	public void user_selects_the_option_new_customer() {
	    tp.createNewCustClick();
	    
	}

	@When("User enters customer name in the text box")
	public void user_enters_customer_name_in_the_text_box() {
	    tp.EnterCustDetails();
	    
	}

	@When("User enters description in the description box")
	public void user_enters_description_in_the_description_box() {
	    
	    
	}

	@When("User clicks on the create button")
	public void user_clicks_on_the_create_button() {
	    
	    
	}

	@Then("User validate customer is created")
	public void user_validate_customer_is_created() {
		String text1 = tp.validateCustCreation();
	    Assert.assertEquals(text1, "abcgarg");
	}

	@Then("User logs out of the application")
	public void user_logs_out_of_the_application() {
	    
	    
	}


	
	

}
