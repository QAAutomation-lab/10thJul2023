Feature: This will cover google search functionality

Scenario Outline: Validate google suggestions <itemToSearch>
Given User is already in google search page
When user trying to search <itemToSearch>
And user selects option from the suggestion
Then Selected suggestion page should be displayed with title <itemToSearch>
And close the browser
Examples:
|itemToSearch|
|selenium|
|manual|
|api|
