package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)d;
		//js.scroll up(
		WebElement ele=d.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[9]/div/div[1]/div"));
		js.executeAsyncScript("argumenst[0].scrollIntoView()",ele);
		

	}

}
