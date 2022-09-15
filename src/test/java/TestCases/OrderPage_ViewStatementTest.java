package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Pages.OrderPage;
import Pages.OrderPage_ViewStatement;

public class OrderPage_ViewStatementTest extends TestBase{
	LoginPage login;
	OrderPage_ViewStatement click;
	OrderPage order;
	
	@BeforeMethod
	public void setup() throws Throwable
	{
		initalization();
		login = new LoginPage();
		login.loginZerodhaApp();
		click = new OrderPage_ViewStatement();
		order = new OrderPage();
		order.ClickOnOrder();
	
		
	}
	@Test
	public void VerifyViewStatementTest() throws Exception
	{
		click.VerifyViewStatement();
		
	}
	
	@AfterMethod
	public void exit()
	{
		
		driver.close();
	}

}
