package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Capability.Capabilitybase;

public class LoginPageObjects extends Capabilitybase{
	
	@FindBy(id="text")
	public WebElement userName;
	
	@FindBy(id="passwor")
	public WebElement password;
	
	@FindBy(id="login-button")
	public WebElement loginButton;


	public LoginPageObjects() {
		PageFactory.initElements(driver, this);
}
}

