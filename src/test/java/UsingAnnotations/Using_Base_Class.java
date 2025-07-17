package UsingAnnotations;

import org.testng.annotations.Test;

import BaseClassUtility.BaseClass;

public class Using_Base_Class extends BaseClass {

	@Test
	public void demotest() {
		System.out.println("test scenario");
	}

	public void demotest2() {
		System.out.println("test scenario 2");
	}
}