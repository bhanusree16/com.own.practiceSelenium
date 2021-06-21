package uploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import library.Webpage_initial;

public class Fileupload {
	@Test
	public void uploading_simpkle_file()
	{
		WebDriver driver = Webpage_initial.browesr_open("chrome","https://nervgh.github.io/pages/angular-file-upload/examples/simple/");
//		driver.findElement(By.xpath("(//input)[1]")).sendKeys("C:\\Users\\jagan\\OneDrive\\Desktop\\Bhanu Resume.docx");
//		driver.findElement(By.xpath("(//input)[1]")).sendKeys("C:\\Users\\jagan\\OneDrive\\Desktop\\Bhanu Resume.pdf"); 
		driver.findElement(By.xpath("(//input)[1]")).click();
	}

}
