Feature: Perform Google Search based on requirement
	@SmokeTest
  Scenario Outline: Search <textToBeSearched> in Google search page
    Given User is already in Google search page
    When user types <textToBeSearched> in search input field, clicks on search button
    Then user reached to search result page with the title <expectedTitle>
    And close the opened browser

    Examples: 
      | textToBeSearched             | expectedTitle                                |
      | Selenium 3.0                 | Selenium 3.0 - Google Search                 |
      #| Selenium 4.0                 | Selenium 4.0 - Google Search                 |
      #| selenium interview questions | selenium interview questions - Google Search |