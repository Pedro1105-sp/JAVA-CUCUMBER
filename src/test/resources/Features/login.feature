# Author
# Date
# Description
@SmokeFeature
Feature: feature to test login functionality

  @smoketest
  Scenario: Check login is sucesssfull with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page
# EXEMPLO DE CENÁRIO OUTLINE
  #Scenario Outline: Check login is sucesssfull with valid credentials
    #Given user is on login page
    #When user enters <username> and <password>
    #And clicks on login button
    #Then user is navigated to the home page
#
    #Examples: 
      #| username | password |
      #| user1    | pass1    |
      #| user2    | pass2    |
