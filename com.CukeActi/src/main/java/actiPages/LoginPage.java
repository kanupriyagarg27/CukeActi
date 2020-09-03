package actiPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseScript.BaseScript;

public class LoginPage extends BaseScript
{
	@FindBy(name="username") WebElement unTextBox;
	@FindBy(name="pwd") WebElement pwdTextBox;
	@FindBy(id="loginButton") WebElement loginBtn;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterloginCred(String user, String pass) {
		System.out.println("reached LoginPage enterloginCred");
	//	String name = unTextBox.getAttribute("name");
	//	System.out.println(name);	
		unTextBox.sendKeys(user);
		pwdTextBox.sendKeys(pass);	
	}
	
	public void cliclLoginbtn() {
		loginBtn.click();
	}
	
	

}
