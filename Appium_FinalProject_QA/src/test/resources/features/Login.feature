@login @regression

Feature: Login

    Background: Login
        Given User is on Login page

    @positive-test
    Scenario Outline: Login with valid credentials
        When User input Username <username>
        And User input Password <password>
        And User click Login button
        Then User is on Home page
        Examples:
            | username                    | password   |
            | "synrgy_user_5@yopmail.com" | "password" |
            | "synrgy_user_4@yopmail.com" | "password" |

    @negative-case
    Scenario Outline: Login with invalid credentials
        When User input Username <username>
        And User input Password <password>
        And User click Login button
        Then User see error message show
        And User is on Login page
        Examples:
            | username                    | password    |
            | "wrongformatemail.com"      | "password"  |
            | "unlistedemail@email.com"   | "password"  |
            | "synrgy_user_4@yopmail.com" | "wrongpass" |
