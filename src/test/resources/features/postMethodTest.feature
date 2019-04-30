Feature: Test how post works.
  Scenario: Send a request by reading from a file
    Given url postJsonURL
    Given def requestJson = read('request.json')
    And request {data: '#(requestJson)'}
    When method post
    Then status 200
    And match each response.data.avengers.characters contains {id: '#number'}