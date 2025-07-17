package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Using_Depend_On_Method {

	@Test(dependsOnMethods = "register",groups="smoke")
	public void login() {
//		System.out.println("login");
		Reporter.log("login",true);

	}

	@Test
	public void register() {
//		System.out.println("register");
		Reporter.log("register",true);

	}

	@Test(dependsOnMethods = {"login","register"})
	public void search() {
//		System.out.println("search");
		Reporter.log("search",true);

	}
}