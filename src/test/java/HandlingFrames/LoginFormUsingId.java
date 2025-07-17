package HandlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginFormUsingId {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browser
		WebDriver driver = new EdgeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to an APP
		driver.get("https://www.zomato.com/login");

		// Switch the frame using id
//		driver.switchTo().frame(3);
		driver.switchTo().frame("auth-login-ui");

		driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("9876543210");

		driver.findElement(By.xpath("//i[@aria-label='close Modal']")).click();

		driver.switchTo().defaultContent();

		Thread.sleep(3000);

		driver.quit();

	}
}