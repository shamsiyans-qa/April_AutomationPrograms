package testscripts2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscripts.BaseClass;

public class CheckBoxHandling extends BaseClass {

	
	public void checkBox()
	{
		
		
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		
		WebElement check = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		check.click();
	
		
	}
	
	public void display()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement check = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		
		if(check.isSelected())
		{
			System.out.println("CheckBox is selected");
		}
		else
		{
			check.click();
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		CheckBoxHandling object = new CheckBoxHandling();
		object.browserInitialisation();
		//object.checkBox();
	   object.display();
	}

}
