package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallerTesting {
	 WebDriver driver = new ChromeDriver();
	 @Test
	public void opengoogle()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Desktop\\javafullcourse\\frame87\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.close();
	}
	 @Test
	public void openfb()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Desktop\\javafullcourse\\frame87\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.close();
	}
	 @Test
	public void openflipkart()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Desktop\\javafullcourse\\frame87\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.close();
	}
	 @Test
	public void openyoutube()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Desktop\\javafullcourse\\frame87\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.close();
	}

}
