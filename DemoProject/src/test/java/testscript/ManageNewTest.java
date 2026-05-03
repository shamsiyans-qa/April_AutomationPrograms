package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewTest extends BaseClass{
	
	HomePage homepage;
	ManageNewsPage newspage;
	@Test(description = "Test Case")
	public void verifyManageNewsTest() throws IOException
	{
		String userNameValue = ExcelUtility.getStringData(1, 0, "loginpage"); //here we are passing string values thats why we use getStringData method; if we are passing integer values, then we will use the method - getIntegerData
		String passwordValue = ExcelUtility.getStringData(1, 1, "loginpage");// here "loginpage" is the name of the sheet, so this has to be given in "" , since it is a string value	
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(userNameValue).enterPassword(passwordValue); //passing the values
		//loginpage.enterPassword(passwordValue); //passing the values
		
		  homepage = loginpage.clickOnSignIn();
		
	
		String newsContent = ExcelUtility.getStringData(0, 0,"newsmessage");
		
		//ManageNewsPage newspage = new ManageNewsPage(driver);
		newspage = homepage.clickOnManageNewsMoreInfo();
		 newspage.clickNewButton().enterTheNews(newsContent).clickonSaveButton();
		//newspage.enterTheNews(newsContent);
		//newspage.clickonSaveButton();
		
	    boolean successMessage = newspage.successAlert();
	    Assert.assertTrue(successMessage);
		
	}
	}

