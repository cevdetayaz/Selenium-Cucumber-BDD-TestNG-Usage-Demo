@Cart
Feature: TestCases

  Background:
    Given Navigate to Web Site
    Then Verify that home page is displayed successfully

  Scenario: demo test case
    And Click Giris Yap Link
    And Enter email address and password
    And Click Giris Yap button
    And Search specific item as written to searchbar
    Then Verify that search result displayed
    And Click and display second page of search results
    Then Verify that second page of search results displayed
    And Add third item to TakipEttiklerim
    And Click to Takip Listem
    Then Verify that item is displayed on the takip listem page
    And Remove item form TakipEttiklerim
    Then Verify that item is not on the TakipEttiklerim list

