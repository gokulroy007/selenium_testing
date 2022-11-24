package Package_Ne;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class CallingM {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Demo m=new Demo();
		FileInputStream f=new FileInputStream("D://keys.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet w=wb.getSheet("Sheet1");
		Row r=null;
		Cell c=null;
		Iterator<Row> row=w.iterator();
		while(row.hasNext())
		{
			r=row.next();
			c=r.getCell(2);
			String s1=c.getCellValue();
			if(s1.equals("opning_Browser"))
			{
				m.opening_Browser();
			}
			else if(s1.equals("navigate"))
			{
				m.navigate();
			}
			else if(s1.equals("uname"))
			{
				m.uname();
			}
			else if(s1.equals("password"))
			{
				m.password();
			}
			else if(s1.equals("click"))
			{
				m.click();
			}
			else
				m.close();
		}
		

	}

}
