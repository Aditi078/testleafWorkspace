package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CreateLead extends BaseClass {

	@Given("Click Leads link")
	public void clickLead() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@Given("Click on create lead")
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@Given("Enter company name {string}")
	public void enterCompanyNameTier5(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	}

	@Given("Enter first name {string}")
	public void firstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	}

	@Given("Enter last name {string}")
	public void lastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}

	@Given("Select Source from Drop Down {string}")
	public void selectSource(String dSId) {
		WebElement dd1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown1 = new Select(dd1);
		dropdown1.selectByValue(dSId);
	}

	@Given("Select Marketing from DropDown {string}")
	public void selectMarketing(String mCId) {
		WebElement dd2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropdown2 = new Select(dd2);
		dropdown2.selectByValue(mCId);
	}

	@Given("Enter first name local {string}")
	public void firstNameLocal(String fnl) {
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(fnl);
	}

	@Given("Enter last name local {string}")
	public void lastNameLocal(String lnl) {
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys(lnl);
	}

	@Given("Enter Personal title {string}")
	public void personalTitle(String pt) {
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys(pt);
	}

	@Given("General Profile Title {string}")
	public void generalProfTitle(String gpt) {
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(gpt);
	}

	@Given("Enter Department Name {string}")
	public void departmentName(String dn) {
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(dn);
	}

	@Given("Enter Annual Revenue {string}")
	public void annualRevenue(String ar) {
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys(ar);
	}

	@Given("Enter Currency Uom Id {string}")
	public void currencyUomId(String cui) {
		WebElement dd3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dropdown3 = new Select(dd3);
		dropdown3.selectByValue(cui);
	}

	@Given("Enter Industry Enum Id {string}")
	public void industryEnumId(String iei) {
		WebElement dd4 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdown4 = new Select(dd4);
		dropdown4.selectByValue(iei);
	}

	@Given("Ownership Enum Id {string}")
	public void ownershipEnumId(String oei) {
		WebElement dd5 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropdown5 = new Select(dd5);
		dropdown5.selectByValue(oei);
	}

	@Given("Number Employees {string}")
	public void numberEmployees(String ne) {
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys(ne);
	}

	@Given("SIC Code {string}")
	public void sicCode(String sc) {
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys(sc);
	}

	@Given("Ticker Symbol {string}")
	public void tickerSymbol(String ts) {
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys(ts);
	}

	@Given("Description {string}")
	public void description(String des) {
		driver.findElement(By.id("createLeadForm_description")).sendKeys(des);
	}

	@Given("Important Note {string}")
	public void importantNote(String in) {
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys(in);
	}

	@Given("Primary Phone Country Code {string}")
	public void primaryPhoneCountryCode(String ppcc) {
		WebElement priPhCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		priPhCode.clear();
		priPhCode.sendKeys(ppcc);
	}

	@Given("Primary Phone Area Code {string}")
	public void primaryPhoneAreaCode(String ppac) {
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys(ppac);
	}

	@Given("Primary Phone Extension {string}")
	public void primaryPhoneExtension(String ppe) {
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys(ppe);
	}

	@Given("Primary Email {string}")
	public void primaryEmail(String pe) {
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(pe);

	}

	@Given("Primary Phone Number {string}")
	public void primaryPhoneNumber(String ppn) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(ppn);
	}

	@Given("Primary Phone Ask For Name {string}")
	public void primaryPhoneAskForName(String ppan) {
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys(ppan);
	}

	@Given("Primary Web Url {string}")
	public void primaryWebUrl(String pw) {
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys(pw);
	}

	@Given("General To Name {string}")
	public void generalToName(String gtn) {
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys(gtn);
	}

	@Given("Enter General Attn Name {string}")
	public void generalAttnName(String gan) {
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys(gan);
	}

	@Given("Enter General Address 1 {string}")
	public void generalAddress1(String ga1) {
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys(ga1);
	}

	@Given("Enter General Address 2 {string}")
	public void generalAddress2(String ga2) {
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys(ga2);
	}

	@Given("Enter General City {string}")
	public void generalCity(String gc) {
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys(gc);
	}

	@Given("Enter General Postal Code {string}")
	public void generalPostalCode(String gpc) {
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys(gpc);
	}

	@Given("Enter General Postal Code Extension {string}")
	public void generalPostalCodeExt(String gpce) {
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys(gpce);
	}

	@Given("Enter General Country Geo Id {string}")
	public void generalCountryGeoId(String gcg) {
		WebElement dd7 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dropdown7 = new Select(dd7);
		dropdown7.selectByValue(gcg);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Given("Enter General State Province Geo Id {string}")
	public void generalStateProvinceGeoId(String gspg) {
		WebElement dd6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown6 = new Select(dd6);
		dropdown6.selectByValue(gspg);
	}

	@Given("Click Submit button")
	public void clickSubmit() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("Varify Title")
	public void varifyTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Then("Varify First Name")
	public void varifyFirstName() {
		String name = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(name);

	}

}
