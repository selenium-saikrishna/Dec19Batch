package day25;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import day24.LoginKeywords;

public class LoginUsingKeywords {
	@Test
	public void loginTest() throws IOException
	{
		LoginKeywords keys=new LoginKeywords();
		FileInputStream file=new FileInputStream(".\\src\\com\\projectname\\keywords\\LoginKeywords.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("Sheet1");
		int rowCount=ws.getLastRowNum();
		for(int i=1;i<=rowCount;i++)
		{
			Row r=ws.getRow(i);
			String runMode=r.getCell(4).getStringCellValue();
			if(runMode.equals("Y"))
			{
				String keyword=r.getCell(3).getStringCellValue();
				if(keyword.contains("launchBrowser"))
					keys.launchBrowser();
				else if(keyword.equals("navigate"))
					keys.navigate();
				else if(keyword.equals("enterUsername"))
					keys.enterUsername();
				else if(keyword.equals("enterPassword"))
					keys.enterPassword();
				else if(keyword.equals("clickLogin"))
					keys.clickLogin();
						
				
			}
		}
	
	}

}
