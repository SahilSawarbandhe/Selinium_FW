package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alert_PopUp {

	public static void main(String[] args) throws InterruptedException {

		// launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to APP
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// Click on Js Alert Button
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

		/// Switch to Alert PopUp
		Alert al = driver.switchTo().alert();

		al.getText();

		al.dismiss();

		Thread.sleep(3000);

		// Identify result and print
		WebElement res = driver.findElement(By.id("result"));

		System.out.println(res.getText());

		driver.quit();

	}

}
