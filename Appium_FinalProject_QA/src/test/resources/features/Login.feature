@login @regression

Feature: Login

    Background: Login
        Given User is on Welcome page
        When User click Pencari kos
        And User is on Login page

    @positive-test
    Scenario Outline: Login with valid credentials
        And User input Email <email>
        And User input Password <password>
        And User click Login button
        Then User is on Home page
        Examples:
            | email             | password   |
            | "seeker@mail.com" | "password" |

    @negative-case
    Scenario Outline: Login with invalid credentials
        And User input Email <email>
        And User input Password <password>
        And User click Login button
        Then User see failed to login message
        Examples:
            | email             | password        |
            | "seeker@mail.com" | "wrongpassword" |