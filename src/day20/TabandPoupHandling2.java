package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TabandPoupHandling2 {
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
		String attribute=driver.findElement(By.linkText("Help")).getAttribute("target");
		if(attribute.equals("_blank"))
		{
			String url=driver.findElement(By.linkText("Help")).getAttribute("href");
			driver.get(url);
			
		}
		else
		{
			driver.findElement(By.linkText("Help")).click();
		}
		driver.findElement(By.xpath("//*[@id='privacyLabel']")).click();
		
	}

}
