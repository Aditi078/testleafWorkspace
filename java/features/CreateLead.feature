Feature: This is for creting all the Leads 

Scenario Outline: 
	TC002 Creating all leads with mentioned Data 

	Given Click Leads link 
	And Click on create lead 
	And Enter company name <cName> 
	And Enter first name <fName> 
	And Enter last name <lName> 
	And Select Source from Drop Down <dSId> 
	And Select Marketing from DropDown <mCId> 
	And Enter first name local <fnl> 
	And Enter last name local <lnl> 
	And Enter Personal title <pt> 
	And General Profile Title <gpt> 
	And Enter Department Name <dn> 
	And Enter Annual Revenue <ar> 
	And Enter Currency Uom Id <cui> 
	And Enter Industry Enum Id <iei> 
	And Ownership Enum Id <oei> 
	And Number Employees <ne> 
	And SIC Code <sc> 
	And Ticker Symbol <ts> 
	And Description <description> 
	And Important Note <in> 
	And Primary Phone Country Code <ppcc> 
	And Primary Phone Area Code <ppac> 
	And Primary Phone Extension <ppe> 
	And Primary Email <pe> 
	And Primary Phone Number <ppn> 
	And Primary Phone Ask For Name <ppan> 
	And Primary Web Url <pw> 
	And General To Name <gtn> 
	And Enter General Attn Name <gan> 
	And Enter General Address 1 <ga1> 
	And Enter General Address 2 <ga2> 
	And Enter General City <gc> 
	And Enter General Postal Code <GenPostCode> 
	And Enter General Postal Code Extension <CodeExten> 
	And Enter General Country Geo Id <CountryGeoId> 
	And Enter General State Province Geo Id <GeoId> 
	When Click Submit button 
	Then Varify Title 
	Then Varify First Name 
	
	Examples: 
		|cName|fName|lName|dSId|mCId|fnl|lnl|pt|gpt|dn|ar|cui|iei|oei|ne|sc|ts|description|in|ppcc|ppac|ppe|pe|ppn|ppan|pw|gtn|gan|ga1|ga2|gc|GenPostCode|CodeExten|CountryGeoId|GeoId|
		|'Tier5'|'Aditi'|'Ghosh'|'LEAD_EMPLOYEE'|'DEMO_MKTG_CAMP'|'Aditi'|'Ghosh'|'Ms.'|'Demo Title'|'Software Testing'|'100'|'INR'|'IND_SOFTWARE'|'OWN_CCORP'|'150'|'1267'|'Ticker Symbol'|'Description'|'Important Note'|'91'|'91'|'91635'|'aditighosh078@gmail.com'|'63547539'|'Aditi'|'https://facebook.com/aditighosh078'|'Aditi Ghosh'|'Asim Ghosh'|'AA-IC'|'Newtown'|'Kolkata'|'700156'|'700'|'IND'|'IN-WB'|
		
	