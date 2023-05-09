package introduccion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelfile {

	public ReadExcelfile() {

	}

	public void readExcel(String filePath, String sheetName) throws IOException {
		File file = new File(filePath);

		FileInputStream inputStream = new FileInputStream(file);

		XSSFWorkbook newWokbook = new XSSFWorkbook(inputStream);

		XSSFSheet newSheet = newWokbook.getSheet(sheetName);

		int rowCount = newSheet.getLastRowNum() - newSheet.getFirstRowNum();

		for (int i = 0; i <= rowCount; i++) {
			XSSFRow row = newSheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				System.out.println(row.getCell(j).getStringCellValue() + " ");
			}
		}
	}
	// Leer una celda específica

	public String getCellValor(String filePath, String sheetName,int rowNumber, int cellNumber) throws IOException {

		File file = new File(filePath);

		FileInputStream inputStream = new FileInputStream(file);

		XSSFWorkbook newWokbook = new XSSFWorkbook(inputStream);

		XSSFSheet newSheet = newWokbook.getSheet(sheetName);
		
		XSSFRow row = newSheet.getRow(rowNumber);
		
		XSSFCell cell =  row.getCell(cellNumber);

		return cell.getStringCellValue();

	}

}
