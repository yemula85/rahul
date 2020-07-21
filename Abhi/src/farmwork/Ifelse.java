package farmwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\driver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver bo=new ChromeDriver();
		
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.name("txtUserName")).sendKeys("");
		bo.findElement(By.name("txtPassword")).sendKeys("");
		bo.findElement(By.name("Submit")).click();
		System.out.println(bo.switchTo().alert().getText());
		
		if(bo.switchTo().alert().getText().equals("User Name not given!")) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("fail");
		}
		bo.switchTo().alert().accept();
		bo.close();
		}
    
	
}
