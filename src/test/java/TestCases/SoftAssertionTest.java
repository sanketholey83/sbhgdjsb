package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.TestBase;
import Pages.LoginPage;

public class SoftAssertionTest extends TestBase  {
	LoginPage login;
	@BeforeMethod
	public void setup() throws Throwable
	{
		initalization();
		login = new LoginPage();
	//	login.loginZerodhaApp();
	}
	
	@Test(enabled = false)
	public void hardasserion()
	{
		String expected = "Kite - Zerodha's fast and elegant flagship trading platform";
		String actual = login.verifyAppTitle();
		Assert.assertEquals(actual, expected);
		System.out.println("this is correct");
		Assert.assertEquals("java", "java1");
		System.out.println("this is print");
		// when test case is failed then hard assertion it print message  
		
	}
	
	@Test
	public void softassertion()
	{
		String expected = "Login to Kite";
		String actual = login.verifyKiteLabel();
		SoftAssert s = new SoftAssert();
		Assert.assertEquals(expected, actual);
		System.out.println("this is actual");
		Assert.assertEquals(201, 201,"check if it is failed");
		System.out.println("this is print statement");
		s.assertAll();
	}
	
	@AfterMethod
	public void exit()
	{
		driver.close();
	}

}
