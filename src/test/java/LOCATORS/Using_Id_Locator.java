package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Id_Locator {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Navigate to the Url
		driver.get("https://www.facebook.com/");

		// Identify the UN Text Field and pass the text
		driver.findElement(By.id("email")).sendKeys("Selenium");

		// Identify the pass text Field and pass the text
		driver.findElement(By.id("pass")).sendKeys("pass@123");
		// We should not consider the alphanumeric value

		Thread.sleep(3000);

		driver.quit();

	}
}