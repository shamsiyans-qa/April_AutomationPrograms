package testscripts2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscripts.BaseClass;

public class RadioButtonHandling extends BaseClass {
	
	
	public void radioButton()
	{
		
		 driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		 WebElement radio =  driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		 radio.click();
		 
		 WebElement buttonClick = driver.findElement(By.xpath("//button[@id='button-one']"));
		 buttonClick.click();
		
	}

	
	
	public void display()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radio =  driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		
		
		if(radio.isSelected())
		{
			System.out.println("Male RadioButton is Selected");
		}
		else
		{
		radio.click();
		}
	}
	
	public static void main(String[] args) {
		RadioButtonHandling object = new RadioButtonHandling();
		object.browserInitialisation();
		//object.radioButton();
		object.display();
		
		
	}

}
