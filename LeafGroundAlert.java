package week4.day1assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Thread.sleep(1000);
		alert.accept();
		// alert.dismiss();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		alert.sendKeys("Aditi Ghosh");
		Thread.sleep(1000);
		alert.accept();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		Thread.sleep(1000);
		alert.accept();
		driver.findElement(By.id("btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='swal-button-container']/button")).click();

	}

}
