package testscripts2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testscripts.BaseClass;

public class DropdownHandling extends BaseClass {
	
	public void byValue()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select = new Select(dropdown);
		select.selectByValue("Green"); //take the value of the attribute
	}
	
	public void byIndex()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select = new Select(dropdown);
		select.selectByIndex(1);   //indexing starting from 0
		
	}
	
	public void byVisibleText()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Red");        //add the text from the DOM
	}

	public static void main(String[] args) {
		DropdownHandling object = new DropdownHandling();
		object.browserInitialisation();
		//object.byValue();
		//object.byIndex();
		object.byVisibleText();
		

	}

}
