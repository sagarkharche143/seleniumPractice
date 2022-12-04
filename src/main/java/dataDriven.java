import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import javax.sound.midi.SysexMessage;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\ExcelDataDriven\\Demodata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();

		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				// 1.Identify Testcases column by scanning the entire first row
				Iterator<Row> rows = sheet.iterator(); // access to iterate sheet
				Row firstrow = rows.next(); // actual movement is happen here to next row
				Iterator<Cell> ce = firstrow.cellIterator();
				int k = 0;
				int column = 0;
				/*
				 * k and column is declared for if the position of the cell we want, is changed
				 * in future that time our code should run without error
				 */
				while (ce.hasNext()) {
					Cell value = ce.next();
					if (value.getStringCellValue().equalsIgnoreCase("Testcases")) // Data2 = index2
					{
						column = k;
					}
					k++;
				}

				System.out.println(column);
				while (rows.hasNext()) {
					Row row = rows.next();
					if (row.getCell(column).getStringCellValue().equalsIgnoreCase("Purchase")) {
						Iterator<Cell> cel = row.cellIterator();
						while (cel.hasNext()) {
							System.out.println(cel.next().getStringCellValue());
						}
					}
				}

			}

		}

	}

}
