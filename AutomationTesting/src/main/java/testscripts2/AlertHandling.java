package testscripts2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscripts.BaseClass;

public class AlertHandling extends BaseClass {
	
	public void simpleAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement simple = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		simple.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}
	
	
	public void confirmationAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement confirmation = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		confirmation.click();
		
		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		alert.dismiss();
		System.out.println("Successfully Cancelled the alert : " + alertMessage);
		
	}
	
	
public void promptAlert() {
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	WebElement prompt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
	prompt.click();
	
	Alert alert = driver.switchTo().alert();
	alert.sendKeys("Shamsiya");
	alert.accept();
}


	public static void main(String[] args) {
		AlertHandling object = new AlertHandling();
		object.browserInitialisation();
		//object.simpleAlert();
		//object.confirmationAlert();
		object.promptAlert();
		
	}

}
