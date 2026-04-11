package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutor extends BaseClass{
	
	
	@Test
	public void javaScriptExecute()
	{
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement inputBox = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		//inputBox.sendKeys("Hello");
		
		//js.executeScript("arguments[0].value='value';", webelement name);
		js.executeScript("arguments[0].value='Hello';", inputBox);
		
		WebElement showMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
		//showMessage.click();
				//js.executeScript("arguments[0].click();", webelement name);
				js.executeScript("arguments[0].click();", showMessage); //execute script is used to execute the java script code
		
	}

	@Test
	public void scrollDown()
	{
		driver.navigate().to("https://webdriveruniversity.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)","");
		js.executeScript("window.scrollBy(0,-150)","");
		
	}
}
