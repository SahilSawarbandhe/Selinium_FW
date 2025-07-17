package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Prompt_Alert {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to APP
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// Click on JS prompt
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

		// Create Object for Alert Class
		Alert al = driver.switchTo().alert();

		al.sendKeys("Prompt Alert");

		al.accept();

		WebElement res = driver.findElement(By.id("result"));

		System.out.println(res.getText());

		Thread.sleep(3000);

		driver.quit();

	}
}