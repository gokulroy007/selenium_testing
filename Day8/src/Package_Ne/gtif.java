package Package_Ne;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class gtif {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		String baseurl="https:\\www.google.com";
		String nodeurl="http://localhost:4444/wd/hub";
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		WebDriver d=new RemoteWebDriver(new URL(nodeurl),cap);
		//working on google page through web driver
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		d=new ChromeDriver();
		d.get(baseurl);
		d.manage().window().maximize();
		d.findElement(By.name("q")).sendKeys("manual testing");
		Thread.sleep(2000);
		d.findElement(By.name("btnK")).click();
		d.close();

	}

}