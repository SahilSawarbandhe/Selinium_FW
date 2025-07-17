package Synchronization;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fluent_Wait_Class {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.faceboook.com");

		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);

		wait.withTimeout(Duration.ofSeconds(10));// Wait maximum 10 seconds tak karega kisi condition ke fulfill hone ka
													// intezaar karne ke liye.

		wait.pollingEvery(Duration.ofSeconds(1));// 1 second ke interval par condition check karta rahega.

		wait.ignoring(Exception.class);// Wait ke dauraan agar koi exception aata hai (like NoSuchElementException), to
										// usko ignore karega.

		WebElement un = driver.findElement(By.name("q"));

		wait.until(ExpectedConditions.visibilityOf(un));

		Thread.sleep(3000);

		driver.quit();

	}
}