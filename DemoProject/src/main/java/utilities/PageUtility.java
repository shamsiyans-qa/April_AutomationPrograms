package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//dropdown case : 

public class PageUtility { //for helping page class ; it is a helper class

	public void selectByVisibleTextMethod(WebElement elementName,String visibleText)  
	//user define method not the dropdown method
	//this method can be accessed in all the classes
	//WebElement elementName,String visibleText) is given general form ,so that it can be accessed in all the class
	 
	{
		Select select = new Select(elementName);
		select.selectByVisibleText(visibleText);//which can be accessed in all the Test class
	}	
	
	
	public void selectByIndexMethod(WebElement elementName,int indexValue)
	{
		
		Select select = new Select(elementName);
		select.selectByIndex(indexValue);
	}
	
	
	
	public void selectByValueMethod(WebElement elementName, String value)
	{
		Select select = new Select(elementName);
		select.selectByValue(value);
	}
	
	
	
	//no need to add utility methods for click , clear 
	//JavaScript Executor : 
	public void scriptExecutorByValueMethod(WebDriver driver, WebElement elementName, String value)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='value';",elementName);
	}

	
	public void scriptExecutorByClick(WebDriver driver,WebElement elementName)
	//for click, we should not need to give the parameter
	{
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",elementName);
		
	}
	
	
	public void scriptByScroll(WebDriver driver, WebElement elementName) //scroll from top to bottom
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)", "");
	}
	
	
	public void scriptForScrollingfromBottomtoTop(WebDriver driver,WebElement elementName)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-1500)","");
		
	}
		
	
	//Action Class : 
	
	public void dragAndDrop(WebDriver driver,WebElement drag,WebElement drop)
	{
		Actions actions = new Actions(driver);
		actions.dragAndDrop(drag, drop).perform();
	}
	
		
	public void rightClick(WebDriver driver,WebElement elementrightClick)
	{
		Actions actions = new Actions(driver);
		actions.contextClick(elementrightClick).perform();
	}
		
		
		public void mouseHover(WebDriver driver,WebElement moveToElementVariable)
		{
			Actions actions = new Actions(driver);
			actions.moveToElement(moveToElementVariable).perform();
		}
		
		public void doubleClick(WebDriver driver,WebElement doubleClick)
		{
			Actions actions = new Actions(driver);
			actions.doubleClick(doubleClick).perform();
		}
		
		
		
	}

