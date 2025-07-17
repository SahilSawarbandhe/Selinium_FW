package PomUtilization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import PomPages.FBLoginPomPages;

public class FB_Login_Test {

	public static void main(String[] args) throws InterruptedException {

		// launch the Browser
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to app
		driver.get("https://www.facebook.com/");

		// To check StaleElementReferenceException
		WebElement un = driver.findElement(By.id("email"));

		WebElement psw = driver.findElement(By.id("pass"));

		WebElement login = driver.findElement(By.name("login"));

		un.sendKeys("selenium");

		driver.navigate().refresh();

		psw.sendKeys("pass@123");

		login.submit();

		// Utilizing POM class and handling StaleElementReferenceException

//		FBLoginPomPages l = new FBLoginPomPages(driver);
//
//		l.getUn().sendKeys("selenium");
//
//		l.getPsw().sendKeys("pass@123");
//
//		Thread.sleep(3000);
//
//		// Refresh
//		driver.navigate().refresh();
//
//		l.getUn().sendKeys("selenium");
//
//		l.getPsw().sendKeys("pass@123");
//
//		l.getLoginbtn().submit();
//		
		Thread.sleep(3000);

		driver.quit();

	}
}