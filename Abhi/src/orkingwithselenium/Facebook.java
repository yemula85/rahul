package orkingwithselenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\driver\\chromedriver_win32 (1)\\chromedriver.exe");		 

		WebDriver bo=new ChromeDriver();
	 bo.get("https://github.com/bsadar/sadar/blob/master/HMRs/src/datataypes/Datatype.java");
	 
		  
	}

}
