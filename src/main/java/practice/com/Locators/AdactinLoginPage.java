package practice.com.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import practice.comBaseclass.Baseclass;

public class AdactinLoginPage extends Baseclass{

	public AdactinLoginPage(WebDriver xdriver) {
		this.driver=xdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "img[class='logo']")
	public WebElement logo;
	
	@FindBy(id = "username")
	public WebElement username;
	
	@FindBy(id = "password")
	public WebElement password;
	
	@FindBy(id = "login")
	public WebElement login_btn;
	
	
	
	
	
}
