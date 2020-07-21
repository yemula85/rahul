package netfilx1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflixlog {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver bo =new ChromeDriver();
		bo.get("https://www.netflix.com/in/");
		bo.findElement(By.xpath("//a[@class='authLinks redButton']")).click();
		bo.findElement(By.xpath("//input[@id='id_userLoginId']")).sendKeys("y.abhijityemula85@gmail.com");
		bo.findElement(By.xpath("//input[@id='id_password']")).sendKeys("Tinku123");
		bo.findElement(By.xpath("//button[@id='id_password_toggle']")).click();
		bo.findElement(By.xpath("//div[@class='ui-binary-input login-remember-me']//label")).click();
		bo.findElement(By.xpath("//button[@class='btn login-button btn-submit btn-small']")).click();
		bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[1]/a[1]/span[1]")).click();
		
	}

}
