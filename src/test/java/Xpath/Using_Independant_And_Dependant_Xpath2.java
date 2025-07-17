package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Using_Independant_And_Dependant_Xpath2 {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Navigate to the AAP
		driver.get("https://www.amazon.in/");

		// Identify the Search bar and add text
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles" + Keys.ENTER);

		// Select a mobile

		// Get the Price
//		System.out.println(price.getText());

		Thread.sleep(3000);

	}
}