package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps  {
	
	FirefoxDriver driver;
    @Given("^orange hrm is logged in as admin$")
    public void orange_hrm_is_logged_in_as_admin() throws Throwable {
        driver=new FirefoxDriver();
        driver.get("http://opensource.demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin");
        driver.findElement(By.id("btnLogin")).click();
    }

    @When("^we enter the empinfo$")
    public void we_enter_the_empinfo(DataTable arg) throws Throwable {
    	List<List<String>> data=arg.raw();
    	for(int i=1;i<data.size();i++)
    	{
    		
    		driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b")).click();
			driver.findElement(By.id("menu_pim_addEmployee")).click();
			if(!driver.findElement(By.id("chkLogin")).isSelected())
				driver.findElement(By.id("chkLogin")).click();
    		List<WebElement> inputfields=driver.findElements(By.xpath("//input[@type='text']"));
    		for(int j=0;j<inputfields.size();j++)
    		{
    			inputfields.clear();
    		}
    		for(int k=0;k<data.get(i).size();k++)
    		{
    			driver.findElement(By.id(data.get(0).get(k))).sendKeys(data.get(i).get(k));
    		}
    		
    		driver.findElement(By.id("btnSave")).click();
    	}
    	
    }
    
    

	


	
}
