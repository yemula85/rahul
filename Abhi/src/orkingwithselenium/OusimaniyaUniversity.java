package orkingwithselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OusimaniyaUniversity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\driver\\chromedriver.exe");
		WebDriver bo= new ChromeDriver();
		
		bo.get("https://www.osmania.ac.in/");
		System.out.println(bo.getTitle());
		bo.getTitle();
		System.out.println(bo.getTitle());
		System.out.println(bo.getCurrentUrl());
		//System.out.println(bo.getPageSource());
		
		// navigation commands  
		bo.navigate().to("https://www.redbus.in/");
		bo.navigate().back();
		bo.navigate().forward();
		bo.navigate().refresh();
		
		
		//navigation commands
		bo.navigate().to("https://www.adidas.co.in/");
		bo.navigate().back();
		bo.navigate().forward();
		bo.navigate().refresh();
	}

}
