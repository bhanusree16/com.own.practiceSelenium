package testNg;

import org.testng.annotations.Test;

//if we dont mention priority by default all methods have the priority as zero and executed based on the method name by alhabetical order
public class prioritycase {
	@Test(priority=2)
	public void test2()
	{
		System.out.println("started");
	}
	
	@Test(priority=1)
	public void test1()
	{
		System.out.println("====");
	}
	
	@Test(priority=3)
	public void test4()
	{
		System.out.println("ended");
	}
	
	@Test(priority=4)
	public void test3()
	{
		System.out.println("====");
	}

	
}
