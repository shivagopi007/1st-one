package utlity;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;



public class Datafromexcel {
	
	WebDriver driver;
	  FileInputStream fis;
		XSSFWorkbook   wb;
	 	 XSSFSheet     sheet;
	      XSSFRow     row;
	       XSSFCell  cell;
	        String   path;
	public Datafromexcel(String path) {
		this.path=path;
		
	}

        public int getRow(String sheetname) throws IOException {
        	fis =new  FileInputStream(path);
        	wb=new XSSFWorkbook(fis);
        	sheet=wb.getSheet(sheetname);
        	int ro=sheet.getLastRowNum();
        	wb.close();
        	fis.close();
			return ro;
        	
        	
        }
        public int getcell(String sheetname,int rownum) throws IOException {
        	fis =new  FileInputStream(path);
        	wb=new XSSFWorkbook(fis);
        	sheet=wb.getSheet(sheetname);
        	row=sheet.getRow(rownum);
        	int com=row.getLastCellNum();
        	wb.close();
        	fis.close();
        	return com;
        	
        }
public String getvalues(String sheetname) throws IOException {
	fis =new  FileInputStream(path);
	wb=new XSSFWorkbook(fis);
	sheet=wb.getSheet(sheetname);
	String getvalues=sheet.getRow(0).getCell(0).getStringCellValue();
	return getvalues;
	
}
       
        	
        
        public String getdata(String sheetname,int rownum,int colnum) throws IOException {
        	fis =new  FileInputStream(path);
        	wb=new XSSFWorkbook(fis);
        	sheet=wb.getSheet(sheetname);
        	row=sheet.getRow(rownum);
        	cell=row.getCell(colnum);
        	String data=cell.getStringCellValue();
        	wb.close();
        	fis.close();
        	return data;
        	
        }
        


	
	
}
