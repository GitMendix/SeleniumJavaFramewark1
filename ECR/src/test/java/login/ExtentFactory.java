package login;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class ExtentFactory {

	
	public static ExtentReports getInstance(){
		
	
		 ExtentHtmlReporter htmlReporter;
		 ExtentReports extent;
		 htmlReporter = new ExtentHtmlReporter("E:\\eclipse\\Mendix-Project\\Extent_Reports\\LoginextentReports.html");
		 extent = new ExtentReports();
        extent.attachReporter(htmlReporter);   
         
		
      return extent;
	}

}
