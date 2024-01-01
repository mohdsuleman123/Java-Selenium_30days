package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automate_Textfields {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		//first way to Set text
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Mohammed");
		Thread.sleep(2000);

		//2nd way to set text
		JavascriptExecutor j = (JavascriptExecutor)driver;
	    j.executeScript ("document.getElementById('lastName').value='Suleman'");
			
		// Clear text
		driver.findElement(By.xpath("//input[@id='firstName']")).clear();
		Thread.sleep(2000);
		
		//Set text in both enabled and disabled text field
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript ("document.getElementById('firstName').value='abcde'"); 
	    
	    //clears text from both enabled and disabled text field
	    JavascriptExecutor js1 = (JavascriptExecutor)driver;
	    js1.executeScript ("document.getElementById('firstName').value=''");  
	    Thread.sleep(3000);

		//Verify that text field is enabled/displayed
		WebElement element = driver.findElement(By.xpath("//input[@id='firstName']"));				
		System.out.println(element.isEnabled());
		System.out.println(element.isDisplayed());
		System.out.println(element.isSelected());       //Mainly used for checkbox or radio buttons
		Thread.sleep(2000);
					
		driver.quit();
	}

}
