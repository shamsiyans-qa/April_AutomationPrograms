package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.HomePage;
import utilities.ExcelUtility;

//Logout

public class HomeTest extends BaseClass {
	
	@Test
	public void loginWithValidCredentials() throws IOException
	{
		String userNameValue = ExcelUtility.getStringData(1, 0, "loginpage"); //here we are passing string values thats why we use getStringData method; if we are passing integer values, then we will use the method - getIntegerData
		String passwordValue = ExcelUtility.getStringData(1, 1, "loginpage");// here "loginpage" is the name of the sheet, so this has to be given in "" , since it is a string value	
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(userNameValue); //passing the values
		loginpage.enterPassword(passwordValue); //passing the values
		loginpage.clickOnSignIn();
		
		
		HomePage logoutpage = new HomePage(driver);
		logoutpage.clickOnAdmin();
		logoutpage.clickOnLogout();
	}

}
