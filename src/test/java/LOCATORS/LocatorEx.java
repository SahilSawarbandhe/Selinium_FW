package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorEx {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Navigate to the URL
		driver.get("https://www.flipkart.com/");

		// Identify the search bar and add text
		driver.findElement(By.name("q")).sendKeys("mobiles"+Keys.ENTER);
		
//		driver.findElement(By.className("Pke_EE")).sendKeys("asus tuf a15"+Keys.ENTER);
		
		driver.findElement(By.className("KzDlHZ")).click();

		Thread.sleep(3000);

		driver.quit();

	}
}