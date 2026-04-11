package testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUpload extends BaseClass {

@Test	
public void fileUploadUsingSendkeys()
{
	driver.navigate().to("https://the-internet.herokuapp.com/upload");
	WebElement chooseFile = driver.findElement(By.xpath("//input[@id='file-upload']"));
	chooseFile.sendKeys("C:\\Users\\Shamsiya NS\\Downloads\\abstraction.pdf");
	
	WebElement upload = driver.findElement(By.xpath("//input[@id='file-submit']"));
	upload.click();
}
	@Test
	public void fileUploadUsingRobotClass() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement selectPdfFile = driver.findElement(By.xpath("//span[text()='Select PDF file']"));
		selectPdfFile.click();
		StringSelection stringselection = new StringSelection("C:\\Users\\Shamsiya NS\\Downloads\\abstraction.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
		Robot robot = new Robot();
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);   //VK_CONTROL, VK_V , VK_ENTER  : Constants in KeyEvent class
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
}
