package day25;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import day24.LoginKeywords;

public class LoginUsingReflections {
	LoginKeywords keys=new LoginKeywords();
	Method[] mymethods=keys.getClass().getMethods();
	
	@Test
	public void loginTest() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException
	{
	
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
			invokeActions(keyword);
		}
	}
	}
	
	public void invokeActions(String keyword) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		for(int i=0;i<mymethods.length;i++)
		{
			if(mymethods[i].getName().equals(keyword))
			{
				mymethods[i].invoke(keys);
				break;
			}
		}
	}
	
	
	
	
	
	

}
