package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {
	WebDriver d;
	
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://itera-qa.azurewebsites.net/");
		d.manage().window().maximize();
	}
	
	public void signup()
	{
		d.findElement(By.linkText("Sign Up")).click();
	}
	
	public void details()
	{
		d.findElement(By.id("FirstName")).sendKeys("Gokul");
		d.findElement(By.id("Surname")).sendKeys("dasari");
		d.findElement(By.id("E_post")).sendKeys("12634");
		d.findElement(By.id("Mobile")).sendKeys("1234567890");
		d.findElement(By.id("Username")).sendKeys("vec542");
		d.findElement(By.id("Password")).sendKeys("123");
		d.findElement(By.id("ConfirmPassword")).sendKeys("123");
		d.findElement(By.id("submit")).click();
		System.out.println(txt);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P1 a=new P1();
		a.openbrowser();
		a.signup();
		a.details();
		

	}

}
