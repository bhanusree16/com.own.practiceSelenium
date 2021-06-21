package Reports;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import library.Webpage_initial;


//	version 1 extent report
	/**
	 * public class extent_report2 {
	 	@Test
	public void report2()
	{
		ExtentReports report = new ExtentReports().get(extent_report2.class);
		
		report.init("C:\\eclipse\\ReportTools\\report.html", true);
		report.startTest("TEST1");
		
		WebDriver driver = Webpage_initial.browesr_open("chrome", "http://learn-automation.com");
		report.log(LogStatus.INFO, "browser up and running");
		
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Selenium"));
		report.log(LogStatus.PASS, "title verified");
		report.endTest();
	}

}
	 */

