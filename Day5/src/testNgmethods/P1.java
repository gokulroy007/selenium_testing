package testNgmethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class P1 {
	WebDriver d;
  @Test(priority=1)
  public void opening_browser() 
  {
	  System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	  d=new ChromeDriver();
	  d.get("https://www.amazon.in/");
	  d.manage().window().maximize();
  }
  @Test(priority=2)
  public void get_title()
  {
	  System.out.println(d.getTitle());
  }
  @Test(priority=3)
  public void get_current_url()
  {
	  System.out.println(d.getCurrentUrl());
  }
  @Test(priority=4)
  public void screenshot() throws IOException
  {
	  File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			  FileUtils.copyFile(src, new File("D://ca1.png"));
  }
  @Test(priority=5)
  public void close()
  {
	  d.close();
  }
}
