package introduccion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile {
	
	public void WriteExcel( String filePath, String sheetName, String[] dataWriter) throws IOException {
		
		File file = new File(filePath);

		FileInputStream inputStream = new FileInputStream(file);
		
		XSSFWorkbook newWokbook = new XSSFWorkbook(inputStream);

		XSSFSheet newSheet = newWokbook.getSheet(sheetName);
		
		int rowCount = newSheet.getLastRowNum() - newSheet.getFirstRowNum();
		
		
		XSSFRow row  = newSheet.getRow(0);
		
		XSSFRow newRow  = newSheet.createRow(rowCount + 1);
		
		for (int i = 0; i < row.getLastCellNum(); i++) {
			XSSFCell newCell = newRow.createCell(i);
			newCell.setCellValue(dataWriter[i]);
		}
		
		inputStream.close();
		
		FileOutputStream outputstream = new FileOutputStream(file);
		
		newWokbook.write(outputstream);
		
		outputstream.close();
		
	}
	
	public void writeCellValue(String filePath, String sheetName, int rowNumber, int cellNumber, String resultText) throws IOException {
		
		File file = new File(filePath);

		FileInputStream inputStream = new FileInputStream(file);
		
		XSSFWorkbook newWokbook = new XSSFWorkbook(inputStream);

		XSSFSheet newSheet = newWokbook.getSheet(sheetName);
		
		XSSFRow row = newSheet.getRow(rowNumber);
		
		XSSFCell firstCell = row.getCell(cellNumber -1);
		
		System.out.println("First cell value es: " + firstCell.getStringCellValue());
		
		XSSFCell nextCell = row.createCell(cellNumber);
		
		nextCell.setCellValue(resultText);
		
		System.out.println(" Next cell value is: " + nextCell.getStringCellValue());
		
		inputStream.close();
		
		FileOutputStream outputStream = new FileOutputStream(file);
		
		newWokbook.write(outputStream);
		
		outputStream.close();
	}
}
