package DataDriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task_FB {

	public static void main(String[] args) throws IOException, InterruptedException {

		// Convert physical file to java object
		FileInputStream fis = new FileInputStream("./src/test/resources/FBLoginPage");

		// Create property object
		Properties p = new Properties();

		// load the property object
		p.load(fis);

		// Get the
		String br = p.getProperty("browser");

		// get the url from property file
		String url = p.getProperty("url");

		// get the timeouts from property file
		String tm = p.getProperty("timeouts");

		// Convert timeouts to int
		int num = Integer.parseInt(tm);

		// get the username from property file
		String un = p.getProperty("un");

		// get the password from property file
		String psw = p.getProperty("psw");

		// Launch the browser
		WebDriver driver = new EdgeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(num));

		// Navigate to app
		driver.get(url);

		driver.findElement(By.id("email")).sendKeys(un);

		driver.findElement(By.id("pass")).sendKeys(psw);

		Thread.sleep(3000);

		driver.quit();

	}
}