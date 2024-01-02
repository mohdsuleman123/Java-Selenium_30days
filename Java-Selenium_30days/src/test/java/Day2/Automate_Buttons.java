package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automate_Buttons {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//Capturing elements
		WebElement clickMe= driver.findElement(By.xpath("(//button[contains(.,'Click Me')])[3]"));
		WebElement doubleClick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement rightClick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
	
		//performing normal click action
		clickMe.click();
		
		//To perform double click, we have to use Actions class
		Actions act=new Actions(driver);
		act.doubleClick(doubleClick).build().perform();
		Thread.sleep(2000);
		
		//performing right click action
		act.contextClick(rightClick).build().perform();
		Thread.sleep(2000);
		
		//To get the text and attribute of button
		System.out.println(doubleClick.getText());
		System.out.println(doubleClick.getAttribute("id"));
		
		driver.quit();
				
	}

}
