package Assertions;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsingHardAssert {

	@Test
	public void scenario() throws InterruptedException {

		// launch the browser
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		driver.get("https://www.flipkart.com");

		@Nullable
		String act = driver.getTitle();

		String exp = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";

		Assert.assertEquals(act, exp);

		Assert.assertTrue(act.contains(exp));

		Assert.fail();

		Assert.assertNotNull(exp);

		Thread.sleep(3000);

		driver.quit();

	}
}