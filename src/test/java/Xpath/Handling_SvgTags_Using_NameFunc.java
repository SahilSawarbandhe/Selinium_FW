package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Handling_SvgTags_Using_NameFunc {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Navigate to an APP
		driver.get("https://www.flipkart.com/");

		// Identify the Search text field
		driver.findElement(By.name("q")).sendKeys("mobiles");

		// Click on search button
		driver.findElement(By.xpath("//*[name()='svg'][@width='24']")).click();

		Thread.sleep(3000);

		driver.quit();

	}
}