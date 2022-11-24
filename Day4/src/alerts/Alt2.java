package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alt2 {
	
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

    
    public void conformation()
    {
    	d.findElement(By.id("confirmButton")).click();
    	Alert alt=d.switchTo().alert();
    	System.out.println(alt.getText());
    	//Thread.sleep(2000);
    	alt.accept();
    	WebElement text=d.findElement(By.id("confirmButton"));
    	System.out.println(text.getText());
    }
    
    public void close()
    {
    	d.close();
    }
	
    	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alt2 a1=new Alt2();
    	a1.open_browser();
    	a1.title();
    	a1.get_current_url();
    	a1.conformation();
    	a1.close();

	}

}
