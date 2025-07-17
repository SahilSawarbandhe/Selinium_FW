package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Using_Explicit_Wait {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browser

		WebDriver driver = new EdgeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Navigate to APP
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");

		// Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Check the Title is loaded
		wait.until(ExpectedConditions.titleContains("DemoApps | Qspiders | Text Box"));

		// Identify the name TF
		WebElement nameTF = driver.findElement(By.id("name"));

		/// Check the name TF is visible or not.
		wait.until(ExpectedConditions.visibilityOf(nameTF));

		// Sendkeys if Visible
		nameTF.sendKeys("selenium");

		// Identify email tF and add text
		driver.findElement(By.id("email")).sendKeys("abc@123");

		// Identify password tf and add text
		driver.findElement(By.id("password")).sendKeys("pass@123");

		// Check whether the register button is clickable or not
		WebElement reg = driver.findElement(By.xpath("//button[text()='Register']"));

		wait.until(ExpectedConditions.elementToBeClickable(reg));

		Thread.sleep(3000);

		driver.quit();

	}
}