package com.selendemo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {
	
	
	

	public static void main(String[] args) throws IOException {
		 
		try {

            FileInputStream file = new FileInputStream(new File("D:/Spreadsheets/test.xls"));

            HSSFWorkbook workbook = new HSSFWorkbook(file);
            HSSFSheet sheet = workbook.getSheetAt(0);
            Cell cell = null;
            cell = sheet.getRow(1).getCell(2);
            cell.setCellValue(" Test");
            cell = sheet.getRow(2).getCell(2);
            cell.setCellValue("testing");
            cell = sheet.getRow(2).createCell(4);
            cell.setCellValue("4th cell");
            Row row = sheet.createRow(0);
            row.createCell(3).setCellValue("AAAAA");
            System.out.println("Writing");

            file.close();

            FileOutputStream outFile =new FileOutputStream(new File("D:/Spreadsheets/test.xls"));
            workbook.write(outFile);
            outFile.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }	

	}

}
