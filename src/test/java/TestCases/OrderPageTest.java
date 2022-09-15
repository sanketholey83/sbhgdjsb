package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Pages.OrderPage;

public class OrderPageTest extends TestBase {
	LoginPage login;
	OrderPage order;
	@BeforeMethod
	public void first() throws Throwable
	{
		 initalization();
		 login = new LoginPage();
		 order = new OrderPage();
		 login.loginZerodhaApp();
	}
	
	@Test
	public void OrderOptionTest() throws Throwable
	{
		
		order.ClickOnOrder();
	}
	
	@Test
	public void BasketOptionTest() throws Throwable
	{
		order.ClickOnOrder();
		order.clickOnBasket();
	
	}
	@Test
	public void SIPOptionTest() throws Throwable
	{
	  order.ClickOnOrder();
	  order.clickOnSIP();
	}
	@Test
	public void AlertOptionTest() throws Throwable
	{
		order.ClickOnOrder();
		order.clickOnAlert();
	}
	
	@Test
	public void GTTOptionTest() throws Throwable
	{
		order.ClickOnOrder();
		order.clickOnGTT();
	}
	 @Test
	public void IOPOptionTest() throws Throwable
	{
		order.ClickOnOrder();
		order.clickOnIOP();
	}
	
	@AfterMethod
	public void last()
	{
		driver.close();
	}

}
