package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_File_Upload_PopUp {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate To App
		driver.get("https://the-internet.herokuapp.com/upload");

		// Identify the Upload Button
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\sahil\\Downloads\\resume (1).pdf");

		Thread.sleep(3000);

		driver.quit();

	}
}