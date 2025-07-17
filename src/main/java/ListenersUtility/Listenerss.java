package ListenersUtility;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenerss implements ITestListener, ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		System.out.println("Report configuration - Suite execution started ");
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("Report backup - Suite execution ended");
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test Execution started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped");
	}

}