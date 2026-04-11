package testscripts2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscripts.BaseClass;

public class MultipleWindowHandling extends BaseClass {
	
	//for multiple window handle, we have to locate the elements an then click the function
	
	public void multipleWindow()
	{
		driver.navigate().to("https://webdriveruniversity.com/");
		WebElement contactUs = driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contactUs.click();
		
		WebElement loginPortal = driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		loginPortal.click();
		
		String parent = driver.getWindowHandle(); //assigned to a string, for getting parent window
		System.out.println(parent);
		System.out.println("*******************************************************************************");
		
		
		Set<String> allWindows = driver.getWindowHandles();
		for(String windows : allWindows)
		{
			System.out.println("Window Handle : " + windows);
			driver.switchTo().window(windows);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("****************************************************************************");
			
		}
		
	
	
	
	}
	
	
	
	
	
	


	public static void main(String[] args) {
	MultipleWindowHandling object = new MultipleWindowHandling();
	object.browserInitialisation();
	object.multipleWindow();

	}

}
