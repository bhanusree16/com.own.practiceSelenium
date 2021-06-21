package library;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
		public static String screenhshotlibrary(WebDriver Driver,String screenshotname) {
		TakesScreenshot ts = (TakesScreenshot)Driver;
		File src= ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		String destination = "./Screenshots/"+screenshotname+".png";
		try {
			FileUtils.copyFile(src, new File(destination));
		} catch (Exception e) {
			
			System.out.println("error is " + e.getMessage());
		}
		return destination;

	}

}
