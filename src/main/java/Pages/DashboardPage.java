package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class DashboardPage extends TestBase {
	
	// object Repositary
	
	@FindBy(xpath="//span[@class='nickname']") WebElement Nickname;
	@FindBy(xpath="//span[@class='user-id']") WebElement UserId;
	@FindBy(xpath="//img[@alt='Kite logo']") WebElement DashBoardLogo;
	@FindBy(xpath="//h4[@class='username']") WebElement Username;
	@FindBy(xpath="//div[@class='dropdown-nav layer-2']") WebElement DropdownBox;
	@FindBy(xpath="//a[@target='_self']") WebElement Logout;
	@FindBy(xpath="//div[@class='email']") WebElement Email;
	
	public  DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyName() throws Throwable
	{
		Thread.sleep(1000);
		return Nickname.getText();
	}
	
	public boolean VerifyLogo() throws Throwable
	{
		Thread.sleep(1000);
		return DashBoardLogo.isDisplayed();
	}
	public void VerifyListBox() throws Throwable
	{
		Thread.sleep(2000);
		UserId.click();
		
		
	}
	
	public String VerifyUserID() throws Throwable
	{
		Thread.sleep(2000);
		return UserId.getText();
	}
	
	public String VerifyUserName() throws Throwable
	{
		Thread.sleep(2000);
		return Username.getText();
	}
	
	public void VerifyLogout()
	{
		Logout.click();
	}
	
	public String Verifyemail()
	{
		return Email.getText();
	}
	
	

}
