package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class CaptchaAutomation {

	
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		int z=1;
		while(z<10)
		{
			driver.get("http://www.harvard.edu/feedback");
			driver.findElement(By.id("edit-submitted-name")).sendKeys("tester");
			driver.findElement(By.id("edit-submitted-email")).sendKeys("tester@gmail.com");
			driver.findElement(By.id("edit-submitted-comment")).sendKeys("Stupid chang etha capthca");
			String x=driver.findElement(By.className("field-prefix")).getText();
			String [] a=x.split(" ");
			int i=Integer.parseInt(a[0]);
			int j=Integer.parseInt(a[2]);
			int k=i+j;
			String str=Integer.toString(k);
			driver.findElement(By.id("edit-captcha-response")).sendKeys(str);
			Sleeper.sleepTightInSeconds(5);
			//driver.findElement(By.xpath("//*[@id='webform-client-form-1884']/div/div[5]/input")).click();
		}
		
		

	}

}
