package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_Flag {
	@Test(priority=2,groups = "smoke")
	public void login() {
//		System.out.println("login");
		Reporter.log("login",true);
	}
	
	@Test (priority=1)
	public void register() {
//		System.out.println("register");
		Reporter.log("register",true);

	}
	
	@Test (priority=3)
	public void create() {
//		System.out.println("create");
		Reporter.log("create",true);

	}
}