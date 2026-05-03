package testscript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utilities.WaitUtility;

public class BaseClass {
	
	public WebDriver driver;
	@Parameters("browser")
	@BeforeMethod(alwaysRun = true)   //to go inside the method we can add (alwaysRun=true) ;this has added to went inside the method
	public void browserInitialisation(String browser)throws Exception
	{
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		


	else if(browser.equalsIgnoreCase("edge"))
	{
		driver = new EdgeDriver();
	}
		
	else
	{
		throw new Exception("Invalid Browser");
	}	
		driver.get("https://groceryapp.uniqassosiates.com/admin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtility.IMPLICITWAIT));
		driver.manage().window().maximize();       //for maximizing the window
	}
		
	
  // @AfterMethod(alwaysRun = true)
	public void browserQuitClose(){
		//driver.close();
		driver.quit();
	}	
}
	