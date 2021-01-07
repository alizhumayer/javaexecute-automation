Feature: LoginFeature
  # This feature deals with the login functionality of the application

  Scenario: Login with correct username and password
	 Given I navigate to the login page
	 And I enter username and password
	 Then I am in
	 When I find my sisters account
	 Then I write her a message
