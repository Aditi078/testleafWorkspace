package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CreateLeadShort extends BaseClass {

	@Given("Click on Leads link")
	public void clickLead() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@Given("Click create lead")
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@Given("Enter your company name {string}")
	public void enterCompanyNameTier5(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	}

	@Given("Enter your first name {string}")
	public void firstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	}

	@Given("Enter your last name {string}")
	public void lastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}

	@Then("Click on the Submit button")
	public void click_on_submit_button() {
		driver.findElement(By.name("submitButton")).click();
	}

}