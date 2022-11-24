package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
	WebDriver d;
	public void open_browser()
	{
	
	System.setProperty("webdriverchrome.driver","C://chromedriver.exe");
	ChromeDriver d=new ChromeDriver();
	d.get("https://demoqa.com/alerts");
	d.manage().window().maximize();
	}
	public void title()
	{
		System.out.println(d.getTitle());
	}
	
    public void get_current_url()
    {
    	System.out.println(d.getCurrentUrl());
    }

    
    public void alt_message() throws InterruptedException
    {
    	d.findElement(By.id("alertButton")).click();
    	Alert alt=d.switchTo().alert();
    	System.out.println(alt.getText());
    	//Thread.sleep(2000);
    	alt.accept();
    }
	
    public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    	Alert1 a1=new Alert1();
    	a1.open_browser();
    	a1.title();
    	a1.get_current_url();
    	a1.alt_message();
    }
    	
		
		
		
		
  }



