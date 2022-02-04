Feature: Leaftaps Delete Lead functionality 

Scenario Outline: TC003 Delete Lead to application - Positive 

	When Click on the Leads link 
	Then Click on the Find leads 
	Then Click on the Phone 
	Then Enter the phone number <phone> 
	Then Click on the find leads button 
	Then Capture lead ID of First Resulting lead and Click First Resulting lead 
	Then Click Delete 
	Then Click on the Find leads 
	Then Enter captured lead ID 
	Then Click on the find leads button 
	Then Verify message 'No records to display' in the Lead List 
	
	Examples: 
		|phone|
		|'63547539'|