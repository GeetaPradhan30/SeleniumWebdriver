package day51;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {
	
	public ExtentSparkReporter sparkReporter;  //UI of the report
	public ExtentReports extent;             //Populate common info in the report
	public ExtentTest test;                  //update test case entry in the report and update the status of test methods.
	
	public void onStart(ITestContext context)
	{
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+ "/Reports/myreprts.html");
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Functional Testing");
		sparkReporter.config().setTheme(Theme.DARK);
		
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Computer name","localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester name", "Geeta");
		extent.setSystemInfo("os", "windows10");
		extent.setSystemInfo("Browser name", "Chrome");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		test=extent.createTest(result.getName());
		test.log(Status.PASS, "Testcase pass is: "+result.getName());
		
	}
	
	public void onTestFailure(ITestResult result)
	{
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, "Testcase fail is: "+result.getName());
		test.log(Status.FAIL, "Testcase fail is:"+result.getThrowable() );
		
	}
	
	public void onTestSkipped(ITestResult result)
	{
		test=extent.createTest(result.getName());
		test.log(Status.SKIP, "Testcase skipped is: "+result.getName());
	}
	
	public void onFinish(ITestContext contex)
	{
		extent.flush();
	}

}
