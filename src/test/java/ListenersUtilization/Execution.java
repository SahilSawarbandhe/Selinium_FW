package ListenersUtilization;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClassUtility.BaseClass;
import dev.failsafe.internal.util.Assert;

@Listeners(ListenersUtility.Listenerss.class)
public class Execution extends BaseClass {

	@Test
	public void demo () {
		System.out.println("Scenario");
		
	}
}
