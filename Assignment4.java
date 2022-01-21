package week4.day1assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leafground.com/pages/frame.html");
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		WebElement click = driver.findElement(By.id("Click"));
		File source = click.getScreenshotAs(OutputType.FILE);
		File destination = new File("./images/click.png");
		FileUtils.copyFile(source, destination);
		driver.switchTo().defaultContent();
		List<WebElement> iframeList = driver.findElements(By.tagName("iframe"));
		System.out.println("The count of the frames visible to the main page :" + iframeList.size());

	}

}
