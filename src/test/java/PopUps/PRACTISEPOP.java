package PopUps;

import java.time.Duration;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PRACTISEPOP {

	public static void main(String[] args) {

		// launch the Browser
		WebDriver driver = new ChromeDriver();

		/// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String url = "https://demo.guru99.com/popup.php";

		// Navigate to APP using JavaScript Executor
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.location=arguments[0]", url);

		// String pw = driver.getCurrentUrl();

		String pwid = driver.getWindowHandle();

		driver.findElement(By.xpath("//a[text()='Click Here']")).click();

		Set<String> wids = driver.getWindowHandles();

		for (String s : wids) {
			driver.switchTo().window(s);
			if (driver.getTitle().contains("Guru99 Bank Home Page")) {
				driver.findElement(By.name("emailid")).click();
			}
		}
	}
}