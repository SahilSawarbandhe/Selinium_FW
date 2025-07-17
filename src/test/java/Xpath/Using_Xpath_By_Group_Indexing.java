package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Using_Xpath_By_Group_Indexing {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Navigate to the URl
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");

		Thread.sleep(5000);

		// Identify the name text field
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("selenium");

		// Identify the email text field
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("enami@123");

		// Identify the password text field
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("password");

		// Identify the Register button
		driver.findElement(By.xpath("(//button)[2]")).click();

		Thread.sleep(3000);

		driver.quit();

	}
}