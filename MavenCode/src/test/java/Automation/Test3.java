package Automation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test3 {
	
	@Test
	public void Test3Method1()
	{
		System.out.println("Test 3 Method 1");
	}
	
	@Test
	public void Test3Method2()
	{
		System.out.println("Test 3 Method 2");
	}
	
	@Test
	public void Test3Method3()
	{
		System.out.println("Test 3 Method 3");
	}
	
	@BeforeSuite
	public void BeforeTestSuite()
	{
		System.out.println("I will execute before test suite");
	}
	
	@AfterSuite
	public void AfterTestSuite()
	{
		System.out.println("I will execute after suite");
	}


}
