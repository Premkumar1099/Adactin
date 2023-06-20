package practice.com.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import practice.comBaseclass.Baseclass;

public class AdactinHomePage extends Baseclass{

	public AdactinHomePage(WebDriver xdriver) {
this.driver=xdriver;
PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "location")
	public WebElement location;
	
	@FindBy(id = "hotels")
	public WebElement hotels;
	
	@FindBy(id = "room_type")
	public WebElement roomtype;
	
	@FindBy(id = "room_nos")
	public WebElement noOfRooms;
	
	@FindBy(id = "datepick_in")
	public WebElement CheckinDate;
	
	@FindBy(id = "datepick_out")
	public WebElement CheckOutDate;
	
	@FindBy(id = "adult_room")
	public WebElement AdultRooms;
	
	@FindBy(id="Submit")
	public WebElement Submit_btn;
	
	
	
}
