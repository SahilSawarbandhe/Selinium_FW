package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.implementation.bytecode.ShiftLeft;

public class Using_KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to an APP
		driver.get("https://www.flipkart.com/");

		// Identify the Search TF
		WebElement s = driver.findElement(By.name("q"));

		Actions act = new Actions(driver);

		act.moveToElement(s).click(s).keyDown(Keys.SHIFT).sendKeys("mobiles").keyUp(Keys.SHIFT).build().perform();

		Thread.sleep(3000);

		act.keyDown(Keys.ENTER).keyUp(Keys.SHIFT).perform();

		Thread.sleep(3000);

		driver.quit();

	}
}