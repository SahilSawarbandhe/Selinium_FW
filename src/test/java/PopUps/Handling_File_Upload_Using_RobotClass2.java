package PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_File_Upload_Using_RobotClass2 {

	public static void main(String[] args) throws AWTException, InterruptedException {

		// Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to APP
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");

		StringSelection str = new StringSelection("C:\\Users\\sahil\\Downloads\\resume (1).pdf");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		// Identify the Choose file Button
		WebElement up = driver.findElement(By.id("resume"));

		Actions act = new Actions(driver);

		act.moveToElement(up).click().build().perform();

//		Thread.sleep(3000);

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);

		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);

		r.keyRelease(KeyEvent.VK_V);

		r.keyPress(KeyEvent.VK_ENTER);

		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		driver.quit();

	}
}