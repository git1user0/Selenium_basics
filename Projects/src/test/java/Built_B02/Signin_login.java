package Built_B02;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Signin_login {
	//prioritization,invocations,dependson methods.assert concepts,,enabled = false ,enabled=true
	
	@Test(priority = -2,groups= {"smoke"},invocationCount=1)
	public void Home_page() {
		System.out.println("this is homepage");
	}
	
	@Test(priority = -1, groups={"smoke","Regression"},dependsOnMethods = {"Home_page"},invocationCount=0)
	public void Signup() {
		Reporter.log("This is signup Page");
		//note this test case will be skipped
		//we can also use enabled = false instead of invocation count = 0
	}
	
	@Test(priority = -1, groups={"smoke"},dependsOnMethods = {"Home_page"},enabled = false)
	public void Signup1() {
		Reporter.log("This is signup Page");
		//note this test case will also be skipped
		//we can also use enabled = false instead of invocation count = 0
	}
	
	@Test(priority = 0,groups= {"smoke","Regression"},dependsOnMethods = {"Home_page","Signup"})
	public void login() {
		System.out.println("This is Login page it depends o signup page");
		Assert.assertTrue(false); //wantedly im making failure
	}
	
	@Test(invocationCount=2)
	public void logout() {
		System.out.println("logged out");
	}

}
