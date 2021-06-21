package priority_case;


import org.testng.annotations.Test;

public class case1 {

	@Test(priority=-1)
	public static void a_method()
	{
		System.out.println("i m in a");
	}
	
	@Test(priority=-2)
	public static void b_method()
	{
		System.out.println("i m in b");
	}

}
