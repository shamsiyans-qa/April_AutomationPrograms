package testscripts2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import testscripts.BaseClass;

public class GetTotalPgm extends BaseClass {
	
	
	public void total()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php"); //navigating to another page
		
		driver.findElement(By.xpath("//input[@id='value-a']")).sendKeys("45");
		driver.findElement(By.xpath("//input[@id='value-b' and @class='form-control']")).sendKeys("38");
	    driver.findElement(By.xpath("//button[@id='button-two']")).click();
	    
	    
	    WebElement result = driver.findElement(By.xpath("//div[@id='message-two']"));
	    System.out.println(result.getText());
	       
	   
	}
	

	public static void main(String[] args) {	
	GetTotalPgm object = new GetTotalPgm();
	
	object.browserInitialisation();
	object.total();
		

	}
}



	