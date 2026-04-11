package testscripts2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testscripts.BaseClass;

public class ActionClass extends BaseClass{
	
	
	public void dragAndDrop() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag = driver.findElement(By.xpath("//span[text()= 'Draggable n°1']"));
		
		WebElement drop = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		
	}
	
	public void rightClick()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement right = driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
		Actions action = new Actions(driver);
		action.contextClick(right).perform();
	}
	
	
	public void mouseHover()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement mouseHoverHandle = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mouseHoverHandle).perform();
	}
	
	public void doubleClick()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement doubleClickHandle = driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
		Actions action = new Actions(driver);
		action.doubleClick(doubleClickHandle).perform();
	}
	
	public void clickAction()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement click = driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
		
		Actions action = new Actions(driver);
		action.click(click).perform();
		
	}
	

	public static void main(String[] args) {
		
		ActionClass object = new ActionClass();
		object.browserInitialisation();
		//object.dragAndDrop();
		//object.rightClick();
		//object.mouseHover();
		//object.doubleClick();
		//object.clickAction();

	}

}
