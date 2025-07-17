package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handling_Notification_PopUp {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions opt = new ChromeOptions();

		// Ignore the Notification PopUp
		opt.addArguments("--disable-notifications");

		// Launch the Browser
		WebDriver driver = new ChromeDriver(opt);

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate To App
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");

		// Identify the notification button and click on it.
		driver.findElement(By.id("browNotButton")).click();
		
		opt.addArguments("--disabled-notifications");

		Thread.sleep(3000);

		driver.quit();

	}
}