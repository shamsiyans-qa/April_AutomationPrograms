package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AxesMethods extends BaseClass{
	
	
	public void parent()
	{
		WebElement parentElement = driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
	}
	
	public void child()
	{
		WebElement childElement = driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//child::ul"));
	}
	
	public void followingSibling()
	{
		WebElement sibling = driver.findElement(By.xpath("//button[@id='button-one']//following-sibling::div"));
	}
	
	public void following() //towards below
	{
		WebElement followingLocator = driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='my-2']//following::div[@id='message-two']"));
	}
	
	public void preceding()
	{
		WebElement precedingLocator = driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='my-2']"));
	}

	/*public void ancestor()
	{
		WebElement ancestorLocator = driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='card-body']"));
	} */
	public static void main(String[] args) {
		

	}

}
