package week4.day1assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(1000);
//		Integer size = driver.findElements(By.tagName("iframe")).size();
//		System.out.println(size);
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//b[@id=\"topic\"]/following-sibling::input")).sendKeys("Selenium");
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement animal = driver.findElement(By.id("animals"));
		Select dd = new Select(animal);
		dd.selectByValue("avatar");
		driver.switchTo().defaultContent();
		driver.close();
	}

}
