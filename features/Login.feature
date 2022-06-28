Feature: Login

Scenario: Successful Login With valid Credentials
	Given User Launch Chrome browser
	When User opens URL "https://kite.zerodha.com/"
	And User enters Email as "" and password as ""
	And Click on Login
	Then Page Title should be "Dashboard / nopCommerce administration"
	When User click on Log out link
	Then Page Title should be "Your store. Login"
	And close browser