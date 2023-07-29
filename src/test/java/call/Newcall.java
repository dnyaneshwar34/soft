package call;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Newcall {
	
	WebDriver driver;
	
	
  @Test
  public void verifycall() {
	  
	  WebDriverManager.chromedriver().setup();
	  
	  driver.get("https://www.ajio.com/");
	  
	  driver.manage().deleteAllCookies();
	  driver.close();
	  
  }
  
  
  
}
