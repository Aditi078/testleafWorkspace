package week5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DuplicateLead extends BaseClass {

	@Test(description = "This is test case 4", priority = 3)
	public void duplicateLead() {

//	6	Click Leads link
		driver.findElement(By.linkText("Leads")).click();
//	7	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
//	8	Click on Email
		driver.findElement(By.linkText("Email")).click();
//	9	Enter Email
		driver.findElement(By.name("emailAddress")).sendKeys("aditighosh078@gmail.com");
//	10	Click find leads button
		driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//	11	Capture name of First Resulting lead
		WebElement leadFirstName = driver
				.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a"));
		String capturedLeadName = leadFirstName.getText();
		// System.out.println(capturedLeadName);
//	12	Click First Resulting lead
		leadFirstName.click();
//	13	Click Duplicate Lead
		driver.findElement(By.linkText("Duplicate Lead")).click();
//	14	Verify the title as 'Duplicate Lead'
		if (driver.getTitle().contains("Duplicate Lead")) {
			System.out.println("The title contains the word Duplicate Lead");
		} else {
			System.out.println("The title does not contain the word Duplicate Lead");
		}
//	15	Click Create Lead
		driver.findElement(By.name("submitButton")).click();
//	16	Confirm the duplicated lead name is same as captured name
		String duplicatedLeadName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		// System.out.println(duplicatedLeadName);
		if (capturedLeadName.equals(duplicatedLeadName)) {
			System.out.println("Duplicated lead name is same as Captured name");
		} else {
			System.out.println("Duplicated lead name is not same as Captured name");
		}

	}
}