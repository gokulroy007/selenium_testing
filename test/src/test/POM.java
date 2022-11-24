package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM {

		WebDriver d;
		By username=By.name("userName");
		By password=By.name("password");
		By Link=By.linkText("REGISTER");
		
		POM(WebDriver d)
		{
			this.d=d;
		}
		
		public void username()
		{
			d.findElement(username).sendKeys("roys");
		}
		
		public void password()
		{
			d.findElement(password).sendKeys("123");
		}
		
		public void Link() throws InterruptedException
		{
			d.findElement(Link).click();
			Thread.sleep(2000);
		}
		
		public void screenshot() throws IOException
		{
			File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			  FileUtils.copyFile(src, new File("D://zz.png"));
		}
		
		public void cont() throws IOException
		{
			FileInputStream f=new FileInputStream("D://d.xlsx");
		    XSSFWorkbook wb=new XSSFWorkbook(f);
		    XSSFSheet ws=wb.getSheet("Sheet1");
		    Row r=null;
		    Cell c=null;
		    WebElement drop=d.findElement(By.name("country"));
			List<WebElement> drop1=drop.findElements(By.tagName("option"));
			System.out.println(drop1.size());
			
			for(int i=0; i<drop1.size(); i++)
			{
				System.out.println(drop1.get(i).getText());
				r=ws.createRow(i);
				r.createCell(0).setCellValue(drop1.get(i).getText());
				drop1.get(i).click();
				
			}
			
			FileOutputStream f2=new FileOutputStream("D://d.xlsx");
	         wb.write(f2);
	         f2.close();
	        
		}

}
