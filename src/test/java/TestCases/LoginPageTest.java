package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase {

	
	LoginPage login;
	@BeforeMethod
	public void setup() throws Exception
	{
	initalization();
	login = new LoginPage();
	}
	@Test(dependsOnMethods = "verifyKiteLabelTest")
	public void verifyAppTitleTest()
	{
	String expTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
	String actTitle = login.verifyAppTitle();
//	System.out.println(actTitle);
	Assert.assertEquals(actTitle,"Kite - Zerodha's fast and elegant flagship trading platform");
	}
	@Test
	public void verifyKiteLabelTest()
	{
	String expLabel = "Login to Kite";
	String actLabel = login.verifyKiteLabel();
//	System.out.println(actLabel);
	Assert.assertEquals(actLabel, expLabel);
	System.out.println("this is correct");
	}
	@Test
	public void verifyKiteLogoTest()
	{
	boolean result = login.verifyKiteLogo();
	System.out.println(result);
	}
	@Test(enabled = true)
	public void loginZerodhaAppTest() throws Throwable
	{
	login.loginZerodhaApp();
	}
	@AfterMethod
	public void exit()
	{
	driver.close();
	}
}
