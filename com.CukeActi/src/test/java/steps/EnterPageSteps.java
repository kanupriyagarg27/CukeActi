package steps;

import org.testng.Assert;

import actiPages.EnterPage;
import io.cucumber.java.en.*;

public class EnterPageSteps {
	
	EnterPage ep = new EnterPage();

	@Then("User should be taken to enter time track page.")
	public void user_should_be_taken_to_enter_time_track_page()
	{
		String enterpageTitle = ep.getEnterPageTitle();
		//actiTIME -  Enter Time-Track
		Assert.assertEquals(enterpageTitle,"actiTIME - Enter Time-Track");
	}

	@When("User clicks on Task menu.")
	public void user_clicks_on_Task_menu()
	{
		ep.clickTaskMenu();
	}

}
