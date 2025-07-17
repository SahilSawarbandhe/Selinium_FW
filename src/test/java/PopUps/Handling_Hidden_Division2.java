package PopUps;

import java.time.Duration;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handling_Hidden_Division2 {

	public static void main(String[] args) {

		// launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to APP
		driver.get("https://demoapps.qspiders.com/");
		
		String pwid = driver.getWindowHandle();

		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();

		driver.findElement(By.xpath("//section[text()='Popups']")).click();

		driver.findElement(By.xpath("//section[text()='Hidden division']")).click();

		driver.findElement(By.xpath("//button[text()='Add Customer']")).click();

		Alert al = driver.switchTo().alert();
		
		Set<String> wids = driver.getWindowHandles();
		
		for(String s:wids) {
			driver.switchTo().window(s);
			@Nullable
			String url = driver.getCurrentUrl();
			if(url.contains("DemoApps | Qspiders | Hidden Division")) {
				break;
			}
		}
		
		WebElement cn = driver.findElement(By.id("customerName"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOf(cn)).click();
		
		cn.sendKeys("selenium");
		
		WebElement ce = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customerEmail")));
		
		ce.click();
		
		ce.sendKeys("selenium123@gmail.com");
		
	
		
		
		
		
		
		
		
//		al.sendKeys("selelihudfv");
//
//		driver.findElement(By.id("customerName")).sendKeys("selenium");
//
//		driver.findElement(By.id("customerEmail")).sendKeys("selenium123@gmail.com");
//
//		WebElement p = driver.findElement(By.name("product"));
//
//		Select s = new Select(p);
//
//		s.selectByIndex(0);
//
//		driver.findElement(By.id("message")).sendKeys("hiiii,I am a Software Tester");
//
//		al.accept();
	}
}