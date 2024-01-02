package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automate_RadioButton {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://materializecss.com/radio-buttons.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement redRadiobutton = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		WebElement brownRadiobutton = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		
	    Actions act=new Actions(driver);
	    
	    act.click(redRadiobutton).build().perform();
	    act.click(brownRadiobutton).build().perform();
		
	    //Verifing red radio button is selected or not
		if(redRadiobutton.isSelected())
		{
			System.out.println("Radio button is selected");
		}
		else
		{
			System.out.println("Radio button is not selected");
		}
		
		driver.quit();
				                           
	}

}
