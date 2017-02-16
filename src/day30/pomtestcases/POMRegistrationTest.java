package day30.pomtestcases;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import day30.pom.LeftMenu;
import day30.pom.RegisterMercuryTours;
import day30.pom.WelcomeMercuryTours;

public class POMRegistrationTest {
	@Test
	public void registrationTest()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		WelcomeMercuryTours wmPage=PageFactory.initElements
				                                   (driver,WelcomeMercuryTours.class);
		LeftMenu leftMenuPage=PageFactory.initElements
				                                              (driver,LeftMenu.class);
		RegisterMercuryTours rmPage=PageFactory.initElements
				                                  (driver,RegisterMercuryTours.class);
		
		wmPage.register();
		rmPage.register();
		leftMenuPage.home();
		wmPage.findAFlight("tutorial","tutorial");
		
		
		
	}

}





