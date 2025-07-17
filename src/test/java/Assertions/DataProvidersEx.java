package Assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersEx {

	@DataProvider
	public Object[][] data() {
		Object[][] obj = new Object[3][2];

		obj[0][0] = "email";

		obj[0][1] = "selenium123@gmail.com";

		obj[1][0] = "un";

		obj[1][1] = "username";

		obj[2][0] = "pass";

		obj[2][1] = "pass@123";

		return obj;
	}

	@Test(dataProvider = "data")
	public void Test(String un, String psw) throws InterruptedException {
		System.out.println(un + " " + psw);
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys(un);
		
		driver.findElement(By.id("pass")).sendKeys(psw);
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}
}