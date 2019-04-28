
Feature: Fuzzy and Exact Matching of JSON
  Scenario: Call /user endpoint and validate the json
    Given url jsonURL
    When method get
    Then status 200
    And match each response.avengers.characters contains {id: '#number'}
    * match response.justice-league.brand == 'DC'
