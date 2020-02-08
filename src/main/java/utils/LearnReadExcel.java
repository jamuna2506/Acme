package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnReadExcel {
	public String[][] readExcel(String fileName) throws IOException {
		XSSFWorkbook wbook= new XSSFWorkbook("./data/"+fileName+".xlsx");
		XSSFSheet wsheet= wbook.getSheetAt(0);
		int colcount=wsheet.getRow(0).getLastCellNum();
		int rowcount=wsheet.getLastRowNum();
		System.out.println("column count"+ colcount);
		System.out.println("row Count"+ rowcount);
		String[][] data= new String[rowcount][colcount];
		
		for (int i = 1; i <= rowcount; i++) {
			XSSFRow row=wsheet.getRow(i);
			for (int j = 0; j < colcount; j++) {
				XSSFCell cell=row.getCell(j);
				String value = cell.getStringCellValue();
				data[i-1][j] = value;
				System.out.println(data[i-1][j]);
			}
			System.out.println();
		}
		wbook.close();
		return data;
		
	}

}
