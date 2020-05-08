package login;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseTest {
	
	public  ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	
	@BeforeSuite
	public void Setup(){
		 htmlReporter = new ExtentHtmlReporter("C:\\Users\\alok.gupta\\Desktop\\Mercury\\MMMMextentReportsTestNG.html");

		// create ExtentReports and attach reporter(s)
		// htmlReporter.setAppendExisting(true);
	 extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		//extent.setReportUsesManualConfiguration(true);

		}
	@AfterMethod
	public void getResult(ITestResult result)
	{
		 if(result.getStatus()==ITestResult.FAILURE) 
		 {
			 test.fail(MarkupHelper.createLabel(result.getName()+"Test case Failed",ExtentColor.RED));
			 test.fail(result.getThrowable());
		 }
		 else if (result.getStatus()==ITestResult.SUCCESS)
		 {
			 test.pass(MarkupHelper.createLabel(result.getName()+"Test case Passed",ExtentColor.GREEN));
		 }
		 else
		 {
			 test.skip(MarkupHelper.createLabel(result.getName()+"Test case Skip",ExtentColor.YELLOW));
			 test.fail(result.getThrowable());
		 }
		
	}

	
	@AfterSuite
	public void teardown(){
		
		 extent.flush();

	}

}
