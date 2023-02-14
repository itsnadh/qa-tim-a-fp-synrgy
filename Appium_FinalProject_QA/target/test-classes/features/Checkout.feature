@checkout

Feature: Checkout

    Scenario Outline: Checkout Kost Permata Medang
        Given User is on Welcome page
        When User click Pencari kos
        And User is on Login page
        And User input Email <email>
        And User input Password <password>
        And User click Login button
        And User is on Home page
        And User click on Kost Permata Medang
        And User is on Detail Kost page
        And User click Pilih button
        And User is on Detail Kamar page
        And User click on Pilih Tanggal button
        And User click on 28 Februari 2023
        And User click Select button
        And User click Durasi Sewa button
        And User click Monthly button
        And User click Ajukan Sewa button
        And User is on Pengajuan Sewa Kost page
        And User click Ajukan Sewa Kos Sekarang
        Then User is on Konfirmasi Pemilik Kos page
    Examples:
        | email             |  password  |
        | "seeker@mail.com" | "password" |
