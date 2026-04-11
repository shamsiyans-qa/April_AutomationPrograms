package testscripts2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscripts.BaseClass;

public class FramesHandling extends BaseClass{
	
	//embedding one HTML document inside an another HTML document
	
	public void framesTest()
	{
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement frames = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(frames); //switching to frame we use this method
		
		WebElement clicking = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		clicking.click();
	}

	public static void main(String[] args) {
		FramesHandling object = new FramesHandling();
		object.browserInitialisation();
		object.framesTest();
	}

}
