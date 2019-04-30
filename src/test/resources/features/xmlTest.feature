Feature: Fuzzy and Exact Matching of XML
  Scenario: Call /user endpoint and validate the xml
    Given url xmlURL
    When method get
    Then status 200
    And def xmlResponse = response
    * match response.superheros.avengers.brand == 'Marvel'
    * match response.superheros.avengers.characters.element[0].name == 'Tony Stark'