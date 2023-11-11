Feature: This feature is create to test order placement functionality

  Background: 
    Given User is already logged in
	@SmokeTest
  Scenario: verify add to cart functionality
    When click on add to cart link of any product
    And click on cart button
    Then product should be added into the cart

  Scenario: verify order placement
    When click on add to cart link of any product
    And click on cart button
    And click on checkout button
    And fill all required information like, firstName, LastName, ZipCode and click on continue button
    And click on finish button
    Then Message should be displayed "Thank you for your order!"
    And click on navigation pannel and click on logout
    And User should be logged out from the application
