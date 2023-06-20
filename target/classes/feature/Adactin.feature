
@Adactin
Feature: Adactin Functional TestCase

  @TC-101
  Scenario: To verify valid login details 
    Given User Launch Browser "chrome"
    And User Navigate to Adactin Url "http://adactinhotelapp.com/"
    Then User Verify Adactin Login screen
    And User login "ASHIQAFRIDI98" & "Kajarahima" 


  @TC-102
  Scenario Outline: To verify whether the check-out date field accepts a later date than check-in date.
    Given User Launch Browser "chrome"
    And User Navigate to Adactin Url "http://adactinhotelapp.com/"
    Then User Verify Adactin Login screen
    And User login "ASHIQAFRIDI98" & "Kajarahima"
    And User select the location "Sydney"
    And User select the hotel "Hotel Creek"
    And User select room type "Standard"
    And User Select no of rooms "1 - One"
    And User Enter the Check-in date "22/06/2023"
    And User Enter the Check-out date "20/06/2023"
    And user click the submit button
     
   @TC-103
   Scenario Outline: To check if error is date field is in the past
    Given User Launch Browser "chrome"
    And User Navigate to Adactin Url "http://adactinhotelapp.com/"
    Then User Verify Adactin Login screen
    And User login "ASHIQAFRIDI98" & "Kajarahima"
    And User select the location "Sydney"
    And User select the hotel "Hotel Creek"
    And User select room type "Standard"
    And User Select no of rooms "1 - One"
    And User Enter the Check-in date "15/06/2023"
    And User Enter the Check-out date "17/06/2023"
    And user click the submit button
    
   @TC-104
   Scenario Outline: To verify whether locations in Select Hotel page are displayed according to them location selected in Search Hotel 
    Given User Launch Browser "chrome"
    And User Navigate to Adactin Url "http://adactinhotelapp.com/"
    Then User Verify Adactin Login screen
    And User login "ASHIQAFRIDI98" & "Kajarahima"
    And User select the location "Sydney"
    And User select the hotel "Hotel Creek"
    And User select room type "Standard"
    And User Select no of rooms "1 - One"
    And User Enter the Check-in date "20/06/2023"
    And User Enter the Check-out date "21/06/2023"
    And user click the submit button
    
   @TC-105
   Scenario Outline: To verify date and Check Out date are being displayed in Select Hotel Page according to the dates selected in search Hotel
    Given User Launch Browser "chrome"
    And User Navigate to Adactin Url "http://adactinhotelapp.com/"
    Then User Verify Adactin Login screen
    And User login "ASHIQAFRIDI98" & "Kajarahima"
    And User select the location "Sydney"
    And User select the hotel "Hotel Creek"
    And User select room type "Standard"
    And User Select no of rooms "1 - One"
    And User Enter the Check-in date "23/06/2023"
    And User Enter the Check-out date "25/06/2023"
    And user click the submit button
    
    