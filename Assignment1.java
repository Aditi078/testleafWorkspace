// Assignment:1
// FaceBook:
//================================
// Step 1: Download and set the path 
// Step 2: Launch the chromebrowser
// Step 3: Load the URL https://en-gb.facebook.com/
// Step 4: Maximise the window
// Step 5: Add implicit wait
// Step 6: Click on Create New Account button
// Step 7: Enter the first name
// Step 8: Enter the last name
// Step 9: Enter the mobile number
// Step 10: Enterthe password
// Step 11: Handle all the three drop downs
// Step 12: Select the radio button "Female" ( A normal click will do for this step) 

package week2.day2assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Aditi");
		driver.findElement(By.name("lastname")).sendKeys("Ghosh");
		driver.findElement(By.name("reg_email__")).sendKeys("aditighosh078@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("aditighosh078@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("test@123");
		WebElement dd1 = driver.findElement(By.id("day"));
		Select dropdown1 = new Select(dd1);
		dropdown1.selectByIndex(16);
		WebElement dd2 = driver.findElement(By.id("month"));
		Select dropdown2 = new Select(dd2);
		dropdown2.selectByIndex(1);
		WebElement dd3 = driver.findElement(By.id("year"));
		Select dropdown3 = new Select(dd3);
		dropdown3.selectByIndex(26);
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		WebElement dd4 = driver.findElement(By.name("preferred_pronoun"));
		Select dropdown4 = new Select(dd4);
		dropdown4.selectByIndex(1);
		driver.findElement(By.name("custom_gender")).sendKeys("I don't prefer to say");
		driver.findElement(By.name("websubmit")).click();
	}

}
