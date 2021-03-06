package day15;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FluentWaitExample {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://hotstar.com");
	}

	@Test
	public void waitTest()
	{
		FluentWait<WebDriver> fwait=new FluentWait<WebDriver>(driver)
				                        .withTimeout(60,TimeUnit.SECONDS)
				                        .pollingEvery(2,TimeUnit.SECONDS)
				                        .ignoring(NoSuchElementException.class);
		fwait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='myCarouselId']/div/article[1]/div[1]/div/div[1]/div")));
		fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myCarouselId']/div/article[2]/div[1]/div/div[1]/div"))).click();
	}

}
