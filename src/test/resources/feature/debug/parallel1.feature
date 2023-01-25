Feature: Test Parallel 1

  @DEBUG
  Scenario: check parallel Scope 1
    Given I set testDTO value to "Walao"
    And I get TestDTO value

  @DEBUG
  Scenario: check parallel Scope 2
    Given I set testDTO value to "Bett"
    And I get TestDTO value

  @DEBUG
  Scenario: check parallel Scope  3
    Given I set testDTO value to "Yuuu"
    And I get TestDTO value
