package Day1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Size {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
				
		driver.manage().window().maximize();   //Maximize the current browser window
		Thread.sleep(3000);	
		driver.manage().window().minimize();    //Minimize the current browser window
		Thread.sleep(2000);
		driver.manage().window().fullscreen();   //fullscreen the window 
		Thread.sleep(2000);
		
		//Sets the browser to the required dimension
		Dimension d=new Dimension(400, 500);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
				
	    driver.quit();

	}

}
