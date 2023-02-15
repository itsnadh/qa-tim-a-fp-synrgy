@logout

Feature: Logout

    Scenario Outline: Logout
        Given User is on Welcome page
        When User click Pencari kos
        And User is on Login page
        And User input Email <email>
        And User input Password <password>
        And User click Login button
        And User is on Home page
        And User click Profile menu
        And User is on Profile menu
        And User click Log Out button
        Then User is on Welcome page
    Examples:
        | email             | password   |
        | "seeker@mail.com" | "password" |