package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelector extends BaseClass {
	
	//1. Tag and ID : (tag#ID)
	//2. Tag and Class : (tag.class)
	//3. Tag and Attribute : (tag[attribute='value'])
	//4. Tag,Class and Attribute : (tag.class[attribute='value'])
	
	public void tagAndId()
	{
		WebElement singleInput = driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement valueA  = driver.findElement(By.cssSelector("input#value-a"));
		WebElement valueB = driver.findElement(By.cssSelector("input#value-b"));
		WebElement showMessage = driver.findElement(By.cssSelector("button#button-one"));
		WebElement getTotal  = driver.findElement(By.cssSelector("button#button-two"));
		WebElement selectColor = driver.findElement(By.cssSelector("select#single-input-field"));	
	
	}
	
	
	public void tagAndClass() 
	{
		WebElement checkBox = driver.findElement(By.cssSelector("input.form-check-input"));
		WebElement submit = driver.findElement(By.cssSelector("input.btn"));
	    WebElement tableDataDownload =  driver.findElement(By.cssSelector("input.form-control.form-control-sm"));
        WebElement getNewUser = driver.findElement(By.cssSelector("button.btn.btn-info"));
        WebElement rightShiftListBox = driver.findElement(By.cssSelector("button.btn.moveall.btn-outline-secondary"));
	
	}
public void tagAndAttribute()
{
	WebElement input = driver.findElement(By.cssSelector("input[placeholder='Message']"));
	WebElement selectAllButton = driver.findElement(By.cssSelector("input[value='Select All']"));
	WebElement formSubmit = driver.findElement(By.cssSelector("input[placeholder='First name']"));
	WebElement submitForm = driver.findElement(By.cssSelector("button[type='submit']"));
	WebElement radioButtonGetResult = driver.findElement(By.cssSelector("button[fdprocessedid='tpc1z9']"));
}



public void tagClassAndAttribute()
{
	WebElement message = driver.findElement(By.cssSelector("input.form-control[placeholder='Message']"));
	WebElement valueB = driver.findElement(By.cssSelector("input.form-control[fdprocessedid='tsr24k']"));
	WebElement ajaxForm = driver.findElement(By.cssSelector("input.form-control[placeholder='Subject']"));
	WebElement submitButton = driver.findElement(By.cssSelector("input.btn.btn-primary[value='Submit']"));
	WebElement jQueryShowDate = driver.findElement(By.cssSelector("button.btn.btn-primary[type='button']"));
	
}


 public static void main(String[] args) {
	 
	 CssSelector object = new CssSelector();
	 
	 object.browserInitialisation();
	 object.tagAndId();
	 object.tagAndClass();
	 object.tagAndAttribute();
	 object.tagClassAndAttribute();
	
	 
		
	}

}
