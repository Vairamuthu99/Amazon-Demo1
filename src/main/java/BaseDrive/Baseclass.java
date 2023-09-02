package BaseDrive;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import UtilityDrive.Utilclass;

public class Baseclass extends Utilclass {

	@BeforeMethod
	public void Startup() throws Exception {

		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}

	@AfterMethod
	public void Closeup() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}

	public void onTestStart(ITestResult result) {
	}

	public void onTestSuccess(ITestResult result) {
	}

	public void onTestFailure(ITestResult result) {
	}

	public void onFinish(ITestContext context) {
	}
}
