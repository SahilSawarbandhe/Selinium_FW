package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class using_XpathByOperators {

	public static void main(String[] args) {

		// Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Navigate to the APP
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//input[@type=\"text\" and @name=\"email\"] ")).sendKeys("selenioum");

		driver.findElement(
				By.xpath("//input[contains(@class,'inputtext _55r1 _6luy _9npi') or @aria-label='Password' ]"))
				.sendKeys("pass@123");

		driver.findElement(By.xpath("//button[@value='1' and text()='Log in']")).click();

		driver.quit();

	}
}