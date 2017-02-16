package day29;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginUisngDataProvider {
	
	@DataProvider(parallel=true)
	public Object[][] sendData()
	{
		Object[][] data=new Object[2][3];
		
		data[0][0]="sai";
		data[0][1]="krishna";
		data[0][2]="firefox";
		
		data[1][0]="sai";
		data[1][1]="krishna";
		data[1][2]="chrome";
		
		return data;
		
		
		
	}
	
	@Test(dataProvider="sendData")
	public void loginTest(String u,String p,String b) throws MalformedURLException
	{
		DesiredCapabilities cap=null;
		if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(b.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
		}
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("http://opensource.demo.orangehrmlive.com/");
		Sleeper.sleepTightInSeconds(8);
		driver.findElement(By.id("txtUsername")).sendKeys(u);
		driver.findElement(By.id("txtPassword")).sendKeys(p);
		driver.findElement(By.id("btnLogin")).click();
	}
	
	
	
	
	

}
