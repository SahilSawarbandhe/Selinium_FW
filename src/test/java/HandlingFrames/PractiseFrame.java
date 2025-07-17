package HandlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseFrame {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// navigate to app
		driver.get("https://demo.automationtesting.in/Frames.html");

		driver.switchTo().frame("singleframe");

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");

		Thread.sleep(3000);

		driver.quit();

	}
}