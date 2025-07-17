package TestNG;

import org.testng.annotations.Test;

public class Using_Invocation_Count {

	@Test(priority = 2, invocationCount = 2,groups="smoke")
	public void login() {
		System.out.println("login");
	}

	@Test(priority = 1, invocationCount = 1)
	public void register() {
		System.out.println("register");
	}

	@Test(invocationCount = 3, priority = 3)
	public void search() {
		System.out.println("search");
	}
}