
Feature: Need to develop HelloWorld Java application.

	Scenario: The application should greet the user.
	
		Given there is  a hello object
		When I invoke the sayHello method 
		Then I expect "Hello World!" as the response