package Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream file1=new FileInputStream("D:\\Data Driven\\ExcelData.xls");
		XSSFWorkbook excelFile1 = new XSSFWorkbook(file1);
		
		int sheetCount = excelFile1.getNumberOfSheets();
		for(int i=0; i<sheetCount; i++)
		{
			if(excelFile1.getSheetName(i).equalsIgnoreCase("Sheet1"))
			{
			
			XSSFSheet sheet = excelFile1.getSheetAt(i);
			
			Iterator<Row> rows=sheet.iterator();
			Row HeadingRow = rows.next();
			Iterator<Cell> cell = HeadingRow.cellIterator();
			
			while(cell.hasNext())
			{
				Cell HeadingForColumn1 = cell.next();
				if(HeadingForColumn1.getStringCellValue().equalsIgnoreCase("Test case"))
				{
					
				}
				
			}
			
			
			
		}
		
		
		
	}

}
}
