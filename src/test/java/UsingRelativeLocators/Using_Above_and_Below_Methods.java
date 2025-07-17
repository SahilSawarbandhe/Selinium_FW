package UsingRelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Using_Above_and_Below_Methods {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Navigate to the APP
		driver.get("https://www.facebook.com/");

		// Identify psw base element
		WebElement psw = driver.findElement(By.id("pass"));

		// Identify Un text field and enter username
		WebElement un = driver.findElement(RelativeLocator.with(By.tagName("input")).above(psw));

		un.sendKeys("selenium");

		psw.sendKeys("pass@123");

		driver.findElement(RelativeLocator.with(By.tagName("button")).below(psw)).click();

		Thread.sleep(3000);
		
		driver.quit();
	
	}
}