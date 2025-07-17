package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Link_Text_Locator {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Navigate to the App
		driver.get("https://www.facebook.com/");

		// Identify the forget password link and click on it
		driver.findElement(By.linkText("Create a Page")).click();

		Thread.sleep(3000);

		driver.quit();

	}
}