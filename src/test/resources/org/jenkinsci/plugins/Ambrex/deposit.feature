Feature: Depositing money in to a User account
 
Scenario: Depositing money in to User's account should add money to the User's current balance
Given a User has no money in their account
When 100 is deposited in to the account
Then the balance should be 100

Scenario: Pending
Given a User has no money in their account
When 100 is deposited in to the account pending
Then the balance should be 100

Scenario: Error
Given a User has no money in their account
When 100 is deposited in to the account Error
Then the balance should be 100

Scenario: Missing
Given a User has no money in their account
When 100 is deposited in to the account Missing
Then the balance should be 100

Scenario: Jenkins OK
Given a User has no money in their account
When 100 is deposited in to the account Jenkins OK
Then the balance should be 100

Scenario: Jenkins Error
Given a User has no money in their account
When 100 is deposited in to the account Jenkins Error
Then the balance should be 100

Scenario: Jenkins Pending
Given a User has no money in their account
When 100 is deposited in to the account Jenkins Pending
Then the balance should be 100

Scenario: Jenkins Missing
Given a User has no money in their account
When 100 is deposited in to the account Jenkins Missing
Then the balance should be 100