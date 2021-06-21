package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/eclipse/Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=EN_US&campaign_id=973072070&extra_1=s%7Cc%7C230582711966%7Ce%7Cfacebook%20sign%20up%7C&placement=&creative=230582711966&keyword=facebook%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D973072070%26adgroupid%3D54006292691%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-295862466660%26loc_physical_ms%3D9062155%26loc_interest_ms%3D%26feeditemid%3D19894516786%26param1%3D%26param2%3D&gclid=CjwKCAjwr_uCBhAFEiwAX8YJgfE9cFh7_vAuPooumAPSLyQKv3uPW2eVH-hdWcXx_lutyNpN4JjHDBoCRXQQAvD_BwE");
		Actions act = new Actions(driver);
		
		driver.findElement(By.name("firstname")).sendKeys("BHANU");
		act.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(2))
		.sendKeys("SAREDDY")
		.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(2))
		.sendKeys("9000415865")
		.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(2))
		.sendKeys("bhanu@123")
		.pause(Duration.ofSeconds(2))
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.ARROW_UP)
		.pause(Duration.ofSeconds(2))
		.sendKeys(Keys.TAB)
//		it press 2 times the downarrow
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		
		.pause(Duration.ofSeconds(2))
		.sendKeys(Keys.TAB)
		.sendKeys("1996")
		.pause(Duration.ofSeconds(2))
		
		.build().perform();
		
		WebElement gender = driver.findElement(By.xpath("//*[text()='Female']"));
		
		gender.click();
		System.out.println(gender.getText());
		

		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		Thread.sleep(5000);
		
//driver.quit();
	}

}
