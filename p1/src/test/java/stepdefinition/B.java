package stepdefinition;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class B {
	WebDriver d;
	
	@Given("user opens newtours website")
	public void user_opens_newtours_website() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
	  
	}

	@When("user need to click register link")
	public void user_need_to_click_register_link() throws InterruptedException {
		
		d.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(2000);
		
	    
	}

	@Then("user needs to get country name from dropdown")
	public void user_needs_to_get_country_name_from_dropdown() throws IOException {
	    FileInputStream f=new FileInputStream("D://d.xlsx");
	    XSSFWorkbook wb=new XSSFWorkbook(f);
	    XSSFSheet ws=wb.getSheet("Sheet1");
	    Row r=null;
	    Cell c=null;
		WebElement a=d.findElement(By.name("country"));
	    List<WebElement> c1=a.findElements(By.tagName("option"));
	    		System.out.println(c1.size());
	    for(int i=0; i<c1.size(); i++)
	    {
	    	System.out.println(c1.get(i).getText());
	    	r=ws.createRow(0);
	    	//r.createCell(0).setcellValue(String(i+1))
	    	r.createCell(0).setCellValue(c1.get(i).getText());
	    	c1.get(i).click();
	    	if(!c1.get(i).isSelected())
	    	{
	    		r.createCell(1).setCellValue("fail");
	    		
	    	}
	    }
	    FileOutputStream f1=new FileOutputStream("D://d.xlsx");
	    wb.write(f1);
	    f1.close();
	    		
	}

	@And("user is navigated back to home page")
	public void user_is_navigated_back_to_home_page() {
	    d.navigate().back();
	}
	
	@And("user close the browser")
	public void user_close_the_browser() {
		d.close();
	   
	}

}
