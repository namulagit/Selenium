package cap.testng;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public static Object[][] getExcelData(String excelPath)
	{
		String tabData[][]=null;
		
		try
		{
			
			FileInputStream fis=new FileInputStream(excelPath);
			workbook =new XSSFWorkbook(fis);
			sheet=workbook.getSheetAt(0);
			int rowNumber=sheet.getLastRowNum();
			int columnNumber=2;
			tabData=new String[rowNumber][columnNumber];
			int r=0;
			for(int i=1;i<=rowNumber;i++,r++)
			{
				int c=0;
				for(int j=1;j<=columnNumber;j++,c++)
				{
					tabData[r][c]=getCellData(i, j);
					System.out.println("Printing"+tabData[r][c]);
					
				}
				
				
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return tabData;
		
	}
	
	public static String getCellData(int row,int cell)
	{
		String cellData="";
		
		try
		{
			int cellType=sheet.getRow(row).getCell(cell).getCellType();
			if(cellType==3)
			{
				cellData="";
			}
			else
			{
				cellData=sheet.getRow(row).getCell(cell).getStringCellValue();
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return cellData;
	}
}
