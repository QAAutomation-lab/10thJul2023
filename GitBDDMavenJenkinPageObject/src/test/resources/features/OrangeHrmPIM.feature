Feature: Test PIM functionality of OrangeHRM application
  Background: 
    Given user is already in OrangeHRM login page
    And logged in with valid username and password
    And click on PIM link
	@SmokeTest
  Scenario: Verify PIM creation
   When user clicks on add button
    And enters firstname, lastname, empId and click on save button
    And click on PIM link
    And enter created empId in employee id input field
    Then user should be able to search newly added employee
    And close the browser for OrangeHRM
  #Scenario: Verify PIM modification
    #When enter created empId in employee id input field
    #And click on search button
    #And click select checkbox of newly created PIM
    #And click on edit synbol
    #And enter midle name
    #And click on save button
    #And enter created empId in employee id input field
    #Then verify midle is update successfully
    #And close the browser for OrangeHRM
	
	Scenario: Verify PIM deletion
		When enter created empId in employee id input field
		And select checkbox
		And click on delete selected
		And click on yes delete button displayed on popup
		And enter created empId in employee id input field
		Then user should not be able to search newly added employee
		And close the browser for OrangeHRM