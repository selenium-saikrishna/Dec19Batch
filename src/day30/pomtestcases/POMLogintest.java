package day30.pomtestcases;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import day30.pom.WelcomeMercuryTours;

public class POMLogintest {
	
	@Test
	public void loginTest()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		//creating object for page class
		WelcomeMercuryTours wmPage=PageFactory.initElements
				                                   (driver,WelcomeMercuryTours.class);
		
		wmPage.findAFlight("Admin","admin");
	}

}
