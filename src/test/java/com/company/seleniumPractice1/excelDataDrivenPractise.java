package com.company.seleniumPractice1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelDataDrivenPractise {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\ExcelDataDriven\\Demodata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// get the count of total no of sheets present in excel workbook
		int sheetsinworkbook = workbook.getNumberOfSheets();
		// how to reach your targeted sheets in workbook - that is testdata
		for (int i = 0; i < sheetsinworkbook; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				Row firstrow = rows.next();
				Iterator<Cell> cel = firstrow.cellIterator();
				int k = 0;
				int column = 0;
				while (cel.hasNext()) {
					Cell celvalue = cel.next();
					if (celvalue.getStringCellValue().equalsIgnoreCase("Testcases")) {
						column = k;
					}
					k++;
				}
				System.out.println(column);
				/*
				 * once testdata coulmn is identified scan entire column to select target value
				 * that is purchase.
				 */
				while (rows.hasNext()) {
					Row row = rows.next();
					if (row.getCell(column).getStringCellValue().equalsIgnoreCase("Purchase"))
					// grab the all data in purchase row
					{
						Iterator<Cell> cell = row.cellIterator();
						while (cell.hasNext()) {
							System.out.println(cell.next().getStringCellValue());
						}
					}
				}
			}

		}

	}

}
