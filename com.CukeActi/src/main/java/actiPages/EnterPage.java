package actiPages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseScript.BaseScript;

public class EnterPage extends BaseScript{
	
	@FindBy(xpath="//td/a/div[text()='Tasks']") WebElement TaskMenuLInk;
	
	public EnterPage()
	{
		PageFactory.initElements(driver, this);
	}

	public String getEnterPageTitle() 
	{
		String title = driver.getTitle();
		return title;
	}

	public void clickTaskMenu() 
	{
		 TaskMenuLInk.click();
	}

}
