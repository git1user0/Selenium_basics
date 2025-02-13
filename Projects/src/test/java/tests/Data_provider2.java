package tests;

import org.testng.annotations.DataProvider;

public class Data_provider2 {
	@DataProvider(name="bharath3")
	public Object[][] getData3()
	{
		Object[][] arr3 = {{"Manual",89},{"SQL",90},{"CORE JAVA",89}};
		return arr3;
	}

}
