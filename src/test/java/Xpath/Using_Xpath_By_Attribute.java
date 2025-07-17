package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Using_Xpath_By_Attribute {

	public static void main(String[] args) throws InterruptedException {

		// launch the Browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Navigate to the APP
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles" + Keys.ENTER);

		driver.findElement(By.xpath("//input[@class='XPD6hh']")).sendKeys("samsung");

		Thread.sleep(3000);

		driver.quit();

	}
}