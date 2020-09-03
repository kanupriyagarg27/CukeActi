package steps;

import baseScript.BaseScript;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseSteps extends BaseScript {
	
	@Before
	public void beforeScenario(Scenario scenario)
	{
		System.out.println("i am in BaseSteps");
		initApp();
	}
	
	@After
	public void afterScenario(Scenario scenario) {
		driver.quit();
	}
	
	

}
