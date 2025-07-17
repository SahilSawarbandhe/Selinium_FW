package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Using_Implicit_Wait3 {

	public static void main(String[] args) {

		/// launch the Browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Give Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to APP
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");

		// identify the name TF
		driver.findElement(By.id("name")).sendKeys("selenium");

		// Identify the Email TF
		driver.findElement(By.id("email")).sendKeys("selenium@123");

		// Identify the Password TF
		driver.findElement(By.id("password")).sendKeys("pass@123");

		// Identify the Register button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		driver.quit();
		
	}
}