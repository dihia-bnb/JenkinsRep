package jenkins_Maven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Rules_Data_Provider {
	//Dataprovider stores data in a certain format and provides the data to Test Cases
	
		//Rule 1: Will return a 2-Dimensional Object Array
		//Rule 2: Pass the data in form of rows and cols
		//Rule 3: Connect the @Test case with the @DataProvider by two simple ways
		//          dataProvider = nameofthemethod holding the @DataProvider
		//          name = name of the method holding the @DataProvider
		//Rule 4: We need to parameterize the method in @Test with total no of cols declared in the 2-D Array
	
	@Test(dataProvider= "getData")
	public void loginTest(String username, String password, String browserName, int mobileNumber) {
		System.out.println(username+"--------"+password+"--------"+browserName+"---------"+mobileNumber+"---------");
		
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][4];
		data[0][0]= "username";
		data[0][1]= "password1";
		data[0][2]= "chrome";
		data[0][3]=123654;
		
		data[1][0]= "username";
		data[1][1]= "password2";
		data[1][2]= "chrome";
		data[1][3]=1236147;
		
		data[2][0]= "username";
		data[2][1]= "password3";
		data[2][2]= "chrome";
		data[2][3]=1236963;
		
		return data;
	}
	
}
