package week5.day2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {

	@BeforeClass
	public void setUp() {
		fileName = "CreateLead";
	}

	@Test(dataProvider = "fetchData", priority = 0)
	public void createLead(String cName, String fName, String lName, String dSId, String mCId, String fnl, String lnl,
			String pt, String gpt, String dn, String ar, String cui, String iei, String oei, String ne, String sc,
			String ts, String des, String in, String ppcc, String ppac, String ppe, String pe, String ppn, String ppan,
			String pw, String gtn, String gan, String ga1, String ga2, String gc, String gpc, String gpce, String gcg,
			String gspg) throws InterruptedException {

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);

		WebElement dd1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown1 = new Select(dd1);
		dropdown1.selectByValue(dSId);

		WebElement dd2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropdown2 = new Select(dd2);
		dropdown2.selectByValue(mCId);

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(fnl);

		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys(lnl);

		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys(pt);

		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(gpt);

		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(dn);

		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys(ar);

		WebElement dd3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dropdown3 = new Select(dd3);
		dropdown3.selectByValue(cui);

		WebElement dd4 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdown4 = new Select(dd4);
		dropdown4.selectByValue(iei);

		WebElement dd5 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropdown5 = new Select(dd5);
		dropdown5.selectByValue(oei);

		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys(ne);

		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys(sc);

		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys(ts);

		driver.findElement(By.id("createLeadForm_description")).sendKeys(des);

		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys(in);

		WebElement priPhCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		priPhCode.clear();
		priPhCode.sendKeys(ppcc);

		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys(ppac);

		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys(ppe);

		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(pe);

		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(ppn);

		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys(ppan);

		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys(pw);

		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys(gtn);

		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys(gan);

		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys(ga1);

		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys(ga2);

		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys(gc);

		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys(gpc);

		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys(gpce);

		WebElement dd7 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dropdown7 = new Select(dd7);
		dropdown7.selectByValue(gcg);

		Thread.sleep(2000);

		WebElement dd6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown6 = new Select(dd6);
		dropdown6.selectByValue(gspg);

		driver.findElement(By.name("submitButton")).click();

		String title = driver.getTitle();
		System.out.println(title);

		String name = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(name);

	}

}
