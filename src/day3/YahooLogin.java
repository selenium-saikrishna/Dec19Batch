package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class YahooLogin 
{
	
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://yahoomail.com");
		driver.findElement(By.id("login-username")).sendKeys("saikrishna_rhce");
		driver.findElement(By.id("login-signin")).click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.id("login-passwd")).sendKeys("asdfg");
		driver.findElement(By.id("login-signin")).click();

	}

}









