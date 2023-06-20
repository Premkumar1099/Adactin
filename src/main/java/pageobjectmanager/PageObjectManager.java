package pageobjectmanager;

import org.openqa.selenium.WebDriver;

import practice.com.Locators.AdactinHomePage;
import practice.com.Locators.AdactinLoginPage;
import practice.com.Locators.AutoPracticeLoginPage;
import practice.com.Locators.FbLoginPage;
import practice.comBaseclass.Baseclass;

public class PageObjectManager extends Baseclass{

	public PageObjectManager(WebDriver xdriver) {
		this.driver=xdriver;
	}
	
	private FbLoginPage FbLoginPage;
	private AutoPracticeLoginPage AutoPracticeLoginPage;
	private AdactinLoginPage AdactinLoginPage;
	private AdactinHomePage AdactinHomePage;

	public AdactinHomePage getAdactinHomePage() {
		if (AdactinHomePage==null) {
			AdactinHomePage=new AdactinHomePage(driver);
		}
		return AdactinHomePage;
	}



	public AdactinLoginPage getAdactinLoginPage() {
		if (AdactinLoginPage==null) {
			AdactinLoginPage=new AdactinLoginPage(driver);
		}
		return AdactinLoginPage;
	}



	public AutoPracticeLoginPage getAutoPracticeLoginPage() {
		if (AutoPracticeLoginPage==null) {
			AutoPracticeLoginPage=new AutoPracticeLoginPage(driver);
		}
		return AutoPracticeLoginPage;
	}



	public FbLoginPage getFbLoginPage() {
		if (FbLoginPage==null) {
			FbLoginPage=new FbLoginPage(driver);
		}
		return FbLoginPage;
	}
	
	
	
	
	
}
