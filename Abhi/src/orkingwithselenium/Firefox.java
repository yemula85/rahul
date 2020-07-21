package orkingwithselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\driver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		 
		WebDriver bo= new FirefoxDriver();
		//enter build path in bowers addres
		
		
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		//enter valid value vale in user text field 
		bo.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		// enter user id value in user text field
        bo.findElement(By.name("txtPassword")).sendKeys("lab1");
        // click on longing button
        bo.findElement(By.name("Submit")).click();
        
        //bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]")).click();
        //bo.findElement(By.xpath("//span[contains(text(),'Employee List')]")).click();
        //bo.findElement(By.xpath("//span[contains(text(),'Email Notifications')]")).click();
        //bo.findElement(By.xpath("//li[@id='admin']//li[2]//ul[1]//li[1]//a[1]")).click();
        // click on logout
        //bo.findElement(By.linkText("Logout")).click();
        
        bo.findElement(By.partialLinkText("Log")).click();
        
        
	}

}
