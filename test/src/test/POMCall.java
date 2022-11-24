package test;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class POMCall {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		String baseurl="https://demo.guru99.com/test/newtours/";
		d.get(baseurl);
		d.manage().window().maximize();
		
		POM a1=new POM(d);
		a1.username();
		a1.password();
		a1.Link();
		a1.screenshot();
		a1.cont();
		

	}

}
