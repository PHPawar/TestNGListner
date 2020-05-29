package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import library.TestBase;
import utility.CommonFunctions;

public class ListenerTest extends TestBase implements ITestListener{
	private static Logger log = LogManager.getLogger(ListenerTest.class.getName());
	
	TestBase tb = new TestBase();
	CommonFunctions cf = new CommonFunctions();

	public void onTestStart(ITestResult result) {
	
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		cf.takesrnshot(driver, result.getName()+".png");
		log.info("Call autodefect and screen shot capture methods");
		log.info(result.getThrowable());
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		
		tb.openBrowser();
		log.info("Browser has been opened");
		
	}

	public void onFinish(ITestContext context) {
	tb.tearDown();
	log.info("Driver is closed");
		
	}

}
