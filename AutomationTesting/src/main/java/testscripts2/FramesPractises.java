package testscripts2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscripts.BaseClass;

public class FramesPractises extends BaseClass {

	public void frameDemo()
	{
		driver.navigate().to("https://www.w3schools.com/jsref/obj_window.asp");
		
		WebElement frames = driver.findElement(By.xpath("//iframe[@class='viously-iframe']"));
		driver.switchTo().frame(frames);
		
		WebElement clickContent = driver.findElement(By.xpath("//div[@class='c-controls__background']"));
		clickContent.click();
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		FramesPractises object = new FramesPractises();
		object.browserInitialisation();
		object.frameDemo();
	}

}
