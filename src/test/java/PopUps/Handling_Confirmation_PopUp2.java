package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Confirmation_PopUp2 {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String url = "https://demoapps.qspiders.com/ui/alert?sublist=0";

		// Navigate to APP
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.location=arguments[0]", url);
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		Thread.sleep(3000);

		driver.findElement(By.id("deleteButton")).click();
		
		Thread.sleep(3000);

		Alert al = driver.switchTo().alert();

		al.accept();

		Thread.sleep(3000);

		driver.quit();

	}
}