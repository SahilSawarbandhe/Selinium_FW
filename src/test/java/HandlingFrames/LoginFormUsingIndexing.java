package HandlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFormUsingIndexing {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to APP
		driver.get("https://the-internet.herokuapp.com/iframe");

		driver.switchTo().frame(0);
		
//		driver.switchTo().frame("//iframe[@title='Rich Text Area']");

		String tx = driver.findElement(By.tagName("p")).getText();

		System.out.println(tx);

		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//span[text()='Paragraph']")).click();

		Thread.sleep(3000);

		driver.quit();
	}
}