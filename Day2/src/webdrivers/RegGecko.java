package webdrivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class RegGecko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "c://geckodriver");
		FirefoxDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		d.get("https://www.tutorialspoint.com/index.htm");
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.close();

	}

}
