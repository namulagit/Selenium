package cap.demo.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelTest {
	
	public static void main(String n[]) throws IOException
	{
		FileInputStream fi= new FileInputStream(new File("D:/dd/testing.xlsx"));
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		
		XSSFSheet sheet =wb.getSheetAt(0);
		int rowCount=sheet.getLastRowNum();
		String id="";
		String pass="";
		for(int i=1;i<=rowCount;i++)
		{
			
			Row row=sheet.getRow(i);
			id=row.getCell(0).getStringCellValue();
			pass=row.getCell(1).getStringCellValue();
			System.out.println(id);
			System.out.println(pass);
			
		}
		Row row=sheet.createRow(++rowCount);
		Cell cell=row.createCell(0);
		cell.setCellValue("Pass4");
		FileOutputStream fos=new FileOutputStream(("D:\\dd\\testing.xlsx"));
		wb.write(fos);
		
		
	}

}
