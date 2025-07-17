package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to APP
		driver.get("https://www.flipkart.com/");

		// Identify the Fashion Option
		WebElement f = driver.findElement(By.xpath("//span[text()='Fashion']"));

		// Create Action Class Object
		Actions act = new Actions(driver);

		// Hover on Fashion Option
		act.moveToElement(f).perform();

		// Click on an Option
		driver.findElement(By.xpath("//a[@class='_1BJVlg _11MZbx']")).click();

		// Identify the Min dd
		WebElement dd = driver.findElement(By.xpath("(//select)[1]"));

		// Select Class Object
		Select s = new Select(dd);

		// Select a value from min dd
		s.selectByIndex(1);

		// Identify the Max dd
		WebElement DD = driver.findElement(By.xpath("(//select)[2]"));

		Select ss = new Select(DD);

		// Select a value from Max dd
		ss.selectByIndex(1);

		Thread.sleep(3000);

		// Identify the Newest first option Click on Newest First Tab
		WebElement ele = driver.findElement(By.xpath("//div[text()='Newest First']"));

		ele.click();

		// Identify the Price
		WebElement p = driver.findElement(By.xpath(
				"//a[contains(text(),'Men Printed,')]/../../div[@class='hCKiGj']/a[@class='+tlBoD']/div[@class='hl05eU']/div[@class='Nx9bqj']"));

		// Print the Price
		System.out.println(p.getText());

//		Thread.sleep(3000);

		driver.quit();

	}
}