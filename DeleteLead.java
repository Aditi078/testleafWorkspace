package week2.day2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	public static void main(String[] args) {
//	http://leaftaps.com/opentaps/control/main

//	Delete Lead:

//	1	Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
//	2	Enter the username
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
//	3	Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
//	4	Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
//	5	Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
//	6	Click Leads link
		driver.findElement(By.linkText("Leads")).click();
//	7	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
//	8	Click on Phone
		driver.findElement(By.linkText("Phone")).click();
//	9	Enter phone number
		// driver.findElement(By.name("phoneCountryCode")).sendKeys("1");
		driver.findElement(By.name("phoneAreaCode")).sendKeys("91");
		driver.findElement(By.name("phoneNumber")).sendKeys("6354753");
//	10	Click find leads button
		driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//	11	Capture lead ID of First Resulting lead
		WebElement leadID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		String leadIDText = leadID.getText();
		// System.out.println(leadIDText);		
//	12	Click First Resulting lead
		leadID.click();
//	13	Click Delete
		driver.findElement(By.className("subMenuButtonDangerous")).click();
//	14	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
//	15	Enter captured lead ID
		driver.findElement(By.name("id")).sendKeys(leadIDText);
//	16	Click find leads button
		driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
//	17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		if (driver.findElement(By.className("x-paging-info")).isDisplayed()) {
			System.out.println("No records to display is getting printed");
		} else {
			System.out.println("There are records to display");
		}
//	18	Close the browser (Do not log out)
		driver.close();
	}
}
