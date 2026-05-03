package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constant.Constant;

public class ExcelUtility {
	
	static FileInputStream f; //IO Stream class : to read inputs from files
	static XSSFWorkbook wb;  //XSSFWorkbook class in Apache inbuilt class - to read data from workbook
	static XSSFSheet   sh;   // XSSFSheet : to read data from sheet
	
	public static String getStringData(int a,int b,String sheet) throws IOException  //a: rows and b: columns
	{
		f=new FileInputStream(Constant.TESTDATAFILE);
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet(sheet); //used to get value from the sheet
		XSSFRow r =sh.getRow(a); // XSSFRow : is a apache class used to get value from the row
		XSSFCell c = r.getCell(b); //getCell method get details from the cell 
		return c.getStringCellValue(); // getStringCellValue method used to get string data from the cell
	}
		
		public static String getIntegerData(int a, int b,String sheet) throws IOException
		{
			f = new FileInputStream(Constant.TESTDATAFILE);
			wb = new XSSFWorkbook(f);
			sh = wb.getSheet(sheet);
			XSSFRow r = sh.getRow(a);
			XSSFCell c = r.getCell(b);
			int x =(int)c.getNumericCellValue(); //type casting : double value converted into integer
			return String.valueOf(x); //conversion
		}
		

}
