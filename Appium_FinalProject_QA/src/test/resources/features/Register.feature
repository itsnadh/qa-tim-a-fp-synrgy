@register @regression

  Feature: Register

    Background: Register
      Given User is on Register page

    @positive-case
    Scenario: Register with valid credentials
      When User input First Name <firstName>
      And User input Last Name <lastName>
      And User input Phone Number <phoneNumber>
      And User input Email <email>
      And User input Password <password>
      And User input Confirm Password <confirmPassword>
      And User click Register button
      Then User is on Home page

      Examples:
        | firstName | lastName  | phoneNumber   | email                         | password   | confirmPassword |
        | "Selamet" | "Raharjo" | "08123123123" | "selamet_raharjo@yopmail.com" | "password" | "password"      |
        | "Sri"     | "Rahayu"  | "08123123223" | "sri_rahayu@yopmail.com"      | "password" | "password"      |

    @negative-case
     Scenario: Register with valid credentials
      When User input First Name <firstName>
      And User input Last Name <lastName>
      And User input Phone Number <phoneNumber>
      And User input Email <email>
      And User input Password <password>
      And User input Confirm Password <confirmPassword>
      And User click Register button
      Then User see error message 
      And User is on Home page

       Examples:
        | firstName | lastName  | phoneNumber   | email                  | password   | confirmPassword |
        | "Selamet" | "Raharjo" | "08123123123" | "wrongformatemail.com" | "password" | "password"      |
        | "Selamet" |           | "08123123123" | "wrongformatemail.com" | "password" | "password"      |