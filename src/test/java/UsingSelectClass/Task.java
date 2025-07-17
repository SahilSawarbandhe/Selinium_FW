package UsingSelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		// launch the Browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to APP
		driver.get("https://www.google.com/");

		// Identify the Search bar and send text
		driver.findElement(By.id("APjFqb")).sendKeys("sel");

		List<WebElement> s = driver.findElements(By.xpath("//span[contains(text(),'sel')]"));

		for (WebElement e : s) {
			System.out.println(e.getText());
		}

//		driver.findElement(By.xpath("//b[contains(text(),'f introduction for freshers')]")).click();

		driver.findElement(By.xpath("//b[contains(text(),'f love quotes')]")).click();

		Thread.sleep(3000);

		driver.quit();

	}
}