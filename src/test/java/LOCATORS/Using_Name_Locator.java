package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Name_Locator {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Navigate to the APP
		driver.get("https://www.facebook.com/");

		// Identify the UserName text field and pass the text
		driver.findElement(By.name("email")).sendKeys("Selenium");

		// Identify the password text field and pass the text
		driver.findElement(By.name("pass")).sendKeys("Password@123");

		// identify the login button and click on it
		driver.findElement(By.name("login")).click();

		Thread.sleep(3000);

		driver.quit();

	}
}