package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PractiseAct {

	public static void main(String[] args) throws InterruptedException {

		// lAUNCH THE bROWSER
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// NAvigate to app
		driver.get("https://demowebshop.tricentis.com/");

		Actions act = new Actions(driver);

//		WebElement c = driver.findElement(By.xpath("//button[text()='Click Me']"));
//		
//		act.click(c).perform();
//		
//		WebElement rc = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
//		
//		act.contextClick(rc).perform();
//		
//		WebElement dc = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
//		
//		act.doubleClick().perform();

//		WebElement drag = driver.findElement(By.id("draggable"));
//
//		WebElement drop = driver.findElement(By.id("droppable"));
//
//		act.dragAndDrop(drag, drop).perform();

//		WebElement h = driver.findElement(By.id("toolTipButton"));
//		
//		act.moveToElement(h).perform();

//		WebElement cc = driver.findElement(By.id("circle"));
//
//		act.clickAndHold(cc).perform();
//
//		Thread.sleep(3000);
//
//		act.release(cc).perform();

		WebElement s = driver.findElement(By.id("small-searchterms"));

		act.moveToElement(s).click().keyDown(Keys.SHIFT).sendKeys("computers").keyUp(Keys.SHIFT).build().perform();
		
		WebElement b = driver.findElement(By.xpath("//input[@class='button-1 search-box-button']"));
		
		b.submit();
		
		Thread.sleep(3000);

		driver.quit();

	}
}