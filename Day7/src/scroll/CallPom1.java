package scroll;

import org.openqa.selenium.chrome.ChromeDriver;

public class CallPom1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		String baseurl="https://demo.guru99.com/test/newtours/register.php";
		d.get(baseurl);
		d.manage().window().maximize();
		
		Pom1 a1=new Pom1(d);
		a1.fname();
		a1.lname();
		a1.phone();
		a1.uname();
		a1.cont();

	}

}
