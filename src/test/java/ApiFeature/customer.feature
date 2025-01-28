Feature: Test Customers All Endpoints

  Background: 
    * user set Base URI

  Scenario: Retrive Customers Entity
    Given User set "customers" as BasePath
    And user will get RequestSpecification interface object
    And user add customer path parameter
    When user select http get Request to Retrive single entity
    Then user get validatable response interface
    And user check Status code as 201
    And user validate Status line as "200 OK"
    And user will validate response Time is less than 10000 ms
    And user generate response logs
