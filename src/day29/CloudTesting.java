package day29;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CloudTesting {
	@Parameters("browser")
	@Test
	public void dropdownTest(String b) throws MalformedURLException
	{
		DesiredCapabilities caps=null;
		if(b.equals("edge"))
		{
			caps = DesiredCapabilities.edge();
			caps.setCapability("platform", "Windows 10");
			caps.setCapability("version", "14.14393");
		}
		else if(b.equals("firefox"))
		{
			caps = DesiredCapabilities.firefox();
			caps.setCapability("platform", "Linux");
			caps.setCapability("version", "45.0");
		}
		else if(b.equals("safari"))
		{
			caps = DesiredCapabilities.safari();
			caps.setCapability("platform", "macOS 10.12");
			caps.setCapability("version", "10.0");
		}
		
		String username="softqcloud";
		String accesskey="5dbb6fc1-bb88-4d5b-b3cc-4ba8b360263b";
		String URL = "https://" + username + ":" + accesskey + "@ondemand.saucelabs.com:443/wd/hub";
		
		RemoteWebDriver  driver = new RemoteWebDriver(new URL(URL), caps);
		
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement drop=driver.findElement(By.name("count"));
		List<WebElement> dropdown=drop.findElements(By.tagName("option"));
		System.out.println(dropdown.size());
		for(int i=0;i<dropdown.size();i++)
		{
			dropdown.get(i).click();
			if(dropdown.get(i).isSelected())
			{
				System.out.println(dropdown.get(i).getText()+" is active");
			}
			else
			{
				System.out.println(dropdown.get(i).getText()+" is inactive");
			}
		}
		
		
	}

}
