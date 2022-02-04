package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EditLead extends BaseClass {
	private String companyName;

	@Given("Click on Leads Text")
	public void leadsText() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@Given("Click on Find Leads text")
	public void findLeadsText() {
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@Given("Enter first name here {string}")
	public void enterFirstNamne(String fName) {
		driver.findElement(By.xpath("//div[@class='x-form-item x-tab-item']//input[@name='firstName']"))
				.sendKeys(fName);
	}

	@Given("Click on first name find leads button")
	public void firstNameFind() {
		driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Given("Click on the first find leads name")
	public void clickFirstName() {
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
	}

	@Then("Print resulting company name inside console")
	public void resultingCompanyName() {
		String companyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(companyName);
		this.companyName = companyName;
		if (driver.getTitle().contains("View Lead")) {
			System.out.println("The title contains View Lead");
		} else {
			System.out.println("The title does not contain View Lead");
		}
	}

	@Then("click on Edit Lead")
	public void clickOnEditLead() {
		driver.findElement(By.linkText("Edit")).click();
	}

	@Then("Editing company name {string}")
	public void editingCompanyName(String cName) {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cName);
	}

	@Then("click on Update Lead")
	public void clickOnUpdateLead() {
		driver.findElement(By.xpath("//input[@value='Update']")).click();
	}

	@Then("Print last company name and current company name")
	public void varifyCompanyNameChanged() {
		String changedCompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(changedCompanyName);
		if (companyName.equals(changedCompanyName)) {
			System.out.println("Company Name did not get changed");
		} else {
			System.out.println(
					"Company Name changed. Previously it was " + companyName + ", now it is " + changedCompanyName);
		}
	}
}
