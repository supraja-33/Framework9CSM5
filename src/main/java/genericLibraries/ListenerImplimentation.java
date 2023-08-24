package genericLibraries;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplimentation implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+"Test Script Execution started");
	
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+" pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+" Fail");
		System.out.println("Failure occured due to: "+result.getThrowable());
		
		TakesScreenshot ts=(TakesScreenshot)(BaseClass.driver);
		JavaUtility jutil=new JavaUtility();
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/" +result.getMethod().getMethodName()+"_"+jutil.getCurrentTime()+" .png");
		FileUtils.copyFile(src, dest);
	}
	

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
	
	
	
	
	

}
