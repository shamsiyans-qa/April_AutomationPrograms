package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public WebDriver driver;
	@BeforeMethod
	public void browserInitialisation()
	{
		driver = new ChromeDriver();
		
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();       //for maximizing the window
		
		
	}
	//@AfterMethod
	public void browserQuitClose(){
		//driver.close();
		driver.quit();
	}	
}
	