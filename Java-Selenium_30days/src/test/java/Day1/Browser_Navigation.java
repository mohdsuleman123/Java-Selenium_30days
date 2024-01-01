package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Navigation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		
		driver.navigate().to("https://github.com/");      //Navigate to the URL	
		Thread.sleep(2000);		
		driver.navigate().to("https://postman.com/");     //Navigate to the URL		
		driver.navigate().back();                         //Navigate to the backward page	
		driver.navigate().forward();                      //Navigate to the forward page		
		driver.navigate().refresh();	                  //Refresh the current page	
		driver.quit();
	}
}
