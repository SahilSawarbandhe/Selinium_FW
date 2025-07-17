package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Flipkart {
	@Parameters("browser")
	@Test
	public void login(String BROWSER) throws InterruptedException {

		WebDriver driver = null;

		if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}

		// maximize the window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// navigate to app
		driver.get("https://www.flipkart.com/");

		Thread.sleep(1000);

		driver.quit();

		Reporter.log("Flipkart Opened Successfully", true);
	}
}