package PopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Authentication_PopUp {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Window
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate To App
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		Thread.sleep(5000);

		driver.quit();
		
	}
}