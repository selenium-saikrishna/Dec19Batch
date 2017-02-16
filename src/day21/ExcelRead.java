package day21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Sai\\Desktop\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		int sheetCount=wb.getNumberOfSheets();
		for(int k=1;k<=sheetCount;k++)
		{
			XSSFSheet ws=wb.getSheet("Sheet"+k);
			System.out.println("This is for sheet"+k);
			int rowCount=ws.getLastRowNum();
			for(int i=0;i<=rowCount;i++)
			{
				Row r=ws.getRow(i);
				int colCount=r.getLastCellNum();
				for(int j=0;j<colCount;j++)
				{
					System.out.print(r.getCell(j).getStringCellValue()+"    ");
				}
				System.out.println();
			}
		}
	}
}
