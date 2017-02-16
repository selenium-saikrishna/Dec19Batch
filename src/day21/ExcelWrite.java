package day21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Sai\\Desktop\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("sheet1");
		Row r=ws.getRow(0);
		r.getCell(1).setCellValue("ABC");
		
		r=ws.getRow(2);
		r.createCell(1).setCellValue("XYZ");
		
		r=ws.createRow(3);
		r.createCell(0).setCellValue("DEF");
		
		FileOutputStream  f=new FileOutputStream("c:\\users\\sai\\desktop\\Book1.xlsx");
		wb.write(f);
		

	}

}
