package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DashboardPage;
import Pages.LoginPage;

public class DashBoardTest extends TestBase {
	
	LoginPage login;
	DashboardPage run;
	
	@BeforeMethod
	public void first() throws Throwable
	{
		initalization();
		login = new LoginPage();
		run = new DashboardPage();
		login.loginZerodhaApp();
		
	}
	
	@Test
	public void VerifyNameTest() throws Throwable
	{
		String reslText = run.VerifyName();
		System.out.println(reslText);
	}
	
	@Test
	public void VerifyLogoTest() throws Throwable
	{
		boolean resl2 = run.VerifyLogo();
		System.out.println(resl2);
	}
	
	@Test
	public void VerifyListBoxTest() throws Throwable
	{
		run.VerifyListBox();
		
	}
	
	@Test
	public void VerifyUserID() throws Throwable
	{
		run.VerifyListBox();
		run.VerifyUserID();
	}
	
	@Test
	public void VerifyUserNameTest() throws Throwable
	{
		run.VerifyListBox();
		String resl3 = run.VerifyUserName();
		System.out.println(resl3);
	}
	
	@Test
	public void VerifyLogoutTest() throws Throwable
	{
		run.VerifyListBox();
		run.VerifyLogout();
	}
	
	@Test
	public void VerifyemailTest() throws Throwable
	{
		run.VerifyListBox();
		String resl4 = run.Verifyemail();
		System.out.println(resl4);
	}
	
	
	
	@AfterMethod
	public void exit2()
	{
		driver.close();
	}

}
