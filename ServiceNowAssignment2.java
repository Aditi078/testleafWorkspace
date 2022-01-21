package week4.day1assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNowAssignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dev71569.service-now.com/");
		Thread.sleep(1000);
		Integer size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		driver.switchTo().frame(0);
		WebElement userName = driver.findElement(By.id("user_name"));
		userName.clear();
		userName.sendKeys("admin");
		WebElement password = driver.findElement(By.id("user_password"));
		password.clear();
		password.sendKeys("Aditi@078");
		driver.findElement(By.id("sysverb_login")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("filter")).sendKeys("incident ");
		
	}

}
