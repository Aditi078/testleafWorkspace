Feature: Leaftaps Delete Lead functionality 

Scenario Outline: TC003 Delete Lead to application - Positive 

	When Click on Leads Text 
	Then Click on Find Leads text 
	Then Enter first name here <First Name> 
	Then Click on first name find leads button 
	Then Click on the first find leads name 
	Then Print resulting company name inside console 
	Then click on Edit Lead 
	Then Editing company name <Company Name> 
	Then click on Update Lead 
	Then Print last company name and current company name 
	
	Examples: 
		|First Name|Company Name|
		|'Aditi'|'La Martinier'|