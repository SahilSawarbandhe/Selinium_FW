package LOCATORS;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Tag_Name {

	public static void main(String[] args) {

		// Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Navigate to the APP
		driver.get("https://demowebshop.tricentis.com/");

		// Identify the links
		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement e : links) {
			System.out.println(e.getText());
		}

		driver.quit();

	}
}