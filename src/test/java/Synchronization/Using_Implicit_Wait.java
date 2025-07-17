package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Using_Implicit_Wait {

	public static void main(String[] args) {

		// Launch the Browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to the APP
		driver.get("https://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys("selenium");

		driver.findElement(By.id("pass")).sendKeys("pass@123");

		driver.findElement(By.name("login")).click();

		driver.quit();

	}
}