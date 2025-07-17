package PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Practise {

	public static void main(String[] args) throws InterruptedException, AWTException {

		// launch the browser
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// navigate to application
		driver.get("https://demo.guru99.com/popup.php");

		String pwid = driver.getWindowHandle();

		driver.findElement(By.xpath("//a[text()='Click Here']")).click();

		Set<String> wids = driver.getWindowHandles();

		for (String s : wids) {
			driver.switchTo().window(s);
			if (driver.getTitle().contains(" Guru99 Bank Home Page ")) {

				WebElement e = driver.findElement(By.name("emailid"));
				e.click();

				e.sendKeys("selenium123@GMail.com");
				
				Thread.sleep(3000);

				driver.findElement(By.name("btnLogin")).click();
			}
		}

		Thread.sleep(3000);

		driver.quit();

	}
}