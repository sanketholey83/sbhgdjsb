package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;

public class Holdings_page extends TestBase {

	@FindBy(xpath="//span[text()='Holdings']") private WebElement HoldingOption;
	@FindBy(xpath="//span[@class='holdings-selector-wrap']") private WebElement DropDown;
	
	
	public Holdings_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnHolding() throws Throwable
	{
		Thread.sleep(2000);
		HoldingOption.click();
	}
	
	public void dropdown() throws Throwable
	{
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.moveToElement(DropDown).build().perform();
		for(int i=0;i<3;i++)
		{
			Thread.sleep(1000);
			act.sendKeys(Keys.DOWN).build().perform();
		}
		act.sendKeys(Keys.ENTER).click();

	}
		
	}
	
	

