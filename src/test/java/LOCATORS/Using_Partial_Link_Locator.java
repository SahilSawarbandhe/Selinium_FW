package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Partial_Link_Locator {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Navigate to the APP
		driver.get("https://www.facebook.com/");

		// Identify the link and click on it
		driver.findElement(By.partialLinkText("Create new account")).click();

		Thread.sleep(3000);

		driver.quit();

	}
}