package call;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Newcall {
	
	WebDriver driver;
	
	
  @Test
  public void verifycall() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.ajio.com/");
	  
	  driver.manage().deleteAllCookies();
	  driver.quit();
	  
  }
  
  
  
}
