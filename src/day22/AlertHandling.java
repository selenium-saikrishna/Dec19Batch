package day22;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AlertHandling {

	static FirefoxDriver driver;
	public static void main(String[] args) {
		 driver=new FirefoxDriver();
		driver.get("http://google.com");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('Hello Selenium');");
		Sleeper.sleepTightInSeconds(3);
		alertHandle();
			
	}
	public static void alertHandle()
	{
		try
		{
			Alert myAlert=driver.switchTo().alert();
			myAlert.accept();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
