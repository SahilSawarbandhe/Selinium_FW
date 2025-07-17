package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExA {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Navigate to the APP
		driver.get("https://www.amazon.in/");

		// Identify the Search bar and add text
		driver.findElement(By.name("field-keywords")).sendKeys("OnePlus Nord ce4 5G");

		// Identify search button and click on it
		driver.findElement(By.id("nav-search-submit-button")).click();

//		driver.findElement(By.className("a-size-medium")).click();

		Thread.sleep(3000);

		driver.quit();

	}
}