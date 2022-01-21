package week4.day2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
		Actions builder = new Actions(driver);
		WebElement resizeEle = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		builder.dragAndDropBy(resizeEle, 300, 0).perform();
		Thread.sleep(5000);
		System.out.println("Element resized");
		driver.quit();

	}

}
