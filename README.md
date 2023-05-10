# TDD with Cucumber

This project is for Checking the Login Defferent Scinarios with password and username compination 
What this project contain:
    Folder for The Drivers an it has the Chrome Driver
    Package for the Features Files and it has one feature : AmazonLogin.Feature
    Package for the Page Objects and it has one class:  AmazonLoginPage
    Package for the Step Definitions and it has on class: AmazonLoginPageSteps
    TestRunner Class to run the Features 
    POM.xml file to manage the MAVEN Dependencies 
    
    
  after the Feature file run, you will find a print-out statement that i used to assert the results for each Scenario
  the Scenarios is : 
  1- user login with valid username and password
  2- user login with Invalid Password
  3- user login with Invalid Username
  4- user login Blank Credentials
  5- user enter valid username and invalid password to reset his password
  
  
** Note: we can't automate the Rest password Scenario Due to the Validation Process that require a mobile number to receive the OTP
sent from the Website, although I did all the steps till the OTP Step **
