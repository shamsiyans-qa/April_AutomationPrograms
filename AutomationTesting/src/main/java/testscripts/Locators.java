package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends BaseClass
{
	public void id() {
		
	
	//WebElement elementName = driver.findElement(By.Locator(locator value));
			WebElement message = driver.findElement(By.id("single-input-field"));
			message.sendKeys("Hello");
			
			WebElement showMessage = driver.findElement(By.id("button-one"));
			showMessage.click();
			
			WebElement valueA = driver.findElement(By.id("value-a"));
			WebElement valueB = driver.findElement(By.id("value-b"));
			WebElement startDownloadButton = driver.findElement(By.id("downloadButton"));
			WebElement alertNormalSuccess = driver.findElement(By.id("normal-btn-success"));
	}
	
	public void name() {
		WebElement enterDatePicker = driver.findElement(By.name("daterange"));
		WebElement tableFilterShow = driver.findElement(By.name("example_length"));
		WebElement jQueryDatePicker1 = driver.findElement(By.name("from"));
		WebElement jQueryDatePicker2 = driver.findElement(By.name("to"));
		
		
		
		
	}
	
	public void classLocator()
	{
		WebElement enterDatePicker = driver.findElement(By.className("form-control datepicker"));
		WebElement submitDataButton = driver.findElement(By.className("btn btn-success btn-block"));
		WebElement rightShiftKeyList = driver.findElement(By.className("btn moveall btn-outline-secondary"));
	    WebElement leftShiftKeyList = driver.findElement(By.className("btn removeall btn-outline-secondary"));
	     WebElement checkBoxSelectAll = driver.findElement(By.className("btn btn-primary"));
	}
	
	public void linkText()
	{
		
		WebElement bootStrap = driver.findElement(By.linkText("Bootstrap Date Picker"));
	    WebElement jquery   = driver.findElement(By.linkText("Jquery Date Picker"));
	    WebElement checkBoxDemo = driver.findElement(By.linkText("Checkbox Demo"));
	    WebElement ajaxFormSubmit = driver.findElement(By.linkText("Ajax Form Submit"));
	    WebElement tablePagination  = driver.findElement(By.linkText("Table with Pagination"));
	    	
	
	}
	
	public void partialLinkText() {
		WebElement partialBootStrap = driver.findElement(By.partialLinkText("Bootstrap Date"));
	    WebElement partialJquery    = driver.findElement(By.partialLinkText("Jquery Date"));
	    WebElement partialCheckBox = driver.findElement(By.partialLinkText("Checkbox"));
	    WebElement partialAjaxForm = driver.findElement(By.partialLinkText("Ajax Form"));
	    WebElement partialTablePagination = driver.findElement(By.partialLinkText("Table with"));
	    
	
	
	}

	public static void main(String[] args) {
		Locators object = new Locators();
		object.browserInitialisation();
		object.id();
		object.name();
		object.classLocator();
		object.linkText();
		object.partialLinkText();
		
	}

}
