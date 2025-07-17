package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Thread_Pool_Size {

	@Test(groups = "smoke")
	public void login() {
//		System.out.println("login");
		Reporter.log("login",true);

	}
	
	@Test(invocationCount = 3,threadPoolSize = 3)
	public void register() {
//		System.out.println("register");
		Reporter.log("register",true);

	}
	
	@Test
	public void create() {
//		System.out.println("create");
		Reporter.log("create",true);

	}
}