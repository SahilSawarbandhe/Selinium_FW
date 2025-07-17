package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PractiseSync {

	public static void main(String[] args) throws InterruptedException {

//launch the browser
		WebDriver driver = new ChromeDriver();

		// maximize the window'
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://shoppersstack.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//		wait.until(ExpectedConditions.titleContains("ShoppersStack"));

//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn")));

		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));

		Thread.sleep(3000);

		driver.quit();

	}
}