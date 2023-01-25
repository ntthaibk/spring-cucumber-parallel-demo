Feature: Demo with MockServer

  Scenario: Demo with mockserver
    Given I generate name
    And I get name
    And I set config
    And I get config
    And I get data
    And after all

  Scenario: Demo with mockserver 2
    Given I generate name
    And I get name
    And I get data
    And after all


  Scenario: 1
    Given I populate Example2 scope
    And I print e2 scope


  Scenario: 2
    Given I print e2 scope


  @SCOPE
  Scenario: testDTO non Scenario Scope
    Given I populate non ScenarioScope testDTO
    And I print testDTO scope

  @SCOPE
  Scenario: testDTO non Scenario Scope2
    Given I print testDTO scope


    Scenario: Test get Properties Scope
      And I get property
      Given I modify property
      And I get property

      Scenario: Test again
        Given I get property
