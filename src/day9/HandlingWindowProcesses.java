package day9;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.os.WindowsUtils;

public class HandlingWindowProcesses {

	
	public static void main(String[] args) {
		WindowsUtils.killByName("notepad.exe");
		WindowsUtils.killByName("firefox.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.close();
		WindowsUtils.killByName("eclipse.exe");

	}

}









