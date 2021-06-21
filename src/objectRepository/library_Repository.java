package objectRepository;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.testng.annotations.Test;

public class library_Repository {
	
	Properties pro;
//	so here i created constructor to load the property file 
	public library_Repository()
	{
		File src = new File("./objectRepository.property");
		
		try {
			FileInputStream Fis = new FileInputStream(src);
//		we have created the object of the property file by using class properties which is used to read the property file
//			and we have to use this "pro" object in various methods so make it as global
			pro = new Properties();
//		now load the property file
			pro.load(Fis);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		} 
	}
	
	
//	i will use this method for  where ever chromedriver path is required ..if i change path also no need to modilfy in all scripts,just i will go to property
//	file and change the path there
	@Test
	public String get_chrome_path()
	{
	
//	now get the property from property file
	String chro_path=pro.getProperty("chrome_path");
	return chro_path;
	}
	
	@Test
	public String get_automation_url()
	{
	
//	now get the property from property file
	String app_url = pro.getProperty("automation_url");
	return app_url;
	}
	
	public String get_wordpress_url()
	{
		return pro.getProperty("wordpress_url");
	}

}
