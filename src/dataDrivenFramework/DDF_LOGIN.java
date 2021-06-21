package dataDrivenFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM_pages.LoginPage;
import library.Webpage_initial;
import library.Xlfile_read;

public class DDF_LOGIN {
	WebDriver driver;
//	use test annotation and in brackets with the dataprovider name to intialize the test cases from that method
//	here i can test with 2 scenarios of how the test annotation data is coming with "Wordpress" and "Wordpress1" 
//	scenario 1 (take the data in the wordpress dataprovider i.e in the same file)
	@Test(dataProvider="Wordpress")
	
//	scenario 2 (take the data in the wordpress1 dataprovider which is accessing xl file i.e outside )
//	@Test(dataProvider="Wordpress1")
	public void wordpress_login(String username,String password) throws Exception
	{
		driver = Webpage_initial.browesr_open("chrome", "https://wordpress.com/log-in");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		LoginPage login = new LoginPage(driver);
//		you can use only line 25 or 27-30
		login.loginpage(username, password);
//		driver.findElement(By.xpath("//input[@class='form-text-input'][@type='text']")).sendKeys(username);
//		driver.findElement(By.cssSelector("button[type='submit']")).click();
//		driver.findElement(By.cssSelector("#password")).sendKeys(password);
//		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);
//		System.out.println((driver.getTitle()));
		Assert.assertTrue(driver.getTitle().equals("My Home ‹ Site Title — WordPress.com"),"title not verified");
		System.out.println("page title verified user able to log in");
	}
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
	
//	below line indicates that we need to take the data from this method of dataprovide name "xxxxx"which is having return type as object
	@DataProvider(name="Wordpress")
	public Object[][] array_list()
	{
		Object[][] list = new Object[3][2];
		list[0][0]="bhanu12reddy";
		list[0][1]="pass";
		
		list[1][0]="bhanu12reddy";
		list[1][1]="sareddy@123";
		
		list[2][0]="adminn1";
		list[2][1]="sareddy@123";
		
		return list;
		
	}
	
	@DataProvider(name="Wordpress1")
	public Object[][] array_list1()
	{
		Object[][] list = new Object[3][2];
		Xlfile_read data = new Xlfile_read("C:\\Users\\jagan\\OneDrive\\Desktop\\ReadXLfile.xlsx");
		int rows_count =data.row_count(0);
		for(int i=0;i<rows_count;i++)
		{
			list[i][0]=data.get_data(0, i, 0);
			list[i][1]=data.get_data(0, i, 1);	
		}
		
		

		
		return list;
		
	}

}
