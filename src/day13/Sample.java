package day13;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	
	//setting priority
	@Test(priority=0)
	public void loginTest()
	{
		System.out.println("This is for login");
	}
	@Test(priority=1)
	public void registration()
	{
		System.out.println("this is for registration");
	}
	//Ignoring test cases
	@Test(enabled=false)
	public void logoutTest()
	{
		System.out.println("This is for logout");
	}
	
	@BeforeMethod
	public void function()
	{
		System.out.println("This is sample code");
	}

}
