package day20;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TabandPopupHandling {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://bing.com");
	}
	@Test
	public void windowTest()
	{
		driver.findElement(By.linkText("Help")).click();
		Sleeper.sleepTightInSeconds(10);
		switchWindow("//*[@id='privacyLabel']");
		switchWindow("//*[@id='mainotherimportantprivacyinformationmodule_ShortDescription']/label/p/a");
		
	}
	
	public void switchWindow(String x)
	{
		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> it=windowids.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			try
			{
				driver.findElement(By.xpath(x)).click();
				break;
			}
			catch(Exception e)
			{
				
			}
		}
		
		
	}

}
