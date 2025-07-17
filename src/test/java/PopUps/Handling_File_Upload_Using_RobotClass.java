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

public class Handling_File_Upload_Using_RobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {

		// Launch the Browser
		WebDriver driver = new ChromeDriver();

		// maximize the Window
		driver.manage().window().maximize();

		// Implicit
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to APP
		driver.get("https://the-internet.herokuapp.com/upload");

		StringSelection str = new StringSelection("C:\\Users\\sahil\\Downloads\\resume (1).pdf");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		// Identify Choose file Button
		WebElement upload = driver.findElement(By.id("file-upload"));

		// Click on choose file button using action class
		Actions act = new Actions(driver);

		act.moveToElement(upload).click(upload).build().perform();

		Thread.sleep(3000);

		// Paste the file using control+v and click on enter
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);

		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);

		r.keyRelease(KeyEvent.VK_V);

		r.keyPress(KeyEvent.VK_ENTER);

		Thread.sleep(5000);

		driver.quit();

	}
}