package pack4;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String x;
		System.out.println("enter the browser name: ");
		x=sc.next();
		sc.close();
		switch(x)
		{
			
		case"chrome":
				System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
				ChromeDriver d=new ChromeDriver();
				d.get("https://www.timeanddate.com/worldclock/");
				d.manage().window().maximize();
				break;
			
		case"firefox":
				FirefoxDriver d1=new FirefoxDriver();
				d1.get("https://www.google.co.in/");
				d1.manage().window().maximize();
				WebElement link=d1.findElement(By.linkText("Gmail"));
				Actions act=new Actions(d1);
				act.contextClick(link).sendKeys("L").build().perform();
				break;
			
		default:
				System.out.println("invalid browser");
		}
				
		

	}

}
