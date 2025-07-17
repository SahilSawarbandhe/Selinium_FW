package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Using_Implicit_Wait2 {

	public static void main(String[] args) {

		// launch the browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Give Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to APPP
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.linkText("Log in")).click();

		driver.findElement(By.id("Email")).sendKeys("selenium");

		driver.findElement(By.id("Password")).sendKeys("pass@123");

		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();

		driver.quit();

	}
}