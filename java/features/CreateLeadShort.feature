Feature: Leaftaps Create Lead functionality 

Scenario Outline: TC001 Create Lead to application - Positive 

	When Click on Leads link 
	Then Click create lead 
	Then Enter your company name <companyName> 
	Then Enter your first name <firstName> 
	Then Enter your last name <lastName> 
	Then Click on the Submit button 
	
	Examples: 
		|companyName|firstName|lastName|
		|'TestLeaf'|'Aditi'|'Ghosh'|