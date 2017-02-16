package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicXpaths {

	
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://yahoo.com");
		driver.findElement(By.id("UHSearchBox")).sendKeys("Selenium");
		driver.findElement(By.xpath("//*[starts-with(@id,'yui_3_12_0_3_148351')]/li[1]/a")).click();
		

	}

}
