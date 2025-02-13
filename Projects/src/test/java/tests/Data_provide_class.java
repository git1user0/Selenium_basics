package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provide_class {
	@DataProvider(name="bharath")
	public Object[][] getData1()
	{
		Object[][] arr1 = {{"Manual",89},{"SQL",90},{"CORE JAVA",89}};
		return arr1;
	}
	@DataProvider(name="bharath2")
	public Object[][] getData2()
	{
		Object[][] arr2 = {{"Manual",98},{"SQL",94},{"CORE JAVA",88}};
		return arr2;
	}
	
	@Test(dataProvider = "bharath3",dataProviderClass=Data_provider2.class)
	public void userData(String course, int score) {
		System.out.println(course+" "+score);
	}

}
