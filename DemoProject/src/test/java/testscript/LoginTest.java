package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends BaseClass {

	HomePage homepage;
	@Test(priority=1,groups={"regression"},retryAnalyzer=retry.Retry.class)
	public void verifyTheUserisAbletoLoginUsingValidCredentials() throws IOException
	{
		//String userNameValue = "admin";
		//String passwordValue = "admin";
		
		String userNameValue = ExcelUtility.getStringData(1, 0, "loginpage"); //here we are passing string values thats why we use getStringData method; if we are passing integer values, then we will use the method - getIntegerData
		String passwordValue = ExcelUtility.getStringData(1, 1, "loginpage");// here "loginpage" is the name of the sheet, so this has to be given in "" , since it is a string value	
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(userNameValue).enterPassword(passwordValue); //passing the values
		//loginpage.enterPassword(passwordValue); //passing the values
		 
		homepage = loginpage.clickOnSignIn();
		
		boolean homePage = loginpage.isHomePageDisplayed(); //for storing the value from LoginPage,we are usomg a variable called homePage
		Assert.assertTrue(homePage);         //we are using hard assertion 
		
	}
	
	
	@Test(priority=2)
	public void validUserNameInvalidPassword() throws IOException
	{
		//String userNameValue = "admin";
		//String passwordValue = "adm";
		
		String userNameValue = ExcelUtility.getStringData(2, 0, "loginpage");
		String passwordValue = ExcelUtility.getStringData(2, 1,"loginpage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(userNameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickOnSignIn();
		
		//expecting an alert message while giving wrong credentials,so we have to locate the alert 
		boolean alertMessage = loginpage.isAlertMessageDisplayed();
		Assert.assertTrue(alertMessage);
	}
	
	
	@Test(priority=3)
	public void invalidUserNameValidPassword() throws IOException
	{
		//String userNameValue = "adm";
		//String passwordValue = "admin";
		
		String userNameValue = ExcelUtility.getStringData(3, 0, "loginpage");
		String passwordValue = ExcelUtility.getStringData(3, 1, "loginpage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(userNameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickOnSignIn();
	}



	@Test(priority=4)
	public void invalidUserNameInvalidPassword() throws IOException
	{
		
		//String userNameValue = "adm";
		//String passwordValue = "adm";
		
		String userNameValue = ExcelUtility.getStringData(4, 0, "loginpage");
		String passwordValue = ExcelUtility.getStringData(4, 1,"loginpage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(userNameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickOnSignIn();
		
	}


}

