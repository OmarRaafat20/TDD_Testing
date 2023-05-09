Feature:  User Login Scenarios

  Scenario Outline: user login with valid username and password
    Given user is on login page
    When  user enter login Credentials UN <username>
    And   click on Continue button
    And   check that there is error message is displayed if wrong username is entered
    And   user enter login Credentials PW <password>
    And   clicks SignIn button
    And   check that there is error message is displayed if wrong password is entered
    Then  user is navigated to home page

    Examples: Valid Credentials
      | username                | password |
      | kartykarty272@gmail.com | 123456   |


  Scenario Outline: user login with Invalid Password
    Given user is on login page
    When  user enter login Credentials UN <username>
    And   click on Continue button
    And   check that there is error message is displayed if wrong username is entered
    And   user enter login Credentials PW <password>
    And   clicks SignIn button
    And   check that there is error message is displayed if wrong password is entered
    Then  user is navigated to home page

    Examples: Invalid Password
      | username   | password    |
      | 0101508043 | Tango@20202 |


  Scenario Outline: user login with Invalid Username
    Given user is on login page
    When  user enter login Credentials UN <username>
    And   click on Continue button
    And   check that there is error message is displayed if wrong username is entered
    And   user enter login Credentials PW <password>
    And   clicks SignIn button
    And   check that there is error message is displayed if wrong password is entered
    Then  user is navigated to home page

    Examples: Invalid Username
      | username   | password   |
      | 0101508047 | Tango@2020 |

  Scenario: user login Blank Credentials
    Given user is on login page
    And   user login with blank username
    And   click on Continue button
    And   check that there is error message is displayed if wrong username is entered
    And   user login with blank password
    And   clicks SignIn button
    And   check that there is error message is displayed if wrong password is entered
    Then  user is navigated to home page


  Scenario Outline: user enter valid username and invalid password to reset his password
    Given user is on login page
    When  user enter login Credentials UN <username>
    And   click on Continue button
    And   check that there is error message is displayed if wrong username is entered
    And   user enter login Credentials PW <password>
    And   clicks SignIn button
    And   check that there is error message is displayed if wrong password is entered
    And   user click on forgot your password
    And   verify that password assistance page is displayed
    Then  user click on continue
    And   verify that verification page is displayed

    Examples: Try to Reset Password
      | username    | password |
      | 01146847692 | tang344  |
