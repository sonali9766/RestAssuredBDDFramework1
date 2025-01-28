Feature: Test Customers All Endpoints

  Background: 
    * user set Base URI

  Scenario: Retrive Customers Entity
    Given User set "customers" as BasePath
    And user will get RequestSpecification interface object
    And user add customer path parameter
    When user select http get Request to Retrive single entity
    Then user get validatable response interface
    And user check Status code as 200
    And user validate Status line as "200 OK"
    And user will validate response Time is less than 10000 ms
    And user generate response logs

  Scenario: create new customer
    Given user set "customers" base path
    And user get request specification interface object
    And user create request payload for post request
    And user add customer request payload to http requests
    When user select http post request
    Then user get Validatable response interface object
    And user validate status code 201
    And user validate status line "201 Created"
    And user validate response time below 5000 ms
    And user validate response "Content-Type" and "application/json" header
    And user validate response "Date" and "Jan 2025" header
    And user generate response logs
