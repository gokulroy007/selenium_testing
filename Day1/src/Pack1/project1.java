package Pack1;

import org.openqa.selenium.chrome.ChromeDriver;

public class project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_nxqtetlae_e&adgrpid=60571832564&hvpone=&hvptwo=&hvadid=486453138860&hvpos=&hvnetw=g&hvrand=2039985118948697050&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302457&hvtargid=kwd-296458789801&hydadcr=14452_2154371&gclid=EAIaIQobChMIk9frl46W-wIVxJ1LBR06xAajEAAYASAAEgIcOfD_BwE");
        d.manage().window().maximize();
		System.out.println(d.getTitle());
        System.out.println(d.getCurrentUrl());
        d.close();
	}

}
