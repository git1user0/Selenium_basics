package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Before_After {
	@BeforeSuite
	public void Before_suit() {
		System.out.println("Brfore suite(4)");
	}
	@BeforeTest
	public void Before_test() {
		System.out.println("Before test(3)");
	}
	@BeforeClass
	public void Before_class() {
		System.out.println("Before class(2)");
	}
	@BeforeMethod
	public void Before_method() {
		System.out.println("Before method(1)");
	}
	@Test
	public void core() {
		System.out.println("Center-(0)");
	}
	@AfterMethod
	public void After_method() {
		System.out.println("After method");
	}
	@AfterClass
	public void After_class() {
		System.out.println("After class");
	}
	@AfterTest
	public void After_Test() {
		System.out.println("After test");
	}
	@AfterSuite
	public void After_suite() {
		System.out.println("After suite");
	}

}
