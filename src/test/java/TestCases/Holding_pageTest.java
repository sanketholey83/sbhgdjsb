package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.Holdings_page;
import Pages.LoginPage;

public class Holding_pageTest extends TestBase {
	LoginPage login;
	Holdings_page hold;
	
	@BeforeMethod
	public void first() throws Throwable
	{
		initalization();
		 login = new LoginPage();
		 hold = new Holdings_page();
		 login.loginZerodhaApp();
		
	}
	
	@Test
	public void clickOnHoldingTest() throws Throwable
	{
		hold.clickOnHolding();
	}
	
	@Test
	public void dropdownTest() throws Throwable
	{
		hold.clickOnHolding();
		hold.dropdown();
	}
	
	
	@AfterMethod
	public void last()
	{
		driver.close();
	}

}
