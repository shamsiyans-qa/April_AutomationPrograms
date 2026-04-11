package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XPath extends BaseClass {
	
	
	public void relativeXPath()
	{
		//tagname[@attribute='value']
		
	WebElement button = driver.findElement(By.xpath("//button[@id='button-one']"));
	WebElement enterMessage = driver.findElement(By.xpath("//input[@id='single-input-field']"));
	WebElement checkBox = driver.findElement(By.xpath("//input[@id='gridCheck']"));
	WebElement selectAll = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
	WebElement radioButton = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
	
	}
	
	public void text() {
	//tagname[text()='value']
		
		WebElement message = driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement valueA = driver.findElement(By.xpath("//button[text()='Get Total']"));
		WebElement showSelectedValue = driver.findElement(By.xpath("//button[text()='Show Selected Value']"));
		WebElement getResult = driver.findElement(By.xpath("//button[text()='Get Results']"));
		WebElement submitForm = driver.findElement(By.xpath("//button[text()='Submit form']"));

	}
	
	public void contains() {
		//tagname[contains(@attribute,'value')]
		
		WebElement button = driver.findElement(By.xpath("//input[contains(@id,'single')]"));
		WebElement firstName = driver.findElement(By.xpath("//input[contains(@id,'Custom01')]"));
		WebElement termsandCondition = driver.findElement(By.xpath("//input[contains(@id,'Check')]"));
		WebElement selectColor = driver.findElement(By.xpath("//select[contains(@id, 'input-field')]"));
		WebElement startDownload = driver.findElement(By.xpath("//button[contains(@id, 'Button')]"));
		
		//front space , use text(), no need to give the full text, instead give partially 
		//tagname[contains(text(),'value')]
		
		WebElement message  = driver.findElement(By.xpath(" //div[contains(text(),'ur Message :')]"));
		WebElement firstSelected = driver.findElement(By.xpath("//button[contains(text(), 'First Selected')]"));
		WebElement bootStrapSubmit = driver.findElement(By.xpath("//button[contains(text(), 'Submit')]"));
		WebElement jquerySelected = driver.findElement(By.xpath("//button[contains(text(), 'select')]"));
		WebElement faceBook = driver.findElement(By.xpath("//a[contains(text(), 'Facebook ')]"));
	}
	
	public void startsWith()
	{
		//tagname[starts-with(@attribute,'value')]
		
		WebElement valueA = driver.findElement(By.xpath("//input[starts-with(@id,'value-a')]"));
		WebElement button = driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));
		WebElement ajaxSubmit = driver.findElement(By.xpath("//input[starts-with(@id, 'sub')]"));
		WebElement ajaxDescription = driver.findElement(By.xpath("//textarea[starts-with(@id, 'des')]"));
		WebElement ajaxStates = driver.findElement(By.xpath("//span[starts-with(@id,'select2-hy')]"));
		
		
		
		//tagname[starts-with(text(),'value')]
		
		WebElement getTotalbutton =driver.findElement(By.xpath("//button[starts-with(text(),'Get')]"));
		WebElement submitForm = driver.findElement(By.xpath("//button[starts-with(text(),'Submit')]"));
		WebElement removeAll = driver.findElement(By.xpath("//button[starts-with(text(), 'Remove ')]"));
		WebElement startDownloadButton = driver.findElement(By.xpath("//button[starts-with(text(),'Start')]"));
		WebElement getNewUser = driver.findElement(By.xpath("//button[starts-with(text(),'Get')]"));
		
	}
	
	
	public void and()
	{
		//tagname[@attribute='value' and @attribute='value']
		
		WebElement button = driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));
	    WebElement inputA = driver.findElement(By.xpath("//input[@id='value-b'and @type='text']"));
	    WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='gridCheck' and @type='checkbox']"));
	    WebElement showSelectedValue = driver.findElement(By.xpath("//button[@id=\"button-one\" and @class=\"btn btn-primary\"]"));
	    WebElement selectColor = driver.findElement(By.xpath("//select[@id='single-input-field' and @class='form-control']"));
	}
	
	public static void main(String[] args) {
		
		XPath object = new XPath();
		object.browserInitialisation();
		object.relativeXPath();
		object.text();
		object.contains();
		object.startsWith();
		object.and();
		
	}

}
