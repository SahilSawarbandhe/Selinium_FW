package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Using_Independan_And_Dependant_Xpath3 {

	public static void main(String[] args) {

		// Launch the Browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Navigate to the APP
		driver.get("https://www.selenium.dev/downloads/");

		// select the Version
		WebElement version = driver
				.findElement(By.xpath("(//p)[14]/../p[@class='card-text m-0 pb-1'][1]/a[@class='card-link']"));

		// Get the Version
		System.out.println(version.getText());

		driver.quit();

	}
}