package day27;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class FiledownloadAutoit {

	
	public static void main(String[] args) throws IOException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://seleniumhq.org");
		driver.findElement(By.linkText("Download")).click();
		driver.findElement(By.linkText("3.0.1")).click();
		Sleeper.sleepTightInSeconds(2);
		java.lang.Runtime.getRuntime().exec("c:\\users\\sai\\desktop\\download.exe");

	}

}
