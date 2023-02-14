@ForgotPassword

Feature: Forgot Password

    Background: Forgot password
        Given User is on Welcome page
        When User click Pencari kos
        And User is on Login page
        And User click Lupa Password
        And User is on Lupa Password page

    Scenario Outline: Forgot password with valid email
        And User input Email <email> on form
        And User click Kirim Link Reset button
        Then User see success message
        Examples:
          | email             |
          | "seeker@mail.com" |
