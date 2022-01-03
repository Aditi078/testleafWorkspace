package week2.day2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {

//			http://leaftaps.com/opentaps/control/main

//			1 Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
//			2 Enter the username
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
//			3 Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
//			4 Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
//			5 Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
//			6 Click Leads link
		driver.findElement(By.linkText("Leads")).click();
//			7 Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
//			8 Enter first name
		driver.findElement(By.xpath("//div[@class='x-form-item x-tab-item']//input[@name='firstName']")).sendKeys("Aditi");
//			9 Click Find leads button
		driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//			10 Click on first resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		String companyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(companyName);
//			11 Verify title of the page
		if (driver.getTitle().contains("View Lead")) {
			System.out.println("The title contains View Lead");
		} else {
			System.out.println("The title does not contain View Lead");
		}
//			12 Click Edit
        driver.findElement(By.linkText("Edit")).click();
//			13 Change the company name
        driver.findElement(By.id("updateLeadForm_companyName")).clear();
        driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Tier5");
//			14 Click Update
        driver.findElement(By.xpath("//input[@value='Update']")).click();
//			15 Confirm the changed name appears
        String changedCompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
        System.out.println(changedCompanyName);
        if(companyName.equals(changedCompanyName)) {
        	System.out.println("Company Name did not get changed");
        }else {
        	System.out.println("Company Name changed. Previously it was "+companyName+", now it is "+changedCompanyName);
        }
//			16 Close the browser (Do not log out)
        driver.close();
	}

}