package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Using_Enabled {

	@Test(enabled = true, groups = "smoke")
	public void login() {
//		System.out.println("login");
		Reporter.log("login", true);

	}

	@Test
	public void register() {
//		System.out.println("register");
		Reporter.log("register", true);

	}

	@Test
	public void create() {
//		System.out.println("create");
		Reporter.log("create", true);

	}
}