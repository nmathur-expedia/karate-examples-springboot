
Feature: Testing *.feature calling another
  Background:
    * def resp = call read('classpath:features/xmlTest.feature')
    * def xmlResponse = resp.xmlResponse
  Scenario: Call xmlTest.feature and use its response.
    Given url jsonURL
    When method get
    Then status 200
    And match response.avengers.characters[0].name == xmlResponse.superheros.avengers.characters.element[0].name
