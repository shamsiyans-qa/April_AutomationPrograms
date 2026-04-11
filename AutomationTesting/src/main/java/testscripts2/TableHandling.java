package testscripts2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscripts.BaseClass;

public class TableHandling extends BaseClass {

	
	public void tablePrinting() {
		
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tableTest = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		
		System.out.println(tableTest.getText());
	}
	
	public void rowPrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tableRow = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[2]"));
		System.out.println(tableRow.getText());
	}
	
	public void cellPrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tableCell = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[2]//td[3]"));   //for taking the 2nd row,3rd value from the table
	  System.out.println(tableCell.getText());
	}
	
	public void columnPrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> tableColumn = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));  //for printing the list of elements we use <WebElements> ; for printing the column values we use //table[@attribute='value']//tbody//tr//td[column index].This is because while printing the column we have to specify the whole rows from the table
		for(WebElement column : tableColumn) // it will print the whole column within the table
		{
			System.out.println(column.getText());
		}
	}
	public static void main(String[] args) {
		TableHandling object = new TableHandling();
		object.browserInitialisation();
		//object.tablePrinting();
		//object.rowPrinting();
		//object.cellPrinting();
		object.columnPrinting();
	}

}
