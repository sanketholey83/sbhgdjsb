package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class OrderPage extends TestBase {
	
	//  object Repositary
	
	@FindBy(xpath="//span[text()='Orders']") private WebElement OderOption;
    @FindBy(xpath="//span[text()='GTT']") private WebElement GTTOption;
    @FindBy(xpath="//span[text()='Baskets']") private WebElement BasketOption;
    @FindBy(xpath="//span[text()='SIP']") private WebElement SIPOption;
    @FindBy(xpath="//span[text()='Alerts']") private WebElement AlertOption;
    @FindBy(xpath="//span[text()='IPO']") private WebElement IOPOption;
    
    public OrderPage()
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void ClickOnOrder() throws Throwable
    {
    	Thread.sleep(2000);
    	OderOption.click();
    }
    
    public void clickOnGTT() throws Throwable
    {
    	Thread.sleep(1000);
    	GTTOption.click();
    }
    
    public void clickOnBasket() throws Throwable
    {
    	Thread.sleep(1000);
    	BasketOption.click();
    }
    
    public void clickOnSIP() throws Throwable
    {
    	Thread.sleep(1000);
    	SIPOption.click();
    }
    
    public void clickOnAlert() throws Throwable
    {
    	Thread.sleep(1000);
    	AlertOption.click();
    }
    
    public void clickOnIOP() throws Throwable
    {
    	Thread.sleep(1000);
    	IOPOption.click();
    }
}
