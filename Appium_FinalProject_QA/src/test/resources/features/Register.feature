@register @regression

  Feature: Register

    Background: Register
      Given User is on Register page

    @positive-case
    Scenario Outline: Register with valid credentials
      When User input First Name <firstName> on register form
      And User input Last Name <lastName> on register form
      And User input Phone Number <phoneNumber> on register form
      And User input Email <email> on register form
      And User input Password <password> on register form
      And User input Confirm Password <confirmPassword> on register form
      And User click Register button
      Then User is on Home page

      Examples:
        | firstName | lastName  | phoneNumber   | email                         | password   | confirmPassword |
        | "Selamet" | "Raharjo" | "08123123123" | "selamet_raharjo@yopmail.com" | "password" | "password"      |
        | "Sri"     | "Rahayu"  | "08123123223" | "sri_rahayu@yopmail.com"      | "password" | "password"      |

    @negative-case
    Scenario Outline: Register with valid credentials
      When User input First Name <firstName> on register form
      And User input Last Name <lastName> on register form
      And User input Phone Number <phoneNumber> on register form
      And User input Email <email> on register form
      And User input Password <password> on register form
      And User input Confirm Password <confirmPassword> on register form
      And User click Register button
      Then User see failed to register message
      And User is on Home page

      Examples:
        | firstName | lastName  | phoneNumber   | email                  | password   | confirmPassword |
        | "Selamet" | "Raharjo" | "08123123123" | "wrongformatemail.com" | "password" | "password"      |
        | "Selamet" |           | "08123123123" | "wrongformatemail.com" | "password" | "password"      |