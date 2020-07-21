package orkingwithselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\driver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver bo=new ChromeDriver();
		
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		System.out.println(bo.getTitle());
		
		bo.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		bo.findElement(By.name("txtPassword")).sendKeys("lab1");
		bo.findElement(By.name("Submit")).click();
		bo.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
		
		System.out.println(bo.getTitle());
		if(bo.getTitle().equals("OrangeHRM - New Level of HR Management")) {
		System.out.println("pass");	
		
		}
		
		else {
			System.out.println("fail");
		}
		bo.close();
		
		
		
	}

}
