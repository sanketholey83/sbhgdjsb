package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.ByStock;
import Pages.LoginPage;

public class ByStockTest extends TestBase {
	
	LoginPage login;
	ByStock stc;
	@BeforeMethod
	public void first() throws Throwable
	{
		initalization();
		 login = new LoginPage();
		 stc = new ByStock();
		 login.loginZerodhaApp();
	}
	
	@Test(enabled = false)
	public void clickOnByStockTest() throws Throwable
	{
		stc.clickOnByStock();
	}
	
	@Test(enabled=false)
	public void clickByINFYstockTest() throws Throwable
	{
		stc.clickOnByINFYstock();
	}
	
	@Test(enabled = false)
	public void clickByONGCstockTest() throws Throwable
	{
		stc.clickOnByONGCstock();
	}
	
	@Test(enabled=false)
	public void clickByHDFCstockTest() throws Throwable
	{
		stc.clickOnByHDFCstock();
	}
	
	@Test(enabled=false)
	public void clickByHINDUstockTest() throws Throwable
	{
		stc.clickOnByHINDUstock();
	}
	
	@Test
	public void VerifyclickonActive() throws Exception
	{
		stc.clickonActiveButton();
	}
	
	@AfterMethod
	public void exit()
	{
		driver.close();
	}

}
