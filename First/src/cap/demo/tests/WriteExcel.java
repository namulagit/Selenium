package cap.demo.tests;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;

public class WriteExcel {
	
	public static void main(String n[]) throws IOException
	{
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("testSheet");
		Row row=sheet.createRow(0);
		Cell cell=row.createCell(0);
		cell.setCellValue("Hello");
		try
		{
			
			FileOutputStream fos=new FileOutputStream("D:\\dd\\testing.xlsx");
			workbook.write(fos);
			
		}
		catch(FileNotFoundException ex)
		{
			
			ex.printStackTrace();
		}
		
		
		System.out.println("Done");
	}

}
