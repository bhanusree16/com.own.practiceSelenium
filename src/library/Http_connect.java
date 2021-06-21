package library;

import java.net.HttpURLConnection;
import java.net.URL;

public class Http_connect {
	public static void verifyUrl(String urlLink)
	{
		try {
			URL	MY_url = new URL(urlLink);
			HttpURLConnection Httpconnect = (HttpURLConnection)MY_url.openConnection();
			Httpconnect.connect();
			
			if(Httpconnect.getResponseCode()==200)
	           {
//	               System.out.println(urlLink+" - "+Httpconnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_OK);
	            }
	          if(Httpconnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
	           {
	               System.out.println(urlLink+" - "+Httpconnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
	            }
			
		} catch (Exception e) {
			
			
		}
		 
		
	}

}
