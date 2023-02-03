@register @regression

 Feature: Register

   Background: Register
        Given User is on Welcome page
        When User click Penyedia kos
        And User is on Login page
        And User click Daftar Yuk!
        And User is on Register page

   @positive-case
   Scenario Outline: Register with valid credentials
     When User input First Name <firstName> on register form
     And User input Last Name <lastName> on register form
     And User input Phone Number <phoneNumber> on register form
     And User input Email <email> on register form
     And User input Password <password> on register form
     And User input Confirm Password <confirmPassword> on register form
     And User click Register button
     Then User is on Verification page

     Examples:
       | firstName | lastName  | phoneNumber   | email                     | password   | confirmPassword |
       | "Selamet" | "Raharjo" | "08123123123" | "seekertest1@yopmail.com" | "password" | "password"      |
       | "Sri"     | "Rahayu"  | "08123123223" | "seekertest2@yopmail.com" | "password" | "password"      |