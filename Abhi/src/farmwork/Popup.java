package farmwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\driver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver bo=new ChromeDriver();
		
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.name("txtUserName")).sendKeys("");
		bo.findElement(By.name("txtPassword")).sendKeys("");
		bo.findElement(By.name("Submit")).click();
		System.out.println(bo.switchTo().alert().getText());
		bo.switchTo().alert().accept();
		bo.close();
	}
     
}
