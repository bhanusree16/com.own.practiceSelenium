package library;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGLisners implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+" started and time taken");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+" success");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+" failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+" skipped");		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(result.getName()+" failed with percentage");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getName()+" started with context");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getName()+" finsihed with context");
		
	}



}
