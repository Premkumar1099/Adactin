package practice.com.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import practice.comBaseclass.Baseclass;

public class AutoPracticeLoginPage extends Baseclass{

	public AutoPracticeLoginPage(WebDriver xdriver) {
		this.driver=xdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[contains(@src,'logo.png')]")
	public WebElement Logo;
	
	@FindBy(name = "email")
	public WebElement EmailID;
	
	@FindBy(name = "password")
	public WebElement Password;
	
	@FindBy(xpath = "//button[text()='Login']")
	public WebElement Login_btn;
	
	@FindBy(xpath = "//p[text()='Your email or password is incorrect!']")
	public WebElement login_Error_msg;
	
	
	
}
