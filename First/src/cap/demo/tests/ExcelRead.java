package cap.demo.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	
	public static void main(String n[]) throws IOException
	{
		FileInputStream fi=new FileInputStream(new File("D:\\dd\\test.xlsx"));
		XSSFWorkbook   workbook=new XSSFWorkbook (fi);
		XSSFSheet sheet=workbook.getSheetAt(0);
		Iterator<Row> rows=sheet.iterator();
		while(rows.hasNext())
		{
			Row currentRow=rows.next();
			Iterator<Cell> cellIterator=currentRow.iterator();
			while(cellIterator.hasNext())
		{
				
				 Cell currentCell=cellIterator.next();
				 if(currentCell.getCellType()== Cell.CELL_TYPE_NUMERIC)
				 {
					 
					 System.out.println(currentCell.getNumericCellValue());
					 
				 }
		}
			
		}
		
		
	}

}
