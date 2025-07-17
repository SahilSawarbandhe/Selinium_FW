package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_File_Upload_PopUp2 {

	public static void main(String[] args) throws InterruptedException {

		// launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to APP
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");

		driver.findElement(By.id("resume")).sendKeys("C:\\Users\\sahil\\Downloads\\resume (1).pdf");

		Thread.sleep(5000);

		driver.quit();
	}
}