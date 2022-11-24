package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alt3 {
	
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

    
    public void prompt_window()
    {
    	d.findElement(By.id("promtButton")).click();
    	Alert alt=d.switchTo().alert();
    	System.out.println(alt.getText());
    	//Thread.sleep(2000);
    	alt.sendKeys("Welcome to Selenium");
    	alt.accept();
    	WebElement w1=d.findElement(By.id("promptResult"));
    	System.out.println(w1.getText());
    }
    
    public void close()
    {
    	d.close();
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alt3 a1=new Alt3();
		a1.open_browser();
		a1.title();
		a1.get_current_url();
		a1.prompt_window();
		a1.close();
		

	}

}
