package utilitty;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	
	public static String readExcelFile(int Row,int Cell) throws Exception
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Asus\\Desktop\\javafullcourse\\frame87\\TestData\\testdata.xlsx");
		org.apache.poi.ss.usermodel.Sheet excelSheet = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = excelSheet.getRow(Row).getCell(Cell).getStringCellValue();
		return value;
		
	}

}
