package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Authentication_PopUp2 {

	public static void main(String[] args) throws InterruptedException {

		// LAunch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// NAvigate to APP
		driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");

//		driver.findElement(By.id("AuthLink")).click();

		Thread.sleep(3000);

		driver.quit();

	}
}