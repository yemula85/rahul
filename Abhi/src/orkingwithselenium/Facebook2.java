package orkingwithselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\driver\\chromedriver_win32 (1)\\chromedriver.exe");		 
		WebDriver bo= new ChromeDriver();
		
		bo.get("https://www.facebook.com/");
		bo.findElement(By.xpath("//input[@id='email']")).sendKeys("y.abhijityemula85@gmail.com");
		bo.findElement(By.xpath("//input[@id='pass']")).sendKeys("Yemula@123");
		bo.findElement(By.xpath("//input[@id='u_0_b']")).click();


		

	}
}
