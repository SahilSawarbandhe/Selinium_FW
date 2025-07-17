package ListenersUtilization;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClassUtility.BaseClass;

@Listeners(ListenersUtility.Listenerss.class)
public class TestExecution extends BaseClass {
	
	
	@Test
	public void demo() {
		System.out.println("test scenario");
	}

}