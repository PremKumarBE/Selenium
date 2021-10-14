package selenium;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.output.DeferredFileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Fileoperation {
	public static void main(String args[]) throws IOException {
		File file=new File(".//Data//maven.xls");
		//write 
		//to insert
		FileOutputStream a=new FileOutputStream(file);
		
		HSSFWorkbook wb=new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("maven");
		HSSFRow row = sheet.createRow(0);
		HSSFCell cell = row.createCell(0);
		cell.setCellValue("employee name");
		wb.write(a);
		wb.close();
		//read
		//to read
	    FileInputStream b=new FileInputStream(file);
		HSSFWorkbook wb1=new HSSFWorkbook(b);
		HSSFSheet sheet2 = wb1.getSheet("maven");
		HSSFRow row2 = sheet2.getRow(0);
		HSSFCell cell2 = row2.getCell(0);
		String stringCellValue = cell2.getStringCellValue();
		System.out.println(stringCellValue);
		wb1.close();
	}
}
	
		