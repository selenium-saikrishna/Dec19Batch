package day30.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours {
	@FindBy(name="userName")
	WebElement userName;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="login")
	WebElement signin;
	public void findAFlight(String userName,String password)
	{
		this.userName.sendKeys(userName);
		this.password.sendKeys(password);
		signin.click();
	}

	
	@FindBy(linkText="your destination")
	WebElement yourDestinations;
	public void destinations()
	{
		yourDestinations.click();
	}
	
	@FindBy(linkText="featured vacation destinations")
	WebElement f_w_destinations;
	public void vacations()
	{
		f_w_destinations.click();
	}
	
	@FindBy(linkText="Register here")
	WebElement registerHere;
	public void register()
	{
		registerHere.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
