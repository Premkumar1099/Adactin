package stepDefination;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjectmanager.PageObjectManager;
import practice.comBaseclass.Baseclass;

public class AdactinSteps extends Baseclass{

	PageObjectManager obj=new PageObjectManager(driver);

@Given("User Launch Browser {string}")
public void user_launch_browser(String string) {
   browserLaunch(string);
}
@Given("User Navigate to Adactin Url {string}")
public void user_navigate_to_adactin_url(String string) {
   getUrl(string); 
   
}
@Then("User Verify Adactin Login screen")
public void user_verify_adactin_login_screen() {
    Assert.assertTrue(elementIsDispalyed(obj.getAdactinLoginPage().logo));
   
}
@Then("User login {string} & {string}")
public void user_login(String string, String string2) {
    elementSendkeys(obj.getAdactinLoginPage().username, string);
    elementSendkeys(obj.getAdactinLoginPage().password, string2);
    elementClick(obj.getAdactinLoginPage().login_btn);
}
@Then("User select the location {string}")
public void user_select_the_location(String string) {
    elementSelect(obj.getAdactinHomePage().location, "text", string);
   
}
@Then("User select the hotel {string}")
public void user_select_the_hotel(String string) {
    
   elementSelect(obj.getAdactinHomePage().hotels, "text", string);
}
@Then("User select room type {string}")
public void user_select_room_type(String string) {
    
   elementSelect(obj.getAdactinHomePage().roomtype,"text", string);
}
@Then("User Select no of rooms {string}")
public void user_select_no_of_rooms(String string) {
    elementSelect(obj.getAdactinHomePage().noOfRooms, "text", string);
   
}
@Then("User Enter the Check-in date {string}")
public void user_enter_the_check_in_date(String string) {
    elementSendkeys(obj.getAdactinHomePage().CheckinDate, string);
   
}
@Then("User Enter the Check-out date {string}")
public void user_enter_the_check_out_date(String string) {
	 elementSendkeys(obj.getAdactinHomePage().CheckOutDate, string);
   
}
@Then("user click the submit button")
public void user_click_the_submit_button() {
    elementClick(obj.getAdactinHomePage().Submit_btn);
}



	
}
