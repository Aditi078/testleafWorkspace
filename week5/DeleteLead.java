package week5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DeleteLead extends BaseClass {

	@Test(description = "This is test case 5", dependsOnMethods = "EditLead", priority = 4, enabled = false)
	public void deleteLead() {

//	6	Click Leads link
		driver.findElement(By.linkText("Leads")).click();
//	7	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
//	8	Click on Phone
		driver.findElement(By.linkText("Phone")).click();
//	9	Enter phone number
		driver.findElement(By.name("phoneCountryCode")).clear();
		driver.findElement(By.name("phoneNumber")).sendKeys("6354753");
//	10	Click find leads button
		driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//	11	Capture lead ID of First Resulting lead
		WebElement leadID = driver
				.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		String leadIDText = leadID.getText();
		System.out.println("leadIDText: " + leadIDText);
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
	}
}
