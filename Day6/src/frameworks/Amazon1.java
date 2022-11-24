package frameworks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("D://b.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("sheet1");
		Row r=null;
		Cell c=null;
		String baseurl="https://demo.guru99.com/test/newtours/";
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get(baseurl);
		d.manage().window().maximize();
		WebElement d1=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
		List<WebElement> d2=d1.findElements(By.tagName("a"));
		System.out.println(d2.size());
		
		for(int i=0; i<d2.size(); i++)
		{
			System.out.println(d2.get(i).getText());
			r=ws.createRow(i);
			r.createCell(0).setCellValue(d2.get(i).getText());
			d2.get(i);
			if(!d2.get(i).isSelected())
			{
				r.createCell(1).setCellValue("fail");
				
			}
			else
			{
				r.createCell(1).setCellValue("pass");
			  }
		}
		
		FileOutputStream f2=new FileOutputStream("D://b.xlsx");
         wb.write(f2);
         f2.close();
	}
		

}

