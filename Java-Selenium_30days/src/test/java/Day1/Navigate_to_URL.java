package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate_to_URL {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//first way
		driver.get("https://katalon.com/");
				
		//second way
		driver.navigate().to("https://postman.com/");
			
		Thread.sleep(2000);
		driver.quit();
	}
}
