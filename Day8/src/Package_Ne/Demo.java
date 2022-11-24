package Package_Ne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	static WebDriver d;
	public  Demo(WebDriver d)
	{
		this.d=d;
	}
	public void opening_browser()
	{
		System.setProperty("webdriver.chrome.driver", "C://choromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		
	}
	
	public void navigate()
	{
		d.manage().window().maximize();
	}
	
	public void uname()
	{
		d.findElement(By.name("userName")).sendKeys("roys");
		
	}
	
	public void password()
	{
		d.findElement(By.name("password")).sendKeys("123");
	}
	
	public void click()
	{
		d.findElement(By.name("submit")).click();	
	}
	
	public void close()
	{
		d.close();
	}
	
	

}
