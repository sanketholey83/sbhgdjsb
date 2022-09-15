package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import utilitty.TakeScreenshoot;

public class CaptureScreenshot extends TestBase {
	LoginPage login;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
		login = new LoginPage();
	}
	
	@Test
	public void verifyAppTitleTest()
	{
		String expTitle = "1Kite - Zerodha's fast and elegant flagship tradingplatform";
		String actTitle = login.verifyAppTitle();
		Assert.assertEquals(actTitle, expTitle,"Title is wrong");
	}
//	
//	@AfterMethod
//	public void FailedScreenshot(ITestResult z) throws Throwable
//	{
//		if(ITestResult.FAILURE==z.getStatus())
//		{
//			TakeScreenshoot.CaptureScreenshotFailedTC(driver, z.getName());
//		}
//		driver.quit();
//	}
	@Test
	public void VerifyAppLabel()
	{
		String ActResult = "1Login to Kite";
		String expResult = login.verifyKiteLabel();
		Assert.assertEquals(ActResult, expResult);
	}
	@AfterMethod
	public void FailedScreenshot2(ITestResult z) throws Throwable
	{
		if(ITestResult.FAILURE==z.getStatus())
		{
			TakeScreenshoot.CaptureScreenshotFailedTC(driver, z.getName());
		}
		driver.quit();
	}

}
