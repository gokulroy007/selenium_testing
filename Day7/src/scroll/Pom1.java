package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pom1 {
	WebDriver d;
	By fname=By.name("firstName");
	By lname=By.name("lastName");
	By phone=By.name("phone");
	By uname=By.name("userName");
	By cont=By.name("country");
	
	Pom1(WebDriver d)
	{
		this.d=d;
	}
	
	public void fname()
	{
		d.findElement(fname).sendKeys("testing123");
	}
	
	public void lname()
	{
		d.findElement(lname).sendKeys("testing");
	}
	
	public void phone()
	{
		d.findElement(phone).sendKeys("9347733633");
	}
	
	public void uname()
	{
		d.findElement(uname).sendKeys("testing9001");
	}

	public void cont()
	{
		d.findElement(cont).sendKeys("INDIA");
	}
}
