package tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Build_boolean {
	//prioritization cocepts
	
	@Test
	public void login_test()
	{
		System.out.println("this is my non static maethod");
		Reporter.log("this is my non static maethod");
	}
	
	@Test(priority=-1)
	public void signup()
	{
		System.out.println("this is my 2nd script");
	}
	

}
