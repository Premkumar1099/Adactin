package practice.com.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import practice.comBaseclass.Baseclass;

public class FbLoginPage extends Baseclass{

	public FbLoginPage(WebDriver xdriver) {
		this.driver=xdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "img[alt='Facebook']")
	public WebElement fb_logo;
	
	@FindBy(id = "email")
	public WebElement emailID;
	
	@FindBy(name = "pass")
	public WebElement password;
	
	@FindBy(name = "login")
	public WebElement login_btn;
	
	
}
