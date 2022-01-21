package week4.day2assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapdealAssignment {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.snapdeal.com/");
		Actions builder = new Actions(driver);
		WebElement men = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		WebElement sportShoes = driver.findElement(By.xpath("(//span[text()=\"Sports Shoes\"])[1]"));
		builder.moveToElement(men).pause(2000).click(sportShoes).perform();
		String shoeCount = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("Total shorts shoes count: " + shoeCount);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("//div[@class=\"sorting-sec animBounce\"]//li[@data-index=\"1\"]")).click();
		Thread.sleep(1000);
		String sortSelected = driver.findElement(By.xpath("//div[@class='sort-selected']")).getText();
		if (sortSelected.contains("Price Low To High")) {
			System.out.println("Displayed items are sorted correctly");
		} else {
			System.out.println("Displayed items are not sorted correctly");
		}
		WebElement fromPrice = driver.findElement(By.xpath("//input[@name=\"fromVal\"]"));
		fromPrice.clear();
		fromPrice.sendKeys("900");
		WebElement toPrice = driver.findElement(By.xpath("//input[@name=\"toVal\"]"));
		toPrice.clear();
		toPrice.sendKeys("1200");
		driver.findElement(By.xpath("//div[@class=\"price-input\"][2]/following-sibling::div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[text()='View More '])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='checkbox']/following-sibling::label[@for='Color_s-Navy']")).click();
		WebElement firstShoe = driver.findElement(By.xpath("//div[@class='product-tuple-image ']"));
		Thread.sleep(2000);
		try {
			builder.moveToElement(firstShoe).pause(2000).perform();
		} catch (StaleElementReferenceException e) {
			firstShoe = driver.findElement(By.xpath("//div[@class='product-tuple-image ']"));
			builder.moveToElement(firstShoe).pause(2000).perform();
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();

		String price = driver.findElement(By.xpath("//span[@class=\"payBlkBig\"]")).getText();
		System.out.println("Shoe price is Rs: " + price);
		String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("Shoe discount % is: " + discount);
		WebElement shoeImage = driver.findElement(By.xpath("//img[@style='user-select: none;']"));
		File source = shoeImage.getScreenshotAs(OutputType.FILE);
		File destination = new File("./images/shoeImage.png");
		FileUtils.copyFile(source, destination);
		Thread.sleep(5000);
		driver.close();
	}

}
