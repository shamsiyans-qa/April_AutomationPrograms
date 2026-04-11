package testscripts2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscripts.BaseClass;

public class TableMakingPractise extends BaseClass {
	
	
	public void tablePinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tableCreate = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(tableCreate.getText());
	}
	
	
	public void rowPrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement row = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[10]"));
		System.out.println(row.getText());
	}
	
	
	public void cellPrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement cell = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[5]//td[4]"));
		WebElement cell1 = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[7]//td[6]"));
	    System.out.println(cell.getText());
	    System.out.println(cell1.getText());
	}
	
	
	public void columnPrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	 List <WebElement> column = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[6]"));
		for(WebElement col : column)
		{
			System.out.println(col.getText());
		}
	}
	
	

	public static void main(String[] args) {
	TableMakingPractise object = new TableMakingPractise();
	object.browserInitialisation();
	//object.tablePinting();
	//object.rowPrinting();
	//object.cellPrinting();
	//object.columnPrinting();
	object.columnPrinting();

	}

}
