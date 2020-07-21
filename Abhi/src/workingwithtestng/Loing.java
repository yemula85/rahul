package workingwithtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Loing {
  @Test
  public void testcase1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\driver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver bo=new ChromeDriver();
		// this is code
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		bo.findElement(By.name("txtPassword")).sendKeys("lab1");
		bo.findElement(By.name("Submit")).click();
		
		System.out.println(bo.getTitle());
		//if(bo.getTitle().equals("OrangeHRM"))
		Assert.assertEquals(bo.getTitle(),"OrangeHRM" );
		bo.close();
		
	  }     
  @Test
  public void testcase2(){ 
  
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\driver\\chromedriver_win32 (1)\\chromedriver.exe");

	WebDriver bo=new ChromeDriver();
	
	bo.get("http://apps.qaplanet.in/hrm/login.php");
	System.out.println(bo.getTitle());
	
	bo.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	bo.findElement(By.name("txtPassword")).sendKeys("lab1");
	bo.findElement(By.name("Submit")).click();
	bo.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	
	
	System.out.println(bo.getTitle());
	//if(bo.getTitle().equals("OrangeHRM - New Level of HR Management"))
	Assert.assertEquals(bo.getTitle(),"OrangeHRM - New Level of HR Management" );
	bo.close();
	  
  }
  
  @Test
  public void testcase3() {
	  
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\driver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver bo=new ChromeDriver();
	
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		bo.findElement(By.name("txtPassword")).sendKeys("abhi");
		bo.findElement(By.name("Submit")).click();
		 
		bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();
		System.out.println(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText());
		//if(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText().equals("Invalid Login"))
		//Assert.assertEquals(bo.findElement(By.xpath("font[contains(text(),'Invalid Login")),"Invalid Login");
	     Assert.assertEquals(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(), "Invalid Login");
	     bo.close();
	  }
       
  @Test
  public void testcase4() {
	  
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver bo=new ChromeDriver();
		
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.name("txtUserName")).sendKeys("yemula");
		bo.findElement(By.name("txtPassword")).sendKeys("abhi1");
		bo.findElement(By.name("Submit")).click();
		
	    bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();
	    System.out.println(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText());
	    
	    //if(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText().equals("Invalid Login"))
         Assert.assertEquals(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(),"Invalid Login");
	    
		bo.close(); 
  }
  @Test
  public void testcase5() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\driver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver bo=new ChromeDriver();
		
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.name("txtUserName")).sendKeys("yemula");
		bo.findElement(By.name("txtPassword")).sendKeys("lab1");
		bo.findElement(By.name("Submit")).click();
		
		bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();
		System.out.println(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText());
		
		//if(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText().equals("Invalid Login")){
		Assert.assertEquals(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(), "Invalid Login");
		
		bo.close();
	  
  }
  
  }
  

