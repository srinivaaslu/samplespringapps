Feature: access seleniumframework.com website
  Use selenium java with cucumber-jvm and navigate to website

  Scenario: print title , url
    When I open seleniumframework website
    Then I validate title and URL