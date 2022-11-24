package scroll;

import org.openqa.selenium.chrome.ChromeDriver;

public class CallPom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		String baseurl="https://demo.guru99.com/test/newtours/";
        d.get(baseurl);
        d.manage().window().maximize();
        
        Pom a1=new Pom(d);
        a1.uname();
        a1.pass();
        a1.signon();
	}

}
