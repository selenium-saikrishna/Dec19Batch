package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalanderWebtable {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
	}
	@Test
	public void calanderTest()
	{
		driver.findElement(By.id("OneWay")).click();
		driver.findElement(By.id("FromTag")).sendKeys("Hyderabad, IN - Rajiv Gandhi International (HYD)");
		driver.findElement(By.id("ToTag")).sendKeys("Islamabad, PK - Islamabad (ISB)");
		driver.findElement(By.xpath("//*[@id='ORtrip']/section[2]/div[1]/dl/dd/div/a/i")).click();
		
		String doj="10/01/2019";
		String[] a=doj.split("/");
		
		String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
		int x=Integer.parseInt(a[1]);
		
		String month=months	[x-1];
		String day=a[0];
		String year=a[2];
		String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while(!calyear.equals(year) )
		{
			
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
			Sleeper.sleepTightInSeconds(1);
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
			System.out.println(driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).getAttribute("class"));
			if(driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).getAttribute("class").equals("nextMonth disabled"))
				break;
		}
		
		String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!calmonth.equals(month) )
		{
			System.out.println(calmonth);
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
			if(driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).getAttribute("class").equals("nextMonth disabled"))
				break;
			
			
			
		}
		System.out.println("ABC");
		if(!calmonth.equals(month) )
		{
			tableNav("//*[@id='ui-datepicker-div']/div[2]/table",day);
		}
		else
		{
			tableNav("//*[@id='ui-datepicker-div']/div[1]/table",day);
		}
		
		
		
		driver.findElement(By.id("SearchBtn")).click();
		
	}
	public void tableNav(String xpath,String day)
	{
		WebElement calander=driver.findElement(By.xpath(xpath));
		List<WebElement> rows=calander.findElements(By.tagName("tr"));
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++)
			{
				if(cols.get(j).getText().equals(day))
				{
					cols.get(j).click();
					break;
					
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
