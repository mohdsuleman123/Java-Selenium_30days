package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Page_Data {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://katalon.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		System.out.println(driver.getCurrentUrl());		 //Get the current URL of the page
		System.out.println(driver.getTitle());		      //Get the title of the page
		System.out.println(driver.getPageSource());      //Get the page source of the page
			
		driver.quit();

	}

}
