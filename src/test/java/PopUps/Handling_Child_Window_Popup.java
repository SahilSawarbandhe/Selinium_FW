package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Child_Window_Popup {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to APP
		driver.get("https://www.flipkart.com/");

		// Identify parent window id
		String pwid = driver.getWindowHandle();
		
		System.out.println(pwid);

		// Identify search tf
		driver.findElement(By.name("q")).sendKeys("toys");

		// Click on search icon
		driver.findElement(By.xpath("//*[name()='svg'][@width='24']")).click();

		// click on toy
		driver.findElement(By.xpath("//a[contains(text(),'ZUNBELLA')]")).click();

		Set<String> wids = driver.getWindowHandles();

		for (String s : wids) {
			driver.switchTo().window(s);
			if (driver.getTitle().contains("ZUNBELLA 2in1 Automatic")) {
				Thread.sleep(5000);

//				driver.findElement(By.xpath("//button[text()='Buy Now']")).click();

//				Thread.sleep(5000);

				driver.findElement(By.xpath("//button[text()='Add to cart']")).click();

			}
		}

		Thread.sleep(3000);

		// Switch back to Parent Window
		driver.switchTo().window(pwid);

		Thread.sleep(3000);

//		driver.quit();

	}

}
