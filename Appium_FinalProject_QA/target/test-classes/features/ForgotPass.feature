@forgotPass

Feature: Forgot Password

    Background: Forgot Password
        Given User is on Welcome page
        When User click Penyedia kos
        And User is on Login page
        And User click Lupa Password
        And User is on Lupa Password page

    @positive-test
    Scenario Outline: Forgot password with valid credentials
        And User input Email <email> on Lupa Password form
        And User click Kirim Link Reset button
        Then User see success message
        Examples: 
            |   email           |
            |seeker111@mail.com |