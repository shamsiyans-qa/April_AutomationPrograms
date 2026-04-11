package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;
	
	public void browserInitialisation()
	{
		driver = new ChromeDriver();
		
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();       //for maximizing the window
		
		
	}
	public void browserQuitClose(){
		//driver.close();
		driver.quit();
	}
	
	
	
	public static void main(String[] args) {
		
		BaseClass object = new BaseClass();
		object.browserInitialisation();
	}
		

	}
