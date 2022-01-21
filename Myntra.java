package week4.day2assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.myntra.com/");
		Actions builder = new Actions(driver);
		WebElement men = driver.findElement(By.xpath("(//a[text()=\"Men\"])[1]"));
		WebElement jackets = driver.findElement(By.xpath("(//a[text()=\"Jackets\"])[1]"));
		builder.moveToElement(men).pause(2000).click(jackets).perform();
		String jacketsCount = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		System.out.println("Total number of jackets: " + jacketsCount);

//		int categoriesSizes = driver.findElements(By.xpath("//span[@class='categories-num']")).size();
//		List<String> categories = new ArrayList<String>(categoriesSizes);
//		for (int i = 1; i <= categoriesSizes; i++) {
//			String categorie = driver.findElement(By.xpath("//span[@class='categories-num']")).getTagName();
//			categories.add(categorie);
//			System.out.println("categories: " + categories);
//		}

		driver.findElement(By.xpath("(//span[@class='categories-num'])[1]")).click();
		driver.findElement(By.className("brand-more")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='FilterDirectory-titleBar']/input")).sendKeys("Duke");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='FilterDirectory-count']/following-sibling::div)[1]")).click();
		driver.findElement(By.xpath("//ul[@class='FilterDirectory-indices']/following-sibling::span")).click();
		
	}

}
