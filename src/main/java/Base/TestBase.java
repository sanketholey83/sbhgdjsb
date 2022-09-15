package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilitty.ReadExcel;
import utilitty.ReadPropertyFile;

public class TestBase {
	
	public static WebDriver driver;

	
	public void initalization() throws Exception
	{
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Desktop\\javafullcourse\\StaticProgram\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
//	driver.get(ReadPropertyFile.readProperty("url"));
	driver.get(ReadExcel.readExcelFile(0, 0));
	
	
//	driver.get("https://kite.zerodha.com/");
	}
	
//	public String ReadExcelFile(int Row,int Cell) throws Exception
//	{
//		FileInputStream file = new FileInputStream("C:\\Users\\Asus\\Desktop\\javafullcourse\\frame87\\TestData\\testdata.xlsx");
//		org.apache.poi.ss.usermodel.Sheet excelSheet = WorkbookFactory.create(file).getSheet("Sheet1");
//		String value = excelSheet.getRow(Row).getCell(Cell).getStringCellValue();
//		return value;
//		
//	}
	

}
