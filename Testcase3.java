package week2.day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase3 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/");

		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoCSR");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aditi");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ghosh");

		WebElement dd1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown1 = new Select(dd1);
		dropdown1.selectByValue("LEAD_EMPLOYEE");

		WebElement dd2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropdown2 = new Select(dd2);
		dropdown2.selectByValue("DEMO_MKTG_CAMP");

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Payel");

		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Ghosh");

		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Ms.");

		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Demo Title");

		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Testing");

		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("100");

		WebElement dd3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dropdown3 = new Select(dd3);
		dropdown3.selectByValue("INR");

		WebElement dd4 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdown4 = new Select(dd4);
		dropdown4.selectByValue("IND_SOFTWARE");

		WebElement dd5 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropdown5 = new Select(dd5);
		dropdown5.selectByValue("OWN_CCORP");

		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("150");

		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1267");

		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Ticker Symbol");

		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description");

		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Important Note");

		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");

		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("033");

		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+91");

		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aditighosh078@gmail.com");

		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9163547539");

		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Aditi");

		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://facebook.com/aditighosh078");

		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Aditi Ghosh");

		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Asim Ghosh");

		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("AA-IC");

		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Newtown");

		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Kolkata");

		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("700156");

		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("700");

		WebElement dd7 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dropdown7 = new Select(dd7);
		dropdown7.selectByValue("IND");

		WebElement dd6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown6 = new Select(dd6);
		dropdown6.selectByValue("IN-WB");

		driver.findElement(By.name("submitButton")).click();

		String title = driver.getTitle();
		System.out.println(title);

		String name = driver.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println(name);
	}

}
