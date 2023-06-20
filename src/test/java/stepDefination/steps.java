package stepDefination;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjectmanager.PageObjectManager;
import practice.comBaseclass.Baseclass;

public class steps extends Baseclass{

PageObjectManager obj=new PageObjectManager(driver);

@Given("User Launch the chrome browser")
public void user_launch_the_chrome_browser() {
   browserLaunch("chrome");
}
@Given("User Navigate to the fb url {string}")
public void user_navigate_to_the_fb_url(String string) {
   getUrl(string);
}
@Then("User Verify Fb logo")
public void user_verify_fb_logo() {
  Assert.assertTrue(elementIsDispalyed(obj.getFbLoginPage().fb_logo));
}
@Then("User Enter Valid Email {string}")
public void user_enter_valid_email(String string) {
    elementSendkeys(obj.getFbLoginPage().emailID, string);
}
@Then("User Enter Valid Password {string}")
public void user_enter_valid_password(String string) {
   elementSendkeys(obj.getFbLoginPage().password, string);
}
@Then("User Click the Login Button")
public void user_click_the_login_button() {
   elementClick(obj.getFbLoginPage().login_btn);
}

@Then("User verified login sucessfull")
public void user_verified_login_sucessfull() {
    //Assert.fail();
	
}

@Then("User Verify logo")
public void user_verify_logo() {
   Assert.assertTrue(elementIsDispalyed(obj.getAutoPracticeLoginPage().Logo));
}
@Then("User Enter EmailID {string}")
public void user_enter_email_id(String string) {
   elementSendkeys(obj.getAutoPracticeLoginPage().EmailID, string);
}
@Then("USer Enter Password {string}")
public void u_ser_enter_password(String string) {
   elementSendkeys(obj.getAutoPracticeLoginPage().Password, string);
}
@Then("User Click the login Button")
public void user_click_the_login_Button() {
   elementClick(obj.getAutoPracticeLoginPage().Login_btn);
}
@Then("User Verify Error Message {string}")
public void user_verify_error_message(String string) {
    String Act= getText(obj.getAutoPracticeLoginPage().login_Error_msg);
    Assert.assertEquals(string, Act);
}

	
}
