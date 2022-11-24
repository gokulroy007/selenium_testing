package polymorphism;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
class Poly1
{
ChromeDriver d;
public void login()
{
	System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	d=new ChromeDriver();
}
public void login(String a)
{
	
	d.get(a);
	d.manage().window().maximize();
}
public void login(String username, String pass)
{
	d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys(username);
	d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")).sendKeys(pass);
	d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly1 a1=new Poly1();
		a1.login();
		a1.login("https://demo.guru99.com/test/newtours/");
		a1.login("roys", "123");
		
		

	}

}
