package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AxesMethodsPractise extends BaseClass
{

	
	
	public void parentAxes()
	{
		WebElement parent = driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
	}
	
	
	public void childAxes()
	{
		WebElement child = driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//child::ul"));
	}
	
	
	public void followingSibling()
	{
		WebElement sibling = driver.findElement(By.xpath("//button[text()='Show Message']//following-sibling::div"));
	}
	
	
	public void followingAxes()
	{
		WebElement following = driver.findElement(By.xpath("(//button[@id='button-one']//following::div[@id='message-one'])[1]"));
		WebElement following1 = driver.findElement(By.xpath("//button[@id='button-two']//following::div[@class='my-2']"));
	}
	
	
 public void precedingAxes()
 {
	 WebElement preceding = driver.findElement(By.xpath("//button[@id='button-two']//preceding::div[@class='my-2']"));
 }
 
 
 
public void ancestorAxes()
{
	WebElement ancestor = driver.findElement(By.xpath("//button[@id='button-two']//ancestor::div[@class='card-body']"));
	WebElement ancestorIndexing = driver.findElement(By.xpath("(//button[@id='button-two']//ancestor::div)[6]"));
}
	
	
	
	
	
	public static void main(String[] args) {
		

	}

}
