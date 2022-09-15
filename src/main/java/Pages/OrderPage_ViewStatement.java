package Pages;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class OrderPage_ViewStatement extends TestBase {
	
	// object Repositary
	
	@FindBy(xpath = "//a[@class='inline-image-text']") private WebElement ViewButton;
	@FindBy(xpath = "//span[text()='Dashboard']") private WebElement ClickDashboard;
	
	
	public OrderPage_ViewStatement()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyViewStatement() throws Exception
	{
		String parenttab = driver.getWindowHandle();
	
	    Thread.sleep(2000);
	    ViewButton.click();
		for(String childtab : driver.getWindowHandles())
		{
			driver.switchTo().window(childtab);
			
		}
	
	
		
		
			
		
	}

}
