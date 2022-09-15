package Pages;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class ByStock extends TestBase {
	
	// object Repositary
	
	@FindBy(xpath="//span[text()='GOLDBEES']") private WebElement Stock;
	@FindBy(xpath="//button[@class='button-blue buy']") private WebElement BuyButton;
	@FindBy(xpath="//span[text()='HDFCBANK']") private WebElement HDFCstock;
	@FindBy(xpath="//span[text()='HINDUNILVR']") private WebElement HINDUstock;
	@FindBy(xpath="//span[text()='INFY']") private WebElement INFYstock;
	@FindBy(xpath="//span[text()='ONGC']") private WebElement ONGCstock;
	@FindBy(xpath="//button[@type='submit']") private WebElement ByButt;
	@FindBy(xpath="//input[@autofocus='autofocus']") private WebElement QuantityPrice;
	@FindBy(xpath="//input[@label='Price']") private WebElement Price;
	@FindBy(xpath="//label[text()='SL']") private WebElement StopLoss;
	@FindBy(xpath="//input[@label='Trigger price']") private WebElement TriggerPrice;
	@FindBy(xpath="//span[text()='More options ']") private WebElement MoreOption;
	@FindBy(xpath="//input[@label='Disclosed qty.']") private WebElement DiscloseQty;
	@FindBy(xpath="//label[@class='su-switch-control']") private WebElement Switchbutton;
	@FindBy(xpath="//a[@class='button button-blue']") private WebElement Active;
	@FindBy(xpath="//span[text()='Dashboard']") private WebElement dashboardchild;
	
	public ByStock()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnByStock() throws Throwable 
	{
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.moveToElement(Stock).build().perform();
		BuyButton.click();
		QuantityPrice.clear();
		QuantityPrice.sendKeys("100");
		Thread.sleep(1000);
		Price.clear();
		Thread.sleep(1000);
		Price.sendKeys("46.00");
		Thread.sleep(1000);
		StopLoss.click();
		Thread.sleep(2000);
		TriggerPrice.click();
		TriggerPrice.clear();
		Thread.sleep(1000);
		TriggerPrice.sendKeys("45.90");
		Thread.sleep(1000);
		MoreOption.click();
		Thread.sleep(2000);
		DiscloseQty.clear();
		Thread.sleep(1000);
		DiscloseQty.sendKeys("50");
		Thread.sleep(1000);
		for(int i=0;i<20;i++)
		{
			Switchbutton.click();
		}
	//	Switchbutton.click();
		Thread.sleep(3000);
		act.moveToElement(ByButt).build().perform();
		ByButt.click();
	}
	
	public void clickOnByHDFCstock() throws Throwable 
	{
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.moveToElement(HDFCstock).build().perform();
		BuyButton.click();
	}
	
	public void clickOnByHINDUstock() throws Throwable 
	{
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.moveToElement(HINDUstock).build().perform();
		BuyButton.click();
	}
	
	public void clickOnByINFYstock() throws Throwable 
	{
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.moveToElement(INFYstock).build().perform();
		BuyButton.click();
	}
	
	public void clickOnByONGCstock() throws Throwable 
	{
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.moveToElement(ONGCstock).build().perform();
		BuyButton.click();
	}
	
	public void clickonActiveButton() throws Exception 
	{
		Thread.sleep(5000);
		Active.click();
		Actions ac = new Actions(driver);
		Set<String> windows = driver.getWindowHandles();
		java.util.Iterator<String> itr = windows.iterator();
		String[] str = new String[4];
		driver.switchTo().window(str[0]);
		Thread.sleep(1000);
		dashboardchild.click();
		Thread.sleep(1000);
		driver.close();
		Thread.sleep(1000);
		driver.switchTo().window(str[1]);
		driver.close();
		
	}

}
