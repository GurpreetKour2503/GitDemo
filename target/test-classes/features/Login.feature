Feature: Application Login


Scenario Outline: Home page default login
Given User landed to NetBanking Application
When User login to the appliaction using useridt <username> and password <password>
Then Home page is displayed
And Payement cards displayed "true"

Examples:
|username |password |
|john     |1234     |
|Bob      |12436    |
