package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Refresh_Page {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://katalon.com/");
		driver.manage().window().maximize();

		// first way
		driver.navigate().refresh();
		Thread.sleep(1000);

		// 2nd way
		driver.findElement(By.xpath("//html")).sendKeys(Keys.F5);
		Thread.sleep(1000);

		// 3rd way
		driver.navigate().to(driver.getCurrentUrl());
		Thread.sleep(1000);

		driver.quit();
	}

}
