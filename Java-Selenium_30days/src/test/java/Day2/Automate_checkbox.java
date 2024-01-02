package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automate_checkbox {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//Capturing webelements
		WebElement redcheckBox = driver.findElement(By.xpath("//input[@value='red']"));
		WebElement bluecheckBox = driver.findElement(By.xpath("//input[@value='blue']"));
		WebElement greencheckBox = driver.findElement(By.xpath("//input[@value='green']"));
		
		//Performing click actions
		redcheckBox.click();
		Thread.sleep(1000);
		bluecheckBox.click();
		Thread.sleep(1000);
		greencheckBox.click();
		Thread.sleep(1000);
		
		//Verifying check is selected or not
		if(bluecheckBox.isSelected())
		{
			System.out.println("check box selected");
		}
		else
		{
			System.out.println("Check box is not selected");
		}
		
		
		driver.quit();
		
	}

}
