package week4.day2assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NykaaAssignment2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.nykaa.com/");
		Actions builder = new Actions(driver);
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		builder.moveToElement(brands).perform();
		driver.findElement(By.xpath("//img[contains(@src,'lorealparis')]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("L'Oreal Paris")) {
			System.out.println("Title contains L'Oreal Paris");
		} else {
			System.out.println("Title does not contain L'Oreal Paris");
		}
		driver.findElement(By.xpath("//span[contains(text(),'Sort By')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'top rated')]/following::div[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Category')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Hair')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Hair Care')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Shampoo')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Concern')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Color Protection')]/following::div[1]")).click();
		String shampoo = driver
				.findElement(By.xpath("//span[contains(text(),'Filters Applied')]/following::span[text()='Shampoo']"))
				.getText();
		if (shampoo.contains("Shampoo")) {
			System.out.println("Filter is applied with Shampoo");
		} else {
			System.out.println("Filter is not applied with Shampoo");
		}
		driver.findElement(By.xpath("(//div[text()=\"L'Oreal Paris Colour Protect Shampoo\"])[1]")).click();
		Set<String> winSet = driver.getWindowHandles();
		List<String> winList = new ArrayList<String>(winSet);
		driver.switchTo().window(winList.get(1));
		driver.findElement(By.xpath("//span[contains(text(),'704ml')]")).click();
		String mrp = driver.findElement(By.xpath("//span[contains(text(),'MRP:')]/following::span[1]")).getText();
		System.out.println("MRP of the product: " + mrp);
		driver.findElement(By.xpath("(//span[text()=\"ADD TO BAG\"])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Account')]/following::span[1]")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		String gt1 = driver.findElement(By.xpath("//div[@class='first-col']/div")).getText();
		String replaceAll = gt1.replaceAll("\\D", "");
		int grandTotal = Integer.parseInt(replaceAll);
		System.out.println("Grand Total amount: " + grandTotal);
		driver.findElement(By.xpath("//span[contains(text(),'PROCEED')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'GUEST')]")).click();
		String gt2 = driver.findElement(By.xpath("//div[contains(text(),'Grand Total')]/following::div[1]")).getText();
		String replaceAll2 = gt2.replaceAll("\\D", "");
		int grandTotal2 = Integer.parseInt(replaceAll2);
		if (grandTotal == grandTotal2) {
			System.out.println("Both Grand total are Same");
		} else {
			System.out.println("Both Grand total are not Same");
		}
		driver.quit();
	}

}
