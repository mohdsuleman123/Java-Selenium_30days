package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Elements {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// Get all the links present in current page
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("Total count of link is "+links.size());       // print the total count of links present on page

		// For each loop will print all the links one by one
		for (WebElement getlink : links) {
			System.out.println(getlink.getText());    // getText function will get the text of each link
		}

		// Get all the element present on web page
		List<WebElement> elements = driver.findElements(By.xpath("//*"));
		System.out.println("Total count of elements is "+elements.size());        // print the total count of elements present on page

		// Get all the images present on page
		List<WebElement> images = driver.findElements(By.xpath("//img"));
		System.out.println("Total count of images is "+images.size());          // print the total count of images present on page

		// Get all the dropdowns and textfields present on page
		List<WebElement> dropdowns_textbox = driver.findElements(By.xpath("//select | //input"));
		System.out.println("Total count of dropdown & textfields are "+dropdowns_textbox.size());         // print the total count of dropdowns and textfields present on page
														
		driver.quit();
	}

}
