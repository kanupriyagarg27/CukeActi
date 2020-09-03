package actiPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseScript.BaseScript;

public class TaskPage extends BaseScript{
	
	@FindBy(xpath="//div[@class='title ellipsis']") WebElement AddNewBtn;
    @FindBy(css = ".item.createNewCustomer") WebElement CreateNewCustLink;
    @FindBy(css = ".inputFieldWithPlaceholder.newNameField.inputNameField") WebElement NewCustName;
    @FindBy(css ="textarea[placeholder='Enter Customer Description']") WebElement CustDescArea;
    @FindBy(xpath = "//div[text()='Create Customer']") WebElement CreateCustBtn;
    @FindBy(xpath ="//div[@class='itemsContainer']/div//div[text()='abcgarg']" )WebElement cust;
    
	public TaskPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getTaskPageTitle() {
		String tpTitle = driver.getTitle();
		return tpTitle;
	}

	public void addnewbtnclick() {
		AddNewBtn.click();
	}

	public void createNewCustClick() {
		CreateNewCustLink.click();
	}

	public void EnterCustDetails() {
		NewCustName.sendKeys("abcgarg");
		CustDescArea.sendKeys("i am trying");
		CreateCustBtn.click();
	}
	
	public String validateCustCreation() {
		String text = cust.getText();
		return text;
		
	}

}