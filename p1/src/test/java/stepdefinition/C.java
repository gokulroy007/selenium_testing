package stepdefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

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

public class C {
	WebDriver d;
	
	@Given("an amzon page and opening an amazon page")
	public void an_amzon_page_and_opening_an_amazon_page() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		   
	}

	@When("page is opened")
	public void page_is_opened() {
		d.manage().window().maximize();
		WebElement drop=d.findElement(By.id("nav-xshop"));
		List<WebElement>drop1=drop.findElements(By.tagName("a"));
		System.out.println(drop1.size());
	   
	}

	@Then("capture all links")
	public void capture_all_links() throws InterruptedException, IOException {
		
		
		FileInputStream f=new FileInputStream("");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet w=wb.getSheet("sheet1");
		for(int i=0; i<drop1.size(); i++)
		{
			System.out.println(drop1.get(i).getText());
			drop1.get(i).click();
			Thread.sleep(2000);
			System.out.println(d.getTitle());
			System.out.println(d.getCurrentUrl());
			d.navigate().back();
			drop=d.findElement(By.id("nav-xshop"));
			drop1=drop.findElements(By.tagName("a"));
			
		}
		
		
	    
	}

	
	@And("close the browser")
	public void close_the_browser() {
		d.close();
		
		
	   
	}

	

}
