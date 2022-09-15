package utilitty;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshoot {

	public static void CaptureScreenshotFailedTC(WebDriver driver,String methodName) throws Throwable
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Asus\\Desktop\\javafullcourse\\frame87\\screenshot\\"+methodName+".png");
		FileHandler.copy(source, dest);
		
	}
}
