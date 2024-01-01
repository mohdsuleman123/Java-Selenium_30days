package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_Edge {

	public static void main(String[] args) throws InterruptedException {

			//First way	
			WebDriverManager.edgedriver().setup();
			WebDriver driver=new EdgeDriver();
			driver.get("https://mvnrepository.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.quit();
						
			//second way
			WebDriver driver1=WebDriverManager.edgedriver().create();
			driver1.get("https://www.selenium.dev/");
			driver1.manage().window().maximize();
			Thread.sleep(2000);
			driver1.quit();
		}
	}

