package orkingwithselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\driver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver bo=new ChromeDriver();
		
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		bo.findElement(By.name("txtPassword")).sendKeys("abhi");
		bo.findElement(By.name("Submit")).click();
		 
		bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();
		System.out.println(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText());
		
		if(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText().equals("Invalid Login")) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("fail");
			
		}
		bo.close();
	}
	

}
