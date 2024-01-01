package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_Chrome {

	public static void main(String[] args) throws InterruptedException {

		// First way
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://katalon.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();

		// second way
		WebDriver driver1 = WebDriverManager.chromedriver().create();
		driver1.get("https://postman.com/");
		driver1.manage().window().maximize();
		Thread.sleep(2000);
		driver1.quit();

		// 3rd way
		System.setProperty("WebDriver.chrome.driver", "./Java-Selenium_30days/drivers/chrome.exe");
		WebDriver driver3 = new ChromeDriver();
		driver3.get("https://github.com/");
		driver3.manage().window().maximize();
		driver3.quit();

	}
}
