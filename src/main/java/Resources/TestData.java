package Resources;

import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider (name="names")
	public Object[][] UsenrName()
	{
		
		Object[][] obj=new Object[][] {{"roopi"},{"mama"},{"manja"}};
		return obj;
	}
}
