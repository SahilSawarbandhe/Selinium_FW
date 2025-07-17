package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class Using_Class_Locator {

	public static void main(String[] args) throws InterruptedException {

		// launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// navigate to the APP
		driver.get("https://www.facebook.com/");

		// Identify the un tf and pass the text
		driver.findElement(By.className("_55r1")).sendKeys("haiii");

		// Identify the Pass rf and pass the input
		driver.findElement(By.className("_9npi")).sendKeys("passs123");

		// Identify the login button and click on it
		driver.findElement(By.className("_42ft")).click();

		Thread.sleep(3000);

		driver.quit();

	}

}
