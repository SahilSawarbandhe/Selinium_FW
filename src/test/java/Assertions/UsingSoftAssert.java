package Assertions;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UsingSoftAssert {

	@Test
	public void scenario() {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.facebook.com");

		@Nullable
		String acturl = driver.getCurrentUrl();

		String expurl = "https://www.facebook.com/";

		SoftAssert s = new SoftAssert();

		s.assertEquals(acturl, expurl);

		s.assertTrue(acturl.contains(expurl), "passed the true condition");

		s.assertTrue(true, expurl);

		s.assertNotNull(expurl);

		driver.quit();

		s.assertAll();

	}
}