package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to APP
		driver.get("https://demo.guru99.com/test/drag_drop.html");

		WebElement dg1 = driver.findElement(By.id("fourth"));
		WebElement dp1 = driver.findElement(By.id("amt7"));

		WebElement dp2 = driver.findElement(By.id("credit2"));
		WebElement dg2 = driver.findElement(By.id("bank"));

		WebElement dg4 = driver.findElement(By.id("fourth"));
		WebElement dp4 = driver.findElement(By.id("amt8"));

		WebElement dg3 = driver.findElement(By.id("credit1"));
		WebElement dp3 = driver.findElement(By.id("loan"));

		// Object creation for Action Class
		Actions act = new Actions(driver);

		act.dragAndDrop(dg1, dp1).dragAndDrop(dg2, dp2).dragAndDrop(dg3, dp3).dragAndDrop(dg4, dp4).build().perform();

		Thread.sleep(3000);

//		driver.findElement(By.xpath("//div[@class='cb-close']")).click();

		WebElement p = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		System.out.println(p.getText());

		driver.quit();

	}
}