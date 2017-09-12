package hybridframe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Common {
	public static String navigate_to(WebDriver driver, String url) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		return null;
		
	}
public static String sendkeys(WebDriver driver,String strloctype,String strlocvalue, String Param) throws InterruptedException {
	
	switch(strloctype)
	{
	
	case "id":
	driver.findElement(By.id(strlocvalue)).sendKeys(Param);
	break;
	case "xpath":
	driver.findElement(By.xpath(strlocvalue)).sendKeys(Param);
	case "linktext":
	driver.findElement(By.linkText(strlocvalue)).sendKeys(Param);	
	}
Thread.sleep(5000);	
	return null;
	
}
	
public static String click_element(WebDriver driver,String strloctype,String strlocvalue) throws InterruptedException {
	
	switch(strloctype)
	{
	
	case "id":
	driver.findElement(By.id(strlocvalue)).click();
	break;
	case "xpath":
	driver.findElement(By.xpath(strlocvalue)).click();
	break;
	case "linktext":
	driver.findElement(By.linkText(strlocvalue)).click();
	break;
	}
	Thread.sleep(5000);
	return null;	
	
}

public static void quit_driver(WebDriver driver) {
driver.quit();
}
public static String[][] apachefor(String path) throws IOException{
	
//File src=new File("D:\\exceldata.xlsx");
File src=new File(path);
	
	FileInputStream fis=new FileInputStream(src);
	
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	
	XSSFSheet sheet1=wb.getSheetAt(0);
	
	int rownum = sheet1.getLastRowNum()+1;
	System.out.println(rownum);
	int colnum= sheet1.getRow(0).getLastCellNum();
	System.out.println(colnum);
	String[][] data= new String[rownum][colnum];
	for(int i=0;i<rownum;i++) {
		XSSFRow row =sheet1.getRow(i);
		for(int j=0;j<colnum;j++) {
			XSSFCell cell =row.getCell(j);
//			System.out.println(cell);
//			String value=celltostring(cell);
			data[i][j]=cell.toString();
			
		}
	}
	wb.close();
	fis.close();
	return data;
}

public static String celltostring(XSSFCell cell) {
	String str=null;
	String type;
	Object result;
	
	if(cell==null)
	{
		str="";
	}
	else {
		str=null;

		}		
	return str;
}
}
