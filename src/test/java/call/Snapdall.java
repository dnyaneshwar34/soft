package call;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdall {
	WebDriver driver;
	
  @Test
  public void verifysnadeal() {
	  WebDriverManager.chromedriver().setup();
	  
	  driver = new ChromeDriver();
	  
	  driver.get("https://www.snapdeal.com/");
	  driver.manage().deleteAllCookies();
	  driver.close();
  }
}
