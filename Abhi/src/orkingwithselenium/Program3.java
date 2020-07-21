package orkingwithselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\driver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver bo= new ChromeDriver();
		
		bo.get("https://www.youtube.com/");
		System.out.println(bo.getTitle());
		System.out.println(bo.getCurrentUrl());
		System.out.println(bo.getPageSource());
		System.out.println(bo.getWindowHandle());
		bo.close();
		
	}
	
}
