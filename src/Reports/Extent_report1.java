package Reports;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import library.Utility;
import library.Webpage_initial;

public class Extent_report1 {
	ExtentTest logger;
	ExtentReports report;
	WebDriver driver;

	
	

	
	@Test
	public void report1()
	{
//		first to generate extent report i created object it gives the report format as html and path mentioned
		
	 report = new ExtentReports("C:\\eclipse\\ReportTools\\newreport.html");
	 
		
//	start the log report and pass the name(test name) which you want to see on the report page
	logger = report.startTest("verify page title");
	
//	in this way can generate the logs	
	
	 driver = Webpage_initial.browesr_open("chrome", "https://learn-automation.com/");
	
	
	logger.log(LogStatus.INFO, "application started");
	
	String title = driver.getTitle();
	logger.log(LogStatus.INFO, "title captured");
	
	Assert.assertTrue(title.contains("selenium"));
	logger.log(LogStatus.PASS, "title verified");
//	Webpage_initial.browser_close();
	
	
	}
	@AfterMethod
	public void result1(ITestResult result)
	{
		if(result.getStatus() == ITestResult.FAILURE)
		{
			String path = Utility.screenhshotlibrary(driver, result.getName());
			
//			the below line is not working for screenshot
			logger.log(LogStatus.FAIL,"title not verified", logger.addScreenCapture(path));
			
//			this is also not working
			logger.log(LogStatus.FAIL,"title not verified", logger.addScreenCapture("./Screenshots/report1.png"));
			
//			but in the place of path variable directly i gave the path it's working
			logger.log(LogStatus.FAIL,"title not verified1", logger.addScreenCapture("C:/eclipse/Javaprojects/practiceSelenium/Screenshots/report1.png"));
			
		}
		report.endTest(logger);
		report.flush();
		driver.get("C:\\eclipse\\ReportTools\\newreport.html");
	}

}
