@login @regression

Feature: Login

    Background: Login
        Given User is on Login page

    @positive-test
    Scenario Outline: Login with valid credentials
        When User input valid Username <username>
        And User input valid Password <password>
        And User click Login button
        Then User is on Home page
        Examples:
            | username                    | password   |
            | "synrgy_user_5@yopmail.com" | "password" |

    @negative-case
#    Scenario Outline: Login with invalid credentials
#        When User input invalid Username <username>
#        And User input invalid Password <password>
#        And User click Login button
#        Then User in on page <page>
#        Examples:
#            | username                  | password | page  |
#            | synrgy_user_5@yopmail.com | wrongpas | Login |
#            | synrgy_user_5yopmail.com  | password | Login |
#            | synrgy_user_@yopmail.com  | password | Login |
#            |                           | password | Login |
#            | synrgy_user_5yopmail.com  |          | Login |

