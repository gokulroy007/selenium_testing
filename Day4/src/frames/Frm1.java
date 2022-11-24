package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frm1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			System.setProperty("webdriverchrome.driver","C://chromedriver.exe");
			ChromeDriver d=new ChromeDriver();
			d.get("https://demoqa.com/frames");
			d.manage().window().maximize();
			
			d.switchTo().frame("frame1");
			Thread.sleep(2000);
			WebElement text=d.findElement(By.id("sampleHeading"));
			System.out.println(text.getText());
			
			d.switchTo().frame("frame2");
			Thread.sleep(2000);
			WebElement text1=d.findElement(By.id("sampleHeading"));
			System.out.println(text1.getText());
	 
			d.close();
			
			

	}

}
